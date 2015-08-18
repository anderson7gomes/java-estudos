import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile {

	public static void main(String[] args) throws IOException {
	
		if (args.length != 2) {
			
			System.out.println("Usage: copy from to");
			System.exit(1);
			
		}
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		try {
		
			inputStream = new FileInputStream(args[0]);
			outputStream = new FileOutputStream(args[1]);
	
			int in; // armazena os caracteres do arquivo de input
	
			do {
			
				in = inputStream.read();
				
				if (in != -1) {
					outputStream.write(in);
				}
			
			} while (in != -1);
	
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} finally {
		
			try {
		
				if (inputStream != null) {
					inputStream.close();
				}
			
			} catch (IOException e) {
				System.err.println("Error closing file " + args[0]);
			}
			
			try {
			
				if (outputStream != null) {
					outputStream.close();
				}
			
			} catch (IOException e) {
				System.err.println("Error closing file " + args[1]);
			}
			
		}
	
	} // end main method

} // end CopyFile class
