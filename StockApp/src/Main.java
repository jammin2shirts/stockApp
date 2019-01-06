import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import daily.DailyChartService;
import daily.DailyStockEntity;
import logics.DailyHypotheticalLogic;
import logics.DailyVPatternLogic;
import logics.DailyVolumeLogic;

public class Main {

	public static void main(String[] args) throws IOException {
		startStockApp();
	}

	public static void startStockApp() {
		DailyChartService dailyChartService = new DailyChartService();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter stock to research: ");
		String symbol = scanner.nextLine();
		System.out.print("Enter an acceptable timeSeries (1d, 1m, 3m, 6m, ytd, 1y, 2y, 5y): ");
		String timeSeries = scanner.nextLine();

		List<DailyStockEntity> retrievedStockData = dailyChartService.retrieveDataFor(symbol, timeSeries);

		reviewDatapoints(retrievedStockData);

//		DailySupportLogic.findBestDaysOfTheWeek(stockPITList);
//		List<DailyStockEntity> reversalsList = DailyVPatternLogic.findReversals(retrievedStockData);
//		List<DailyStockEntity> dailyWithVolumes = DailyVolumeLogic.findFiftyDayMovingAvgs(retrievedStockData);
//		DailyVolumeLogic.findMovingAvgBreaks(retrievedStockData);
//		DailyChancesLogic.followupReversalChances(dailyStockList, 10);

		scanner.close();
	}

	private static void reviewDatapoints(List<DailyStockEntity> retrievedStockData) {
		Scanner scanner = new Scanner(System.in);
		int end = 0;
		while (end == 0) {


			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("What data point do you wish to review?");
			System.out.println("1. reversals");
			System.out.println("2. volumes");
			System.out.println("3. movAvg");
			System.out.println("4. research another stock");
			System.out.println("5. end program");
			System.out.println("6. avg days to 5% gain");
			System.out.println("7. calculate RSI");
			int dataPointReview = scanner.nextInt();
			System.out.println("");

			switch (dataPointReview) {
			case 1:
				DailyVPatternLogic.findReversals(retrievedStockData);
				break;
			case 2:
				DailyVolumeLogic.findFiftyDayMovingAvgs(retrievedStockData);
				break;
			case 3:
				DailyVolumeLogic.findMovingAvgBreaks(retrievedStockData);
				break;
			case 4:
				startStockApp();
				break;
			case 5:
				end = 5;
				break;
			case 6:
				DailyHypotheticalLogic.avgTimeForReturnPercentage(1.05, retrievedStockData );
				break;
			case 7:
				DailyHypotheticalLogic.calculateRSI(retrievedStockData);
				break;
			}
		}
		scanner.close();
	}

}
