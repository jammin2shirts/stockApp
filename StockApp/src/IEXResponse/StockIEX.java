package IEXResponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockIEX {

	@JsonProperty("quote")
	private ResponseQuote quote;

	@JsonProperty("news")
	private List<ResponseNews> news; 
	
	@JsonProperty("chart")
	private List<ResponseChart> chart;

	public ResponseQuote getQuote() {
		return quote;
	}

	public void setQuote(ResponseQuote quote) {
		this.quote = quote;
	}

	public List<ResponseNews> getNews() {
		return news;
	}

	public void setNews(List<ResponseNews> news) {
		this.news = news;
	}

	public List<ResponseChart> getChart() {
		return chart;
	}

	public void setChart(List<ResponseChart> chart) {
		this.chart = chart;
	} 
	
	
	
}
