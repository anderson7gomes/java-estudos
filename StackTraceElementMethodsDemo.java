class StackTraceElementMethodsDemo {

	public static void main(String[] args) {
	
		try {
			foo();
		} catch (Exception e) {
		
			StackTraceElement[] traceElements = e.getStackTrace();
			
			for (StackTraceElement element : traceElements) {
				
				System.out.printf("%s\n%s\n%s\n\n", element.getClassName(), 
						element.getFileName(), element.getLineNumber());	
				
			}
		
		}
	
	} // end main method

	static void foo() {
	
		throw new RuntimeException();
	
	} // end foo method

} // end StackTraceElementMethodsDemo class


