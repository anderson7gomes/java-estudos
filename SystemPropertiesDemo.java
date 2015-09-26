class SystemPropertiesDemo {
	
	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		String lineSeparator = System.getProperty("file.separator");
		String osVersion = System.getProperty("os.version");
		String javaVendor = System.getProperty("java.vendor");
		String javaVersion = System.getProperty("java.version");

		System.out.println(osName);
		System.out.println(lineSeparator);
		System.out.println(osVersion);
		System.out.println(javaVendor);
		System.out.println(javaVersion);

	} // end main method

} // end EnvironmentVariablesDemo class