import java.io.IOException;

class RunningAnExternalProcess {

	public static void main(String[] args) {
	
		Runtime runtime = Runtime.getRuntime();
		
		try {
		
			Process p = runtime.exec("gedit");
			int exitValue = p.waitFor();
			
			System.out.println("gedit returned: " + exitValue);
		
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	
	} // end main method

} // end RunningAnExternalProcess class
