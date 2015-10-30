import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ScannerMethodsDemo {
	
	public static void main(String[] args) 
			throws FileNotFoundException {
		
		String str = "Anderson Gomes 21";

		Scanner scannerStr = new Scanner(str);

		Scanner scannerFile = new Scanner(
				new File("formatted.txt"));

		String firstName = scannerStr.next();
		String lastName = scannerStr.next();
		int age = scannerStr.nextInt();
		
		System.out.printf("%s %s %d\n", firstName,
				lastName, age);		

		while (scannerFile.hasNext()) {
			System.out.println(scannerFile.next());
		}		

		System.out.println(scannerFile);

		String str2 = "22 Andrade 23";

		Scanner scannerStr2 = new Scanner(str2);

		while (scannerStr2.hasNextInt()) {
			System.out.println(scannerStr2.nextInt());
		}

		scannerFile.close();
		scannerStr.close();

	} // end main method

} // end ScannerMethodsDemo class