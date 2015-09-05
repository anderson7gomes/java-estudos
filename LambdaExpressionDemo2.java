@FunctionalInterface
interface NumericalTest {

	boolean test(int n);

} // end NumericalTest interface

@FunctionalInterface
interface NumericalTest2 {

	boolean test(int n1, int n2);

} // end NumericalTest2 interface

@FunctionalInterface
interface StringFunc {

	String func(String str);

} // end StringFunc interface

class LambdaExpressionDemo2 {

	public static void main(String[] args) {
	
		NumericalTest isEven = n -> n % 2 == 0;
		
		System.out.printf("16 is %seven\n", (isEven.test(16)) ? "" : "not ");
		
		NumericalTest isNonNeg = (n) -> n >= 0;
		
		System.out.printf("-1 is %snon negative\n", 
				(isNonNeg.test(-1)) ? "" : "not "); 
	
		NumericalTest2 isFactor = (n1, n2) -> (n1 % n2 == 0) || (n2 % n1 == 0);
		
		System.out.printf("2 and 7 are %sfactor\n", 
				(isFactor.test(2, 7)) ? "" : "not ");
				
		System.out.printf("2 and 8 are %sfactor\n", 
				(isFactor.test(2, 8)) ? "" : "not ");		
	
		StringFunc reverseString = (str) -> {
		
			StringBuilder sb = new StringBuilder(str).reverse();
			
			return sb.toString();
		
		};
		
		System.out.println("Lambda reverted is " + 
				reverseString.func("Lambda"));
	
	} // end main method

} // end LambdaExpressionDemo2 class
