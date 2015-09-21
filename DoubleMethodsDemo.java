class DoubleMethodsDemo {

	public static void main(String[] args) {
	
		Double d1 = Double.parseDouble("45.6");
		Double d2 = Double.valueOf("23.6");
		
		print(d1);
		print(d2);
		print(Double.MAX_VALUE);
		print(Double.MIN_VALUE);
		
	} // end main method
	
	static void print(Double d) {
	
		System.out.println(d.toString());
	
	} // end print method 

} // end DoubleMethodsDemo class
