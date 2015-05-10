/* classe que demonstra a utilização de uma interface funcional genérica */

interface SomeFunc<T> {
	T func(T t);
} // fim da interface funcional genérica SomeFunc

class GenericFunctionalInterfaceDemo {

	public static void main(String[] args) {
	
		SomeFunc<String> reverse = (str) -> {
		
			StringBuilder builder = new StringBuilder(str).reverse();
			return builder.toString();
		
		}; // fim do block lambda
		
		SomeFunc<Integer> factorial = (n) -> {
		
			int result = 1;
			
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			
			return result;
		
		}; // fim do block lambda
	
		System.out.printf("Reverse of \"Lambda\" is: %s\n", 
				reverse.func("Lambda"));
				
		System.out.printf("Reverse of \"expression\" is: %s\n", 
				reverse.func("expression"));
				
		System.out.printf("Factorial of 4 is: %d\n", factorial.func(4));
		
		System.out.printf("Factorial of 6 is: %d\n", factorial.func(6));						

	}

} // fim da classe GenericFunctionalInterfaceDemo
