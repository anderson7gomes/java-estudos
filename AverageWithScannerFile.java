import java.util.Scanner;
import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;

class AverageWithScannerFile {
	
	public static void main(String[] args) 
			throws FileNotFoundException {
		
		File file = new File("teste.txt");

		try (Formatter formatter = new Formatter(file)) {

			formatter.format("%f %f %f", 4.0, 4.5, 5.0);

		}

		try (Scanner scanner = new Scanner(file)) {
			
			double sum = 0.0;
			int counter = 0;

			while (scanner.hasNextDouble()) {
			
				sum += scanner.nextDouble();
				++counter;

			}

			System.out.printf("Average: %f\n", sum / counter);
		
		}

	} // end main method

} // end AverageWithScannerFile class