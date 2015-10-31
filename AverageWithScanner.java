import java.util.Scanner;

class AverageWithScanner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double sum = 0;
		int counter = 0;

		while (scanner.hasNext()) {
			
			if (scanner.hasNextDouble()) {
		
				sum += scanner.nextDouble(); 
				++counter;

			} else {
				
				if (!scanner.next().equals("end")) {

					System.out.println("Bad input");
					return;

				} else {
					break;
				}

			}

		}

		System.out.printf("Average: %f\n", sum / counter);

	} // end main method

} // end AverageWithScanner class