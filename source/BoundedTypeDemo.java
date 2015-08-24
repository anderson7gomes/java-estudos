class GenericArrayClass<T extends Number> {

	private T[] nums;
	
	GenericArrayClass(T[] array) {
	
		this.nums = array;
	
	} // end constructor - T[]

	double average() {
	
		double sum = 0.0;
		
		for (T num : nums) {
			sum += num.doubleValue();
		}
		
		return sum / nums.length;
	
	} // end average method
	
	boolean sameAvg(GenericArrayClass<?> other) {
	
		return this.average() == other.average();
	
	} // end sameAvg method

} // end GenericArrayClass class

class BoundedTypeDemo {

	public static void main(String[] args) {
	
		/* Array de Integer */
	
		Integer[] intArray1 = {1, 2, 3, 4, 5}; 
	
		GenericArrayClass<Integer> genericIntArray1 = 
				new GenericArrayClass<Integer>(intArray1);
				
		System.out.println("Contents of intArray1: ");
		
		for (int num : intArray1) {
			System.out.printf("%d ", num);
		}		
				
		System.out.printf("\nAverage of intArray1: %s\n", 
				genericIntArray1.average());	
				
		/* Array de Integer */		
				
		Integer[] intArray2 = {1, 2, 3, 4, 5}; 
	
		GenericArrayClass<Integer> genericIntArray2 = 
				new GenericArrayClass<Integer>(intArray2);
				
		System.out.println("\nContents of intArray2: ");
		
		for (int num : intArray2) {
			System.out.printf("%d ", num);
		}		
				
		System.out.printf("\nAverage of intArray2: %s\n", 
				genericIntArray2.average());		
				
		/* call to sameAvg */		
				
		System.out.printf("\nAverage of intArray1 and intArray2 %s\n",
				(genericIntArray2.sameAvg(genericIntArray1)) ? "are the same"
															 : "differ");							
				
		/* Array de Double */		
				
		Double[] doubleArray1 = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		GenericArrayClass<Double> genericDoubleArray1 = 
				new GenericArrayClass<Double>(doubleArray1);
				
		System.out.println("\nContents of doubleArray1: ");		 			
		
		for (double num : doubleArray1) {
			System.out.printf("%s ", num);
		}
		
		System.out.printf("\nAverage of doubleArray1: %s\n", 
				genericDoubleArray1.average());
				
		/* Array de Double */		
				
		Double[] doubleArray2 = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		GenericArrayClass<Double> genericDoubleArray2 = 
				new GenericArrayClass<Double>(doubleArray2);
				
		System.out.println("\nContents of doubleArray2: ");		 			
		
		for (double num : doubleArray2) {
			System.out.printf("%s ", num);
		}
		
		System.out.printf("\nAverage of doubleArray2: %s\n", 
				genericDoubleArray2.average());		
				
		/* call to sameAvg */
		
		System.out.printf("\nAverage of intArray1 and doubleArray2 %s\n",
			(genericDoubleArray2.sameAvg(genericIntArray1)) ? "are the same"
														 	: "differ");		
		
	} // end main method

} // end BoundedTypeDemo class	
