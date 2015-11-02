import java.util.IntSummaryStatistics;
import java.util.Random;

class IntSummaryStatisticsDemo {
	
	public static void main(String[] args) {
		
		IntSummaryStatistics summary = 
				new IntSummaryStatistics();

		Random random = new Random();

		for (int i = 1; i <= 4; i++) {
			
			int number = 1 + random.nextInt(4);

			System.out.printf("Adding %s\n", number);

			summary.accept(number);

		}

		System.out.printf("Max: %d\n", summary.getMax());
		System.out.printf("Min: %d\n", summary.getMin());
		System.out.printf("Sum: %d\n", summary.getSum());
		System.out.printf("Count: %d\n", summary.getCount());
		System.out.printf("Average: %.2f\n", summary.getAverage());

	} // end main method

} // end IntSummaryStatiticsDemo class