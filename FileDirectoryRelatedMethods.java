import java.io.File;

class FileDirectoryRelatedMethods {
	
	public static void main(String[] args) {
		
		File file = new File("directory_demo");

		if (file.isDirectory()) {
			
			System.out.println("List of files:");

			for (String name : file.list()) {
				System.out.println(name);
			}

		}

	} // end main method

} // end FileDirectoryRelatedMethods class