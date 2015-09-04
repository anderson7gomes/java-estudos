@FunctionalInterface
interface MyNumber {

	double getNumber();
	
	public String toString();

} // end MyNumber class

@FunctionalInterface
interface BinaryNumericalOperation {

	int apply(int number1, int number2);

} // end BinaryNumericalOperation interface 

class LambdaExpressionDemo {

	public static void main(String[] args) {
	
		MyNumber target = () -> 3.14;
		
		MyNumber target2 = new MyNumber() {
		
			public double getNumber() {
				return 3.15;
			} // end getNumber method
		
		}; 
		
		BinaryNumericalOperation target3;
		
		target3 = (x, y) -> x * y;
	
		System.out.println(target.getNumber());
		System.out.println(target2.getNumber());
		
		System.out.println(target3.apply(2, 5));
	
	} // end main method

} // end LambdaExpressionDemo
