package daily;

import java.util.List;

public class DailyHypotheticalLogic {

	public static void avgTimeForReturnPercentage(double percentage, List<DailyStockEntity> retrievedStockData) {
		int overallDays = 0;
		for (int i = 0; i < retrievedStockData.size() - 1; i++) {
			DailyStockEntity boughtStock = retrievedStockData.get(i);
			double boughtPrice = boughtStock.getOpen();
			
			for (int x = i; x < retrievedStockData.size(); x++) {
				overallDays++;
				DailyStockEntity comparableStock = retrievedStockData.get(x);
				
				if (boughtPrice * percentage <= comparableStock.getHigh()) {
					break;
				}
				
			}
		}
		
		System.out.println("Avg days to reach 5% gain is: " + overallDays/retrievedStockData.size());
		
	}
}
