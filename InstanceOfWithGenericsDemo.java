class GenericSuperclass<T> {

	T ob1;
	
	GenericSuperclass(T ob) {
		this.ob1 = ob;
	} // end GenericSuperclass constructor -- T

} // end GenericSuperClass class

class GenericSubclass<T> extends GenericSuperclass<T> {

	T ob2;
	
	GenericSubclass(T ob1, T ob2) {
	
		super(ob1);
		
		this.ob2 = ob2;
	
	} // end GenericSuperclass constructor -- T, T

} // end GenericSubclass class

class InstanceOfWithGenericsDemo {

	public static void main(String[] args) {
	
		GenericSubclass<String> subStr = 
				new GenericSubclass<String>("Anderson", "Gomes");
				
		GenericSubclass<Integer> subInt =
				new GenericSubclass<Integer>(4, 6);
			
		System.out.printf("subStr is %sinstance of GenericSuperclass<?>\n",
				(subStr instanceof GenericSuperclass<?>) ? "" : "not ");
				
		System.out.printf("subStr is %sinstance of GenericSubclass<?>\n",
				(subStr instanceof GenericSubclass<?>) ? "" : "not ");
				
		System.out.printf("subInt is %sinstance of GenericSuperclass<?>\n",
				(subInt instanceof GenericSuperclass<?>) ? "" : "not ");
				
		System.out.printf("subInt is %sinstance of GenericSubclass<?>\n",
				(subInt instanceof GenericSubclass<?>) ? "" : "not ");
				
		GenericSuperclass<Double> superDoub = 
				new GenericSuperclass<Double>(2.5);
				
		System.out.printf("superDoub is %sinstance of GenericSubclass<?>\n",
				(superDoub instanceof GenericSubclass<?>) ? "" : "not ");
				
		System.out.printf("superDoub is %sinstance of GenericSuperclass<?>\n",
				(superDoub instanceof GenericSuperclass<?>) ? "" : "not ");												
	
	} // end main method

} // end InstanceOfWithGenericsDemo class
