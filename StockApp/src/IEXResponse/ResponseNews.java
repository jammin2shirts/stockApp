package IEXResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseNews {

	@JsonProperty("datetime")
	private String datetime;
	
	@JsonProperty("headline")
	private String headline;
	
	@JsonProperty("source")
	private String source;
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("summary")
	private String summary;
	
	@JsonProperty("related")
	private String related;
	
	@JsonProperty("image")
	private String image;
	
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getRelated() {
		return related;
	}
	public void setRelated(String related) {
		this.related = related;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	

}
