package logics;
import java.util.ArrayList;
import java.util.List;

import daily.DailyReversalEntity;
import daily.DailyStockEntity;

public class DailyVPatternLogic {
	
	public static List<DailyStockEntity> findReversals(List<DailyStockEntity> dailyStockList) {
			List<DailyStockEntity>  dailyStockReversalList = new ArrayList<>();
			
			for(int i =1; i < dailyStockList.size()-1; i++) {
				DailyStockEntity previous = dailyStockList.get(i-1);
				DailyStockEntity current =  dailyStockList.get(i);
				DailyStockEntity following =  dailyStockList.get(i+1);
				
				if (previous.getHigh() <= current.getHigh()
						&& current.getHigh() >= following.getHigh()) {
					current.setReversal(new DailyReversalEntity("High"));
					System.out.println("Top " + current.getDate());
				} else if (previous.getLow() >= current.getLow()
						&& current.getLow() <= following.getLow()) {
					current.setReversal(new DailyReversalEntity("Low"));
					System.out.println("Bottom " + current.getDate());
				} else {
					current.setReversal(new DailyReversalEntity("None"));
				}
				dailyStockReversalList.add(current);
			}
			return dailyStockReversalList;
	}

}
