class FloatMethodsDemo {

	public static void main(String[] args) {
	
		Float f1 = new Float(45.6);
		Float f2 = new Float(56.3f);
		Float f3 = new Float("34.8");
		
		print(f1);
		print(f2);
		print(f3);
		
		print(Float.MAX_VALUE);
		print(Float.MIN_VALUE);
		print(Float.NaN);
		print(Float.POSITIVE_INFINITY);
		print(Float.NEGATIVE_INFINITY);
		
		System.out.println(Float.isFinite((float) (1/0.)));
		System.out.println(Float.isNaN((float) (0/0.)));
		
		Float f4 = Float.valueOf(3.145f);
		Float f5 = Float.valueOf("5.23");
		
		print(f4);
		print(f5);
	
	} // end main method
	
	static void print(Float f) {
	
		System.out.println(f.toString());
	
	} // end print method

} // end FloatMethodsDemo class
