/* classe que demonstra uma expression lambda que lança uma checked exception */

interface DoubleNumericArrayFunc {
	double func(double[] n) throws EmptyArrayException;
} // fim da interface DoubleNumericArrayFunc

class EmptyArrayException extends Exception {

	public EmptyArrayException() {
		super("empty array");
	}

} // fim da classe EmptyArrayException

class LambdaExceptionDemo {

	public static void main(String[] args) throws EmptyArrayException {
	
		DoubleNumericArrayFunc average = (n) -> {
		
			if (n.length == 0) {
				throw new EmptyArrayException();
			}
			
			double total = 0;
			
			for (double value : n) {
				total += value;
			}
			
			return total / n.length;
		
		}; // fim do block lambda
		
		System.out.printf("Average is: %.2f\n", 
				average.func(new double[] {1.0, 2.0, 3.0, 4.0}));
				
		/* throws exception */		
		System.out.printf("Average is: %.2f\n", average.func(new double[0])); 		
	
	}

} // fim da classe LambdaExcpetionDemo
