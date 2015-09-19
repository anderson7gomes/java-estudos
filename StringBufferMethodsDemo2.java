class StringBufferMethodsDemo2 {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println("sb.capacity() = " + sb.capacity());
		sb.ensureCapacity(35);
		System.out.println("sb.capacity() after ensure capacity = " + 
				sb.capacity());
	
		sb.setLength(50);
	
		System.out.println("sb.capacity() after call setLength(50) = " + 
				sb.capacity());
				
		sb.setCharAt(1, 'i');
		sb.setLength(2);
		
		System.out.println(sb.toString());	
		
		char[] chars = new char[2];
		
		sb.getChars(0, sb.length(), chars, 0);
		
		System.out.println(chars);	
	
		char c = 'a';
		int number = 42;
		
		StringBuffer sb2 = new StringBuffer(20).append(c).append(" = ")
				.append(number + "!");
				
		System.out.println(sb2);	
		
		StringBuffer sb3 = new StringBuffer("I Java!");
		
		sb3.insert(2, "like ");
		
		System.out.println(sb3);	
		
		sb3.reverse();
		
		System.out.println("reversed = " + sb3);
		
		sb3.reverse();
		
		sb3.delete(1, 7);
		sb3.deleteCharAt(0);
		sb3.deleteCharAt(4);
		
		System.out.println("Several changes in \"I like Java!\" string = " + 
				sb3);
		
		StringBuffer sb4 = new StringBuffer("This is a test");

		System.out.println(sb4);
		sb4.replace(5, 7, "was");		
		System.out.println(sb4.toString());
	
	} // end main method

} // end StringBufferMethodsDemo2 class
