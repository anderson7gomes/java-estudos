import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class ReadingConsole {

	public static void main(String[] args) throws IOException {
	
		readingCharacters();
		readingStrings();

	} // end main method

	static void readingCharacters() throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("Digite os caracteres, 'q' para encerrar");
		
		char c;
		
		do {
		
			c = (char) br.read();
			System.out.println(c); 
		
		} while (c != 'q');

	} // end readingCharacters method
	
	static void readingStrings() throws IOException {
	
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
		System.out.println("Digite as strings separadas por ENTER, " + 
				"\"quit\" para encerrar");
				
		String line;
		
		do {
		
			line = br.readLine();
			System.out.println(line);
		
		} while (!line.equals("quit"));				
	
	} // end readingStrings method

} // end ReadingConsole class
