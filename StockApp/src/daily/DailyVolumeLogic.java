package daily;

import java.util.ArrayList;
import java.util.List;

public class DailyVolumeLogic {

	public static List<DailyStockEntity> findFiftyDayMovingAvgs(List<DailyStockEntity> dailyStockList) {

		List<DailyStockEntity> movingAvgSubList = new ArrayList<>();
		
		System.out.println("Checking Moving Avg " + dailyStockList.size());
		for (int toIndex = 50; toIndex < dailyStockList.size(); toIndex++) {

			DailyStockEntity dailyStock = dailyStockList.get(toIndex);
			int fromIndex = toIndex-50;
			movingAvgSubList = dailyStockList.subList(fromIndex, toIndex);
			
			long movingAvg = 0;
			for (DailyStockEntity stock: movingAvgSubList) {
				movingAvg+=stock.getVolume();
			}
			
			movingAvg = Math.round((movingAvg/50)*100)/100;
			dailyStock.setFiftyDayVolumeMovingAvg(movingAvg);
			System.out.println("Moving Avg: " + movingAvg);
		}
		
		return dailyStockList;
	}

	public static List<DailyStockEntity> findMovingAvgBreaks(List<DailyStockEntity> dailyWithVolumes) {
		for (int i =1; i < dailyWithVolumes.size(); i++) {
			DailyStockEntity previousStock = dailyWithVolumes.get(i-1);
			DailyStockEntity currentStock = dailyWithVolumes.get(i);
			if (currentStock.getVolume() > previousStock.getFiftyDayVolumeMovingAvg() * 1.1 ) {
				System.out.println("Current date, volume: " + currentStock.getDate()+", "+currentStock.getVolume() 
				+ ", is 10% larger than 50 day moving avg:" + (Math.round(previousStock.getFiftyDayVolumeMovingAvg()*100))/100);
				currentStock.setBrokeThroughFiftyDayVolumeMovingAvg(true);
			}
			
			
		}		
		
		return dailyWithVolumes;
	}
	
}
