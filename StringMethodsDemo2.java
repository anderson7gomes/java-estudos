class StringMethodsDemo2 {

	public static void main(String[] args) {
	
		byte[] bytes = "ABC".getBytes();
		
		System.out.println("bytes content:");

		for (byte b : bytes) {
			System.out.printf("%d ", b);
		}
		
		if ("Anderson".regionMatches(true, 0, "and", 0, 3)) {
			System.out.println("\nmatches");
		}
		
		System.out.printf("\n\"Gomes\" %sstarts with Go\n", 
				("Gomes".startsWith("Go")) ? "" : "don't ");
				
		System.out.printf("\"Gomes\" %sends with Go\n", 
				("Gomes".endsWith("Go")) ? "" : "don't ");		
				
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = "JAva";
		String str4 = "JaVa";		
				
		System.out.printf("%s equals %s -> %b\n", str1, str2, 
				str1.equals(str2));
		
		System.out.printf("%s equals (ignore case) %s -> %b\n", str1, str2, 
				str1.equalsIgnoreCase(str2));
		
		System.out.printf("%s equals %s -> %s\n", str3, str4, 
				(str3.compareTo(str4) == 0) ? "true" : "false");
	
		System.out.printf("%s equals (ignore case) %s -> %s\n", str3, str4, 
				(str3.compareToIgnoreCase(str4) == 0) ? "true" : "false");
		
	} // end main method

} // end StringMethodsDemo2 class
