package IEXResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseQuote {

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("companyName")
	private String companyName;
	
	@JsonProperty("primaryExchange")
	private String primaryExchange;
	
	@JsonProperty("sector")
	private String sector;
	
	@JsonProperty("calculationPrice")
	private String calculationPrice;
	
	@JsonProperty("open")
	private String open;
	
	@JsonProperty("openTime")
	private String openTime;
	
	@JsonProperty("close")
	private String close;

	@JsonProperty("closeTime")
	private String closeTime;
	
	@JsonProperty("high")
	private String high;
	
	@JsonProperty("low")
	private String low;
	
	@JsonProperty("latestPrice")
	private String latestPrice;
	
	@JsonProperty("latestSource")
	private String latestSource;

	@JsonProperty("latestTime")
	private String latestTime;
	
	@JsonProperty("latestUpdate")
	private String latestUpdate;
	
	@JsonProperty("latestVolume")
	private String latestVolume;
	
	@JsonProperty("delayedPrice")
	private String delayedPrice;
	
	@JsonProperty("delayedPriceTime")
	private String delayedPriceTime;
	
	@JsonProperty("extendedPrice")
	private String extendedPrice;
	
	@JsonProperty("extendedChange")
	private String extendedChange;

	@JsonProperty("extendedChangePercent")
	private String extendedChangePercent;

	@JsonProperty("extendedPriceTime")
	private String extendedPriceTime;

	@JsonProperty("previousClose")
	private String previousClose;

	@JsonProperty("change")
	private String change;

	@JsonProperty("changePercent")
	private String changePercent;

	@JsonProperty("avgTotalVolume")
	private String avgTotalVolume;

	@JsonProperty("marketCap")
	private String marketCap;

	@JsonProperty("peRatio")
	private String peRatio;

	@JsonProperty("week52High")
	private String week52High;

	@JsonProperty("week52Low")
	private String week52Low;

	@JsonProperty("ytdChange")
	private String ytdChange;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPrimaryExchange() {
		return primaryExchange;
	}

	public void setPrimaryExchange(String primaryExchange) {
		this.primaryExchange = primaryExchange;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCalculationPrice() {
		return calculationPrice;
	}

	public void setCalculationPrice(String calculationPrice) {
		this.calculationPrice = calculationPrice;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
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

	public String getLatestPrice() {
		return latestPrice;
	}

	public void setLatestPrice(String latestPrice) {
		this.latestPrice = latestPrice;
	}

	public String getLatestSource() {
		return latestSource;
	}

	public void setLatestSource(String latestSource) {
		this.latestSource = latestSource;
	}

	public String getLatestTime() {
		return latestTime;
	}

	public void setLatestTime(String latestTime) {
		this.latestTime = latestTime;
	}

	public String getLatestUpdate() {
		return latestUpdate;
	}

	public void setLatestUpdate(String latestUpdate) {
		this.latestUpdate = latestUpdate;
	}

	public String getLatestVolume() {
		return latestVolume;
	}

	public void setLatestVolume(String latestVolume) {
		this.latestVolume = latestVolume;
	}

	public String getDelayedPrice() {
		return delayedPrice;
	}

	public void setDelayedPrice(String delayedPrice) {
		this.delayedPrice = delayedPrice;
	}

	public String getDelayedPriceTime() {
		return delayedPriceTime;
	}

	public void setDelayedPriceTime(String delayedPriceTime) {
		this.delayedPriceTime = delayedPriceTime;
	}

	public String getExtendedPrice() {
		return extendedPrice;
	}

	public void setExtendedPrice(String extendedPrice) {
		this.extendedPrice = extendedPrice;
	}

	public String getExtendedChange() {
		return extendedChange;
	}

	public void setExtendedChange(String extendedChange) {
		this.extendedChange = extendedChange;
	}

	public String getExtendedChangePercent() {
		return extendedChangePercent;
	}

	public void setExtendedChangePercent(String extendedChangePercent) {
		this.extendedChangePercent = extendedChangePercent;
	}

	public String getExtendedPriceTime() {
		return extendedPriceTime;
	}

	public void setExtendedPriceTime(String extendedPriceTime) {
		this.extendedPriceTime = extendedPriceTime;
	}

	public String getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(String previousClose) {
		this.previousClose = previousClose;
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

	public String getAvgTotalVolume() {
		return avgTotalVolume;
	}

	public void setAvgTotalVolume(String avgTotalVolume) {
		this.avgTotalVolume = avgTotalVolume;
	}

	public String getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}

	public String getPeRatio() {
		return peRatio;
	}

	public void setPeRatio(String peRatio) {
		this.peRatio = peRatio;
	}

	public String getWeek52High() {
		return week52High;
	}

	public void setWeek52High(String week52High) {
		this.week52High = week52High;
	}

	public String getWeek52Low() {
		return week52Low;
	}

	public void setWeek52Low(String week52Low) {
		this.week52Low = week52Low;
	}

	public String getYtdChange() {
		return ytdChange;
	}

	public void setYtdChange(String ytdChange) {
		this.ytdChange = ytdChange;
	}
	
	
	
}