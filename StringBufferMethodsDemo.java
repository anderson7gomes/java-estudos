class StringBufferMethodsDemo {
	
	public static void main(String[] args) {
		
		StringBuffer strBuffer = new StringBuffer(23);
		StringBuffer strBuffer2 = 
				new StringBuffer("Hello StringBuffer");

		System.out.println("strBuffer = " + strBuffer.toString());
		System.out.println("strBuffer.length() = " + strBuffer.length());		
		System.out.println("strBuffer.capacity() = " + strBuffer.capacity());

		System.out.println("strBuffer2 = " + strBuffer2.toString());
		System.out.println("strBuffer2.length() = " + strBuffer2.length());		
		System.out.println("strBuffer2.capacity() = " + strBuffer2.capacity());

	} // end main method

} // end StringBufferMethodsDemo class