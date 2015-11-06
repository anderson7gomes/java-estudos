import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo {
	
	public static void main(String[] args) {
		
		File file = new File("output.txt");

		try (FileOutputStream fileOutput = 
			     new FileOutputStream(file, true)) {

			String str = "My name is Anderson";
		
			byte[] byteArray = str.getBytes();

			fileOutput.write(byteArray);
		
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}		

	} // end main method

} // end FileOutputStreamDemo class