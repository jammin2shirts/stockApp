package logics;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import daily.DailyStockEntity;

public class DailySupportLogic {

	public static void findSupports(List<DailyStockEntity> stockPITList, double marginPercentage) {
		double highestHigh = stockPITList.get(0).getHigh();
		double lowestLow = stockPITList.get(0).getLow();
		for (DailyStockEntity stock : stockPITList) {
			if (highestHigh < stock.getHigh()) {
				highestHigh = stock.getHigh();
			} else if (lowestLow > stock.getLow()) {
				lowestLow = stock.getLow();
			}
		}

		float coeff = 4f;
		double lowestRounded = Math.round(lowestLow * coeff) / coeff;
		double highestRounded = Math.round(highestHigh * coeff) / coeff;

		List<DailyStockEntity> possibleSupports = new ArrayList<>();
		int listSize = stockPITList.size();
		for (int comparableStockPosition = 0; comparableStockPosition < listSize; comparableStockPosition++) {
			DailyStockEntity comparableStock = stockPITList.get(comparableStockPosition);

			int otherStockPosition = listSize + 1;
			if (otherStockPosition >= listSize) {
				System.out.println("End of list");
				continue;
			}

			DailyStockEntity otherStock = stockPITList.get(otherStockPosition);
			if (isPossibleSupport(comparableStock, otherStock)) {
				possibleSupports.add(comparableStock);
			}

			List<Double> supports = new ArrayList<>();
			for (int i = 0; i < possibleSupports.size(); i++) {
				DailyStockEntity stock = possibleSupports.get(i);
				double supportAverage = 0;

				if (stock.getClose() > stock.getOpen()) {
					supportAverage = stock.getHigh();
				} else if (stock.getClose() < stock.getOpen()) {
					supportAverage = stock.getLow();
				}

				if (supports.isEmpty()) {
					supports.add(supportAverage);
				} else {
					Iterator<Double> supportIterator = supports.iterator();
					for (Double support : supports) {
						double oneHalfPercent = support * .015;

						if ((support > supportAverage && support < supportAverage + oneHalfPercent)
								|| (support < supportAverage && support > supportAverage - oneHalfPercent)) {
							System.out.println("Reaffirmed Support: " + support);
						} else {
							supports.add(supportAverage);
						}
					}
				}
			}

		}
	}

	private static boolean isPossibleSupport(DailyStockEntity comparableStock, DailyStockEntity otherStock) {
		if (comparableStock.getClose() > comparableStock.getOpen() && otherStock.getClose() < otherStock.getOpen()) {
			return true;
		} else if (comparableStock.getClose() < comparableStock.getOpen()
				&& otherStock.getClose() > otherStock.getOpen()) {
			return true;
		} else if (comparableStock.getClose() == comparableStock.getOpen()) {
			return true;
		}
		return false;
	}

	public static void findBestDaysOfTheWeek(List<DailyStockEntity> stockPITList) {
		//Taking the first 5 days for the last month
		//calculate the average high and low
		// then loop through the dataset and see which stocks break through either the high or low average(support)
		HashMap<String, Integer> dayMap = new HashMap<>();
//		dayMap.put("Monday", 0);
//		dayMap.put("Tuesday", 0);
//		dayMap.put("Wednesday", 0);
//		dayMap.put("Thursday", 0);
//		dayMap.put("Friday", 0);
		dayMap.put("Bull Monday", 0);
		dayMap.put("Bull Tuesday", 0);
		dayMap.put("Bull Wednesday", 0);
		dayMap.put("Bull Thursday", 0);
		dayMap.put("Bull Friday", 0);
		dayMap.put("Bear Monday", 0);
		dayMap.put("Bear Tuesday", 0);
		dayMap.put("Bear Wednesday", 0);
		dayMap.put("Bear Thursday", 0);
		dayMap.put("Bear Friday", 0);
		
		for (DailyStockEntity stock : stockPITList) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(Date.valueOf(stock.getDate()));
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			String day = "";
			switch (dayOfWeek) {
			case 2:
				day="Monday";
				break;
			case 3:
				day="Tuesday";
				break;
			case 4:
				day="Wednesday";
				break;
			case 5:
				day="Thursday";
				break;
			case 6:
				day="Friday";
				break;
			}
			
			//sort by day count and if it posted gains or losses
			
			dayMap.get(day);
			Iterator<Entry<String, Integer>> iterator = dayMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<String, Integer> map = iterator.next();
				String key = map.getKey();
				Integer value = map.getValue();
				String bullish = "Bull " + day;
				String bearish = "Bear " + day;
				
//				if (key.equals(day)) {
//					map.setValue(value + 1);
//				} else
					if (key.equals(bullish) && stock.getOpen() < stock.getClose())	{
					map.setValue(value + 1);										
				} else if (key.equals(bearish) && stock.getOpen() > stock.getClose())	{
					map.setValue(value + 1);
				}
			}	
		}
		
		Iterator<Entry<String, Integer>> iteratorFinal = dayMap.entrySet().iterator();
		List<WeekdayLikelihood> weekdayLikelihoods = new ArrayList<>();
		while (iteratorFinal.hasNext()) {
			Entry<String, Integer> map = iteratorFinal.next();
			String key = map.getKey();
			double value = map.getValue().doubleValue();
			//System.out.println("Weekday: " + key + ", Times: " + value + ", Percent Likelihood: " + (value/stockPITList.size())*100);
			
			WeekdayLikelihood weekday = new WeekdayLikelihood(key, value, (value/stockPITList.size())*100);
			weekdayLikelihoods.add(weekday);	
		}
		
		for (WeekdayLikelihood weekday: weekdayLikelihoods) {
			System.out.println("Weekday: " + weekday.getWeekday() + ", Times: " + weekday.getNumberOfTimes() + ", Percent Likelihood: " + weekday.getPercent());
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}