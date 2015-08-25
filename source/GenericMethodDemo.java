class Foo {

	double val;
	
	<T extends Number> Foo(T object) {
		val = object.doubleValue();
	} // end Foo constructor -- T

	static <T extends Comparable<T>, V extends T> boolean isIn(T element, 
			V[] set) {
			
		for (V e : set) {
		
			if (element.compareTo(e) == 0) {
				return true;
			}
		
		}	
		
		return false;	
			
	} // end isIn method		

} // end Foo class

class GenericMethodDemo {

	public static void main(String[] args) {
	
		new <Integer>Foo(new Integer(2));
	
		Integer[] nums = {1, 2, 3, 4, 5};
		
		showArray(nums, "nums");
		
		System.out.printf("2 is %sin nums\n", 
				(Foo.<Integer, Integer>isIn(2, nums)) ? "" : "not ");
				
		System.out.printf("7 is %sin nums\n", 
				(Foo.isIn(7, nums)) ? "" : "not ");		
				
		String[] words = {"one", "two", "three", "four", "five"};
		
		showArray(words, "words");
		
		System.out.printf("\"two\" is %sin words\n", 
				(Foo.isIn("two", words)) ? "" : "not ");
				
		System.out.printf("\"seven\" is %sin words\n", 
				(Foo.isIn("seven", words)) ? "" : "not ");				
	
	} // end main method

	static void showArray(Object[] array, String name) {
	
		System.out.printf("Array %s:\n", name);
		
		System.out.print("[ ");
		
		for (Object o : array) {
			System.out.printf("%s ", o);
		}
		
		System.out.println("]");
	
	} // end showArray method

} // end GenericMethodDemo class
