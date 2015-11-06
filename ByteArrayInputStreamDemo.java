import java.io.ByteArrayInputStream;

class ByteArrayInputStreamDemo {
	
	public static void main(String[] args) {
		
		String alphabet = "abc";

		ByteArrayInputStream arrayInput = 
				new ByteArrayInputStream(alphabet.getBytes());
		         	
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

	} // end main method

} // end ByteArrayInputStreamDemo class