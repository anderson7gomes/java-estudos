@FunctionalInterface
interface DoubleArrayFunc {

	double func(double[] array) throws EmptyArrayException;

} // end DoubleArrayFunc interface

class EmptyArrayException extends Exception {

	EmptyArrayException() {
		super();
	}// end EmptyArrayException constructor

	EmptyArrayException(String message) {
		super(message);
	} // end EmptyArrayException constructor -- String

} // end EmptyArrayException class

class LambdaExpressionWithException {

	public static void main(String[] args) throws EmptyArrayException {
	
		DoubleArrayFunc average = (array) -> {
		
			double sum = 0.0;
			
			if (array.length == 0) {
				throw new EmptyArrayException();
			}
			
			for (double value : array) {
				sum += value;
			}
			
			return sum / array.length;
		
		};
		
		double[] array1 = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		System.out.print("array1: ");
		
		for (double value : array1) {
			System.out.printf("%.1f ", value);
		}
		
		System.out.printf("\n\naverage: %.2f\n", average.func(array1));
	
		average.func(new double[0]);
	
	} // end main method

} // end LambdaExpressionWithException class
