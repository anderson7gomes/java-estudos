/* 
 * classe que demonstra expression lambdas 
 * com um paramêtro na lista de parâmetros 
 */
 
interface NumericTest {
	boolean test(int n);
} // fim da interface NumericTest

class LambdaDemo2 {

	public static void main(String[] args) {
	
		NumericTest isEven = (n) -> n % 2 == 0;
		
		System.out.println("isEven.test(6): " + isEven.test(6));
		System.out.println("isEven.test(11): " + isEven.test(11));
		
		NumericTest isNonNegative = (n) -> n >= 0;
		
		System.out.println("isNonNegative.test(5): " + isNonNegative.test(5));
		System.out.println("isNonNegative.test(-1): " + isNonNegative.test(-1));
		System.out.println("isNonNegative.test(0): " + isNonNegative.test(0));	
		
		/*
		NumericTest isOdd = (byte n) -> n % 2 != 0;
		System.out.println("isOdd.test(4): " + isOdd.test(4));
		System.out.println("isOdd.test(7): " + isOdd.test(7));
		*/
		
	}

} // fim da classe LambdaDemo
