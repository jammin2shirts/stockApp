package daily;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import Utils.APIUtil;

public class DailyChartService {

	public DailyChartService() {}
	
	public void retrieveDataFor(String stockSymbol, String timeseries) {
		APIUtil apiUtil = new APIUtil();
		ObjectMapper mapper = new ObjectMapper();
		String IexTradingUrl = "https://api.iextrading.com/1.0/stock/"+stockSymbol+"/chart/" +timeseries;
		DailyStockEntity[] dailyStockResponse = null;
		
		try {
			String IexTradingResponse = apiUtil.callUrl(IexTradingUrl);
			dailyStockResponse = mapper.readValue(IexTradingResponse, DailyStockEntity[].class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<DailyStockEntity> dailyStockList = new ArrayList<>(Arrays.asList(dailyStockResponse));	
		removeBadData(dailyStockList);
		
//		DailySupportLogic.findBestDaysOfTheWeek(stockPITList);
		List<DailyStockEntity> reversalsList = DailyVPatternLogic.findReversals(dailyStockList);
		List<DailyStockEntity> dailyWithVolumes = DailyVolumeLogic.findFiftyDayMovingAvgs(reversalsList);
		DailyVolumeLogic.findMovingAvgBreaks(dailyWithVolumes);
//		DailyChancesLogic.followupReversalChances(dailyStockList, 10);
		
	}

	private void removeBadData(List<DailyStockEntity> stockPITList) {
		Iterator<DailyStockEntity> iterator = stockPITList.iterator();
		while (iterator.hasNext()) {
			DailyStockEntity stockPIT = iterator.next();
			if (stockPIT.getClose() <= 0 || stockPIT.getHigh() <= 0 || stockPIT.getOpen() <= 0) {
				iterator.remove();
			}
		}
	}
}
