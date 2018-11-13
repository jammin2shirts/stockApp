import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockResponse {


	@JsonProperty("Meta Data")
	private MetaData metaData;
	
	@JsonProperty("Time Series (5min)")
	private HashMap<String, StockEntity> timeSeries;

	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	public HashMap<String, StockEntity> getTimeSeries() {
		return timeSeries;
	}

	public void setTimeSeries(HashMap<String, StockEntity> timeSeries) {
		this.timeSeries = timeSeries;
	}
}
