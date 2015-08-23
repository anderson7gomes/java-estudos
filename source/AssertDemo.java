class AssertDemo {

	static int num = 4;
	
	static int getNum() {
	
		return num--;
	
	} // end getNum method

	public static void main(String[] args) {
	
		int n;
	
		for (int i = 0; i < 10; i++) {
		
			n = getNum();
			
			assert n > 0 : "n not greater than 0";
			
			System.out.printf("n is %s\n", n);
		
		}
	
	} // end main method

} // end AssertDemo class

class MyClass {

	public static void main(String[] args) {
	
		assert args.length != 1 : "One argument must be passed"; 
	
	} // end main method

} // end MyClass class
