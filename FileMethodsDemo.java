import java.io.File;

class FileMethodsDemo {
	
	public static void main(String[] args) {
		
		File file = new File("teste.txt");

		if (file.exists()) {
			
			System.out.println("Writable: " + file.canWrite());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Executable: " + file.canExecute());

			System.out.println("Absolute path: " + 
					file.getAbsolutePath());

			System.out.println("Is Absolute: " + file.isAbsolute());
			
			System.out.println("Is File: " + file.isFile());
			
			file.setReadOnly();
			
			System.out.println("Writable: " + file.canWrite());		

		} else {
			System.out.println("File not exists");
		}

	} // end main method

} // end FileMethodsDemo class