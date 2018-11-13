import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import IEXResponse.ResponseChart;
import IEXResponse.StockIEX;

public class altMain {
	
	public static void main(String[] args) throws IOException {
		String stock = "msft";
//		String url ="https://api.iextrading.com/1.0/stock/"+stock+"/book";
		String url = "https://api.iextrading.com/1.0/stock/aapl/batch?types=quote,news,chart&range=1m&last=10";
		
		URL callableURL;
		callableURL = new URL(url);
		HttpURLConnection con = (HttpURLConnection) callableURL.openConnection();
		con.setRequestMethod("GET");
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = parserJson(con.getInputStream());
		StockIEX response = mapper.readValue(jsonString, StockIEX.class);
		
		for (ResponseChart chart : response.getChart()) {
			System.out.println("close: "+chart.getClose());
		}
		
//		System.out.println(jsonString);
	}
	
	private static StockResponse callStockApi(String url) throws IOException {
		URL callableURL;
		StockResponse stockResponse = null;
		
		try {
			callableURL = new URL(url);
			HttpURLConnection con = (HttpURLConnection) callableURL.openConnection();
			con.setRequestMethod("GET");
			ObjectMapper mapper = new ObjectMapper();
			String jsonString = parserJson(con.getInputStream());
			
			
		} catch (MalformedURLException e){
			e.printStackTrace();
		}
		return stockResponse;
	}

	private static String parserJson(InputStream response) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(response));
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();
		JsonParser parser = new JsonParser();	
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonElement el = parser.parse(content.toString());
		String jsonString = gson.toJson(el);
		 
		return jsonString;
	}

}
