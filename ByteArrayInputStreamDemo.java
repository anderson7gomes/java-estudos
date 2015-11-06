import java.io.ByteArrayInputStream;
import java.io.IOException;

class ByteArrayInputStreamDemo {
	
	public static void main(String[] args) {
		
		String alphabet = "abc";

		try (ByteArrayInputStream arrayInput = 
			new ByteArrayInputStream(alphabet.getBytes())) {
		         	
		    int in;

		    System.out.print("Lowercase: ");

			while ((in = arrayInput.read()) != -1) {
				System.out.print((char) in);
			}

			arrayInput.reset();
			System.out.println();

			System.out.print("Uppercase: ");

			while ((in = arrayInput.read()) != -1) {
				System.out.print(
					Character.toUpperCase((char) in));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end main method

} // end ByteArrayInputStreamDemo class