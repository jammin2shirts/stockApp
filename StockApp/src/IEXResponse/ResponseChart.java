package IEXResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseChart {

	@JsonProperty("date")
	private String date;

	@JsonProperty("open")
	private String open;

	@JsonProperty("high")
	private String high;

	@JsonProperty("low")
	private String low;

	@JsonProperty("close")
	private String close;

	@JsonProperty("volume")
	private String volume;

	@JsonProperty("unadjustedVolume")
	private String unadjustedVolume;

	@JsonProperty("change")
	private String change;

	@JsonProperty("changePercent")
	private String changePercent;

	@JsonProperty("vwap")
	private String vwap;

	@JsonProperty("label")
	private String label;

	@JsonProperty("changeOverTime")
	private String changeOverTime;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getUnadjustedVolume() {
		return unadjustedVolume;
	}

	public void setUnadjustedVolume(String unadjustedVolume) {
		this.unadjustedVolume = unadjustedVolume;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public String getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(String changePercent) {
		this.changePercent = changePercent;
	}

	public String getVwap() {
		return vwap;
	}

	public void setVwap(String vwap) {
		this.vwap = vwap;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getChangeOverTime() {
		return changeOverTime;
	}

	public void setChangeOverTime(String changeOverTime) {
		this.changeOverTime = changeOverTime;
	}
	
	
	
}