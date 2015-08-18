import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class ReadingFile {

	public static void main(String[] args) {

		if (args.length != 1) {

			System.out.println("Passe o nome do arquivo como " + 
					"argumento para o programa");
					
			System.exit(1);		

		}
		
		FileInputStream inputStream = null;
		
		try {
		
			inputStream = new FileInputStream(args[0]);
			
			int in; // armazena os caracteres lidos
			
			do {
		
				in = inputStream.read();
			
				if (in != -1 ) {
					System.out.print((char) in);
				}
		
			} while (in != -1);
			
		} catch (FileNotFoundException e) {
		
			System.err.printf("File %s not found\n", args[0]);
			System.exit(1);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		
			try {
			
				if (inputStream != null) {
					inputStream.close();
				}	

			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}

	} // end main method

} // end ReadingFile class
