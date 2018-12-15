package daily;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DailyStockEntity {

	@JsonProperty("date")
	private String date;
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
	@JsonProperty("open")
	private double open;
	@JsonProperty("close")
	private double close;
	@JsonProperty("changeOverTime")
	private double changeOverTime;
	@JsonProperty("unadjustedVolume")
	private int unadjustedVolume;
	@JsonProperty("change")
	private double change;
	@JsonProperty("changePercent")
	private double changePercent;
	@JsonProperty("vwap")
	private double vwap;
	private DailyReversalEntity reversal;

	public DailyReversalEntity getReversal() {
		return reversal;
	}

	public void setReversal(DailyReversalEntity reversal) {
		this.reversal = reversal;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public double getChangeOverTime() {
		return changeOverTime;
	}

	public void setChangeOverTime(double changeOverTime) {
		this.changeOverTime = changeOverTime;
	}

	public int getUnadjustedVolume() {
		return unadjustedVolume;
	}

	public void setUnadjustedVolume(int unadjustedVolume) {
		this.unadjustedVolume = unadjustedVolume;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(double changePercent) {
		this.changePercent = changePercent;
	}

	public double getVwap() {
		return vwap;
	}

	public void setVwap(double vwap) {
		this.vwap = vwap;
	}
}
