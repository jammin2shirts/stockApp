import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Main {

	private static final DecimalFormat df = new DecimalFormat("#.0000");
	
	public static void main(String[] args) throws IOException {

		String timeSeries = "TIME_SERIES_INTRADAY";
		String interval = "5min";
		String key = "QP8HO8FJ35949M4";
		String symbol = "MSFT";
		String url = "https://www.alphavantage.co/query?function="+timeSeries+"&symbol="+symbol+"&interval="+interval+"&apikey="+key;
		
		StockResponse response = callStockApi(url);
		double variance = calculateVariance(response);
		findTimesBestToBuyBasedOnVariance(variance, response);
		
	}
	
	private static void findTimesBestToBuyBasedOnVariance(double variance, StockResponse response) {
		NavigableMap<String, StockEntity> myMap = new TreeMap<>();
		myMap.putAll(response.getTimeSeries());
		NavigableMap<String, StockEntity> positiveMovements = new TreeMap<>();
		
		for (Map.Entry<String, StockEntity> current: myMap.entrySet()) {
			Map.Entry<String, StockEntity> next = myMap.higherEntry(current.getKey());
			Map.Entry<String, StockEntity> previous = myMap.lowerEntry(current.getKey());
			
			if (previous == null) {
				continue;
			}
			
			double diffCurrentPrevious =  Double.parseDouble(current.getValue().getClose()) - Double.parseDouble(previous.getValue().getClose());
			
			if ((diffCurrentPrevious * diffCurrentPrevious) <= (variance * variance)) {
				
			} else {
				if (diffCurrentPrevious < 0) {
					
				} else {
					positiveMovements.put(current.getKey(), current.getValue());
				}
			}
		}
		
		for (String time : positiveMovements.keySet()) {
			int streakCounter =0;
			int skipCounter = 0;
			Timestamp stockTime = Timestamp.valueOf(time);
			System.out.println(time);
		}
	}
	
	private static double calculateVariance(StockResponse response) {
		double summedClosedVariance = 0;
		for(StockEntity stock: response.getTimeSeries().values()) {
			summedClosedVariance += Double.parseDouble(stock.getClose());
		}
		
		double mean = summedClosedVariance / response.getTimeSeries().size();
		double summedDiffSquareMean =0;
		for(StockEntity stock: response.getTimeSeries().values()) {
			double diffMean = 0;
			diffMean = Double.parseDouble(stock.getClose()) - mean;
			summedDiffSquareMean += diffMean * diffMean;
		}
		
		double variance = summedDiffSquareMean / response.getTimeSeries().size();
		return variance;
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
			stockResponse = mapper.readValue(jsonString, StockResponse.class);
			for (StockEntity stock : stockResponse.getTimeSeries().values()) {
				
			}
			
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
