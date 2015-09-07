import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

@FunctionalInterface
interface NumericFunc<T extends Number> {

	T apply(T n);

} // end NumericFunc interface

class MethodReferenceDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
	
		System.out.print("Digite um número para calcular o fatorial: ");
		int number = new Integer(br.readLine());
	
		System.out.printf("O fatorial de %d é %d\n", number, factorial(number));
	
		applyTo(MethodReferenceDemo::factorial, number);
	
	} // end main method
	
	static <T extends Number> void applyTo(NumericFunc<T> func, T value) {
	
		System.out.println("Inside applyTo method");
		
		System.out.println(func.apply(value));
	
	} // end applyTo method
	
	static int factorial(int number) {
	
		assert number >= 0 : "argument must be non-negative";
	
		if (number <= 1) {
			return 1;
		}
		
		return number * factorial(number - 1);
	
	} // end factorial method

} // end MethodReferenceDemo class
