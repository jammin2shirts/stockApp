package daily;
import java.util.ArrayList;
import java.util.List;

public class DailyVPatternLogic {

	public static List<DailyReversalEntity> findReversals(List<DailyStockEntity> dailyStockList) {
		List<DailyReversalEntity> reversals = new ArrayList<>();
		
		for(int i =1; i < dailyStockList.size()-1; i++) {
			DailyReversalEntity reversal = new DailyReversalEntity();
			DailyStockEntity previous = dailyStockList.get(i-1);
			DailyStockEntity current =  dailyStockList.get(i);
			DailyStockEntity following =  dailyStockList.get(i+1);
			
			if (previous.getHigh() <= current.getHigh()
					&& current.getHigh() >= following.getHigh()) {
				reversal.setStock(current);
				reversal.setReversalType("Top");
				reversals.add(reversal);
//				System.out.println("High " + current.getDate());
			} else if (previous.getLow() >= current.getLow()
					&& current.getLow() <= following.getLow()) {
				reversal.setStock(current);
				reversal.setReversalType("Bottom");
				reversals.add(reversal);
//				System.out.println("Low " + current.getDate());
			}
		}
		return reversals;
		
	}

	public static void findReversalsAlternate(List<DailyStockEntity> dailyStockList) {
			
			for(int i =1; i < dailyStockList.size()-1; i++) {
				DailyStockEntity previous = dailyStockList.get(i-1);
				DailyStockEntity current =  dailyStockList.get(i);
				DailyStockEntity following =  dailyStockList.get(i+1);
				
				if (previous.getHigh() <= current.getHigh()
						&& current.getHigh() >= following.getHigh()) {
					current.setReversalType("Top");
	//				System.out.println("Top " + current.getDate());
				} else if (previous.getLow() >= current.getLow()
						&& current.getLow() <= following.getLow()) {
					current.setReversalType("Bottom");
	//				System.out.println("Bottom " + current.getDate());
				}
			}
		
	}

}
