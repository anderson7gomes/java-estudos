class ShortMethodsDemo {

	public static void main(String[] args) {
	
		Short s1 = Short.decode("234");
		print(s1);
		
		print(Short.MAX_VALUE);
		print(Short.MIN_VALUE);
		
		print(Short.parseShort("125"));
		
		print(Short.reverseBytes((byte) 23145));
	
	} // end main method
	
	static void print(Short s) {
	
		System.out.println(s);
	
	} // end print method

} // end ShortMethodsDemo class
