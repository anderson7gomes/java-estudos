class StringBufferMethodsDemo3 {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println("sb.capacity() = " + sb.capacity());
		sb.trimToSize();
		System.out.println("sb.capacity() after trimToSize call = " + 
				sb.capacity());
				
		sb.append('!');
		
		System.out.println("sb.capacity() after append a character = " + 
				sb.capacity());		
	
	} // end main method

} // end StringBufferMethodsDemo3 class
