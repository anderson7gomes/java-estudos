import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class IntegerOperationsDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("Digite um número para ser dobrado de valor: ");
		String numberAsString = br.readLine();
		
		int squareNumber = Integer.parseInt(numberAsString);
		squareNumber = Integer.rotateLeft(squareNumber, 1);
		
		System.out.println("Resultado: " + squareNumber);
	
	} // end main method

} // end IntegerOperationsDemo class
