class IntegerMethodsDemo {

	public static void main(String[] args) {
	
		Integer i1 = new Integer("42");
		print(i1);
		
		Integer i2 = Integer.decode("23");
		print(i2);
		
		System.out.println(Integer.toBinaryString(i1));
			
		print(Integer.highestOneBit(i1));
		print(Integer.lowestOneBit(i1));
		
		print(Integer.numberOfLeadingZeros(i1));
		print(Integer.numberOfTrailingZeros(i1));
		
		print(Integer.signum(i2));
		
		i1 = Integer.rotateLeft(i1, 2);
		
		System.out.println(Integer.toBinaryString(i1));
	
	} // end main method
	
	static void print(Integer i) {
	
		System.out.println(i);
	
	} // end print method

} // end IntegerMethodsDemo class
