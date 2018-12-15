package intraday;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class OneDayChartService {
//
//	public OneDayChartService() {}
//	
//	public void retrieveDataFor(String stockSymbol) {
//		APIUtil apiUtil = new APIUtil();
//		ObjectMapper mapper = new ObjectMapper();
//		String timeseries1DayUrl = "https://api.iextrading.com/1.0/stock/"+stockSymbol+"/chart/1d";
//		OneDayStockEntity[] oneDayStockResponse = null;
//		
//		
//		String timeseries1dayResponse = apiUtil.callUrl(timeseries1DayUrl);
//		oneDayStockResponse = mapper.readValue(timeseries1dayResponse, OneDayStockEntity[].class);
//		List<OneDayStockEntity> stockPITList = new ArrayList<>(Arrays.asList(oneDayStockResponse));
//
//		Iterator<OneDayStockEntity> iterator = stockPITList.iterator();
//		while (iterator.hasNext()) {
//			OneDayStockEntity stockPIT = iterator.next();
//			if (stockPIT.getClose() <= 0 || stockPIT.getHigh() <= 0 || stockPIT.getOpen() <= 0) {
//				iterator.remove();
//			}
//		}
//
////		findPatternV(stockPITList);
//	}
//}
