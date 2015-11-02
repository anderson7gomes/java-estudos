import java.util.Scanner;

class ScannerMethodsDemo2 {

	public static void main(String[] args) {
	
		String str = "Anderson,Gomes,Andrade";
		
		Scanner scanner = new Scanner(str);

		scanner.useDelimiter(",");
		
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		
		scanner.close();
		
		scanner = new Scanner(str);
		
		String found = scanner.findInLine("Gomes");
		
		System.out.println(found + '\n');
		
		scanner.close();

		scanner = new Scanner(str);
		scanner.useDelimiter(",");
		
		scanner = scanner.skip("Anderson");
		
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
	
	} // end main method

} // end ScannerMethodsDemo2 class
