import java.io.File;

class FileDirectoryRelatedMethods {
	
	public static void main(String[] args) {
		
		File file = new File("directory_demo");

		if (file.isDirectory()) {
			
			System.out.println("List of files:");

			for (File f : file.listFiles()) {

				System.out.print(f.getName() + ": ");
				System.out.printf("%s\n", f.isDirectory() ? 
						"directory" : "file");

			}

		}

	} // end main method

} // end FileDirectoryRelatedMethods class