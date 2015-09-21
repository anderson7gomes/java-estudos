class ByteMethodsDemo {

	public static void main(String[] args) {
	
		print(Byte.MAX_VALUE);
		print(Byte.MIN_VALUE);
		
		Byte b1 = Byte.decode("27");
		byte b2 = Byte.parseByte("13");
		
		print(b1);
		print(b2);
		
		byte b = -34;
		int i1 = Byte.toUnsignedInt(new Byte(b));
		
		System.out.println(i1);
		
		print(Byte.valueOf("127"));
	
	} // end main method

	static void print(Byte b) {
	
		System.out.println(b.toString());
	
	} // end print method

} // end ByteMethodsDemo class
