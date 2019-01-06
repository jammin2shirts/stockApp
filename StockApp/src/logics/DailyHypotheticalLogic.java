package logics;

import java.util.List;

import daily.DailyStockEntity;

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
	
	
	public static void calculateRSI(List<DailyStockEntity> retrievedStockData) {
		double rsi =0;
		double firstGains = 0;
		double firstLosses = 0;
		double currentGain = 0;
		double currentLoss = 0;
		
		for (int i = retrievedStockData.size()-14; i < retrievedStockData.size(); i++) {
			DailyStockEntity stock = retrievedStockData.get(i);
			
			if (stock.getOpen() < stock.getClose()) {
				double gains= stock.getClose()/stock.getOpen() - 1;
				firstGains+=gains;
				System.out.println(gains);
			} else if (stock.getOpen() > stock.getClose()) {
				double losses =  stock.getOpen()/stock.getClose() - 1;
				firstLosses+= losses;
				System.out.println(losses);
			}
		}
		
		firstGains = firstGains/14;
		firstLosses = firstLosses/14;
		System.out.println(firstGains);
		System.out.println(firstLosses);
		
		rsi = 100 - (100/ (1+ (firstGains/firstLosses)));
		
		DailyStockEntity lastStock = retrievedStockData.get(retrievedStockData.size()-1);
		if (lastStock.getOpen() < lastStock.getClose()) {
			currentGain+= lastStock.getClose()/lastStock.getOpen()-1;
			System.out.println(currentGain);
		} else if (lastStock.getOpen() > lastStock.getClose()) {
			currentLoss+= lastStock.getOpen()/lastStock.getClose()-1;
			System.out.println(currentGain);
		}
		
		rsi = 100 - (
				100/
				1+(
						((firstGains * 13 + currentGain)/14) /
						((firstLosses * 13 + currentLoss)/14)
						));
		
		
		System.out.println(rsi);
		
	}

}
