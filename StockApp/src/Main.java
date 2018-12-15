import java.io.IOException;

import daily.DailyChartService;

public class Main {

	public static void main(String[] args) throws IOException {

		
		DailyChartService dailyChartService = new DailyChartService();
		dailyChartService.retrieveDataFor("cron", "1m");
//		oneMonthService.retrieveDataFor("cron");
	}
	
	
}
