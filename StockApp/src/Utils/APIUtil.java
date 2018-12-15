package Utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class APIUtil {
	
	public APIUtil() {}
	
	public String callUrl(String url) throws IOException {
		URL callableURL;
		callableURL = new URL(url);
		HttpURLConnection con = (HttpURLConnection) callableURL.openConnection();
		con.setRequestMethod("GET");
		String jsonString = parserJson(con.getInputStream());
		System.out.println(jsonString);

		return jsonString;
	}

	public String parserJson(InputStream response) throws IOException {
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
