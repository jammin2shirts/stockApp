package daily;

import java.util.ArrayList;
import java.util.List;

public class DailyChancesLogic {

	public static void followupReversalChances(List<DailyStockEntity> dailyStockList, int followupSize) {

		for (int i = 0; i < dailyStockList.size(); i++) {
			DailyStockEntity stock = dailyStockList.get(i);

			if ("Top".equals(stock.getReversalType()) || "Bottom".equals(stock.getReversalType())) {
				List<DailyStockEntity> followupStocks = new ArrayList<>();
				double netChange = 0;

				for (int x = 1; x < followupSize + 1; x++) {
					
					if (i + x < dailyStockList.size()) {
						DailyStockEntity nextStock = dailyStockList.get(i + x);
						followupStocks.add(nextStock);
						netChange += nextStock.getChange();

						if ("Top".equals(stock.getReversalType())) {
							System.out.println("Top " + stock.getDate() + ", followup:" + nextStock.getDate()
									+ ", change: " + nextStock.getChange());

						} else if ("Bottom".equals(stock.getReversalType())) {
							System.out.println("Bottom " + stock.getDate() + ", followup:" + nextStock.getDate()
									+ ", change: " + nextStock.getChange());

						}
					}
				}
				
				System.out.println("Net Change: " + netChange);
			}
		}
	}
}
