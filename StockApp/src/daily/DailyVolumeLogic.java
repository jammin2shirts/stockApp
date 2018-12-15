package daily;

import java.util.ArrayList;
import java.util.List;

public class DailyVolumeLogic {

	public static List<DailyStockEntity> findFiftyDayVolumeBreaks(List<DailyStockEntity> dailyStockList) {

		List<DailyStockEntity> movingAvgSubList = new ArrayList<>();
		
//		System.out.println("Checking Moving Avg " + dailyStockList.size());
		for (int toIndex = 50; toIndex < dailyStockList.size(); toIndex++) {
			int fromIndex = toIndex-50;
			movingAvgSubList = dailyStockList.subList(fromIndex, toIndex);
			
			double movingAvg = 0;
			for (DailyStockEntity stock: movingAvgSubList) {
				movingAvg+=stock.getClose();
			}
			
			movingAvg = movingAvg/50;
//			System.out.println("Moving Avg: " + movingAvg);
		}
		
		return dailyStockList;
	}
	
}
