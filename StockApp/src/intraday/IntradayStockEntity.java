package intraday;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IntradayStockEntity {

	@JsonProperty("date")
	private String date;
	@JsonProperty("minute")
	private String minute;
	@JsonProperty("label")
	private String label;
	@JsonProperty("high")
	private double high;
	@JsonProperty("low")
	private double low;
	@JsonProperty("average")
	private double average;
	@JsonProperty("volume")
	private int volume;
	@JsonProperty("notional")
	private String notional;
	@JsonProperty("numberOfTrades")
	private int numberOfTrades;
	@JsonProperty("marketHigh")
	private double marketHigh;
	@JsonProperty("marketLow")
	private double marketLow;
	@JsonProperty("marketAverage")
	private double marketAverage;
	@JsonProperty("marketVolume")
	private int marketVolume;
	@JsonProperty("marketNotional")
	private String marketNotional;
	@JsonProperty("marketNumberOfTrades")
	private int marketNumberOfTrades;
	@JsonProperty("open")
	private double open;
	@JsonProperty("close")
	private double close;
	@JsonProperty("marketOpen")
	private double marketOpen;
	@JsonProperty("marketClose")
	private double marketClose;
	@JsonProperty("changeOverTime")
	private String changeOverTime;
	@JsonProperty("marketChangeOverTime")
	private String marketChangeOverTime;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMinute() {
		return minute;
	}
	public void setMinute(String minute) {
		this.minute = minute;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getNotional() {
		return notional;
	}
	public void setNotional(String notional) {
		this.notional = notional;
	}
	public int getNumberOfTrades() {
		return numberOfTrades;
	}
	public void setNumberOfTrades(int numberOfTrades) {
		this.numberOfTrades = numberOfTrades;
	}
	public double getMarketHigh() {
		return marketHigh;
	}
	public void setMarketHigh(double marketHigh) {
		this.marketHigh = marketHigh;
	}
	public double getMarketLow() {
		return marketLow;
	}
	public void setMarketLow(double marketLow) {
		this.marketLow = marketLow;
	}
	public double getMarketAverage() {
		return marketAverage;
	}
	public void setMarketAverage(double marketAverage) {
		this.marketAverage = marketAverage;
	}
	public int getMarketVolume() {
		return marketVolume;
	}
	public void setMarketVolume(int marketVolume) {
		this.marketVolume = marketVolume;
	}
	public String getMarketNotional() {
		return marketNotional;
	}
	public void setMarketNotional(String marketNotional) {
		this.marketNotional = marketNotional;
	}
	public int getMarketNumberOfTrades() {
		return marketNumberOfTrades;
	}
	public void setMarketNumberOfTrades(int marketNumberOfTrades) {
		this.marketNumberOfTrades = marketNumberOfTrades;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getMarketOpen() {
		return marketOpen;
	}
	public void setMarketOpen(double marketOpen) {
		this.marketOpen = marketOpen;
	}
	public double getMarketClose() {
		return marketClose;
	}
	public void setMarketClose(double marketClose) {
		this.marketClose = marketClose;
	}
	public String getChangeOverTime() {
		return changeOverTime;
	}
	public void setChangeOverTime(String changeOverTime) {
		this.changeOverTime = changeOverTime;
	}
	public String getMarketChangeOverTime() {
		return marketChangeOverTime;
	}
	public void setMarketChangeOverTime(String marketChangeOverTime) {
		this.marketChangeOverTime = marketChangeOverTime;
	}
	
	
}
