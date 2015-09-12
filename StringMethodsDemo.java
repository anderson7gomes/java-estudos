class StringMethodsDemo {

	public static void main(String[] args) {
	
		char[] chars = {'J', 'a', 'v', 'a'};
		
		String str = new String(chars);
		
		System.out.println(str);
		System.out.printf("str length: %s\n", str.length());
		
		System.out.printf("str.charAt(2): %c\n", str.charAt(2));
	
		char[] chars2 = new char[3];
		
		"Anderson".getChars(0, 3, chars2, 0);
	
		for (int i = 0; i < chars2.length; i++) {
			System.out.printf("chars2[%d]: %c\n", i, chars2[i]);
		}
	
		Box box = new Box(4.0, 3.0, 2.0);
		
		System.out.printf("Box box: %s\n", box);
	
	} // end main method
	
	static class Box {
	
		double width;
		double height;
		double depth;
		
		Box(double w, double h, double d) {
		
			width = w;
			height = h;
			depth = d;
		
		} // end Box constructor -- int, int, int
	
		@Override
		public String toString() {
		
			return String.format("Dimensions are: %.2f by %.2f by %.2f", 
					width, height, depth);
		
		} // end toString method
	
	} // end inner class Box

} // end StringMethodsDemo class
