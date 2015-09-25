import java.io.IOException

class ProcessBuilderDemo {

	public static void main(String[] args) {
	
		ProcessBuilder processBuilder = new ProcessBuilder("gedit", "file.txt");
		
		try {
			Process process = processBuilder.start();
		} catch (IOException e) {
			
			System.err.println("Error while building process");
			System.exit(0);	
			
		}
	
	} // end main method

} // end ProcessBuilderDemo class
