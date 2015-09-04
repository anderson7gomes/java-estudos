class NonGenericClass {

	int num;
	
	NonGenericClass(int num) {
		this.num = num;
	} // end NonGenericClass constructor -- int
	
	int getNum() {
		return num;
	} // end getNum method

} // end NonGenericClass class

class GenericSubclass<T> extends NonGenericClass {

	T ob;
	
	GenericSubclass(int num, T ob) {
	
		super(num);
		
		this.ob = ob;
	
	} // end GenericSubclass constructor
	
	T getOb() {
		return ob;
	} // end getOb method

} // end GenericSubclass class

class GenericSubclassDemo {

	public static void main(String[] args) {

		GenericSubclass<String> genSub = new GenericSubclass<String>(6, "six");
		
		System.out.printf("%d %s\n", genSub.getNum(), genSub.getOb());
	
	} // end main method

} // end GenericSubclassDemo class
