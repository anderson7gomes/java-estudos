import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		try (FileInputStream fileInput = 
			     new FileInputStream("teste.txt")) {
					
			int spaceAvailable = fileInput.available();

			System.out.println("Bytes available is file: " + 
					spaceAvailable);

			int counter = 0;
			int b;

			while ((b = fileInput.read()) != -1) {
				
				System.out.printf("%c ", (char) b);

				if (++counter % 5 == 0) {
					System.out.println();
				}

			}		

		}

	} // end main method

} // end FileInputStreamDemo class