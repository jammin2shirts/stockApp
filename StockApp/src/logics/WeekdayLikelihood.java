package logics;

public class WeekdayLikelihood {

	private String weekday;
	private double numberOfTimes;
	private double percent;

	public WeekdayLikelihood() {}
	public WeekdayLikelihood(String weekday, double numberOfTimes, double percent) {
		this.weekday = weekday;
		this.numberOfTimes = numberOfTimes;
		this.percent = percent;
	}
	
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	public double getNumberOfTimes() {
		return numberOfTimes;
	}
	public void setNumberOfTimes(double numberOfTimes) {
		this.numberOfTimes = numberOfTimes;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	
}
