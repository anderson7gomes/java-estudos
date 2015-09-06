@FunctionalInterface
interface SomeFunc<T> {

	T func(T value);

} // end SomeFunc interface

class GenericFunctionalInterfaceDemo2 {

	public static void main(String[] args) {
	
		SomeFunc<String> reverse = (str) -> {
			return new StringBuilder(str).reverse().toString();
		};	
		
		System.out.println("Lambda reversed is " + reverse.func("Lambda"));
		
		SomeFunc<Integer> factorial = (n) -> {
		
			int result = 1;
			
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			
			return result;
		
		};
		
		System.out.println("Factorial of 4 is " + factorial.func(4));
		
	} // end main method

} // end GenericFunctionalInterfaceDemo2 class
