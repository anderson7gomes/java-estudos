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

} // end GenericArrayClass class

class BoundedTypeDemo {

	public static void main(String[] args) {
	
		Integer[] intArray = {1, 2, 3, 4, 5}; 
	
		GenericArrayClass<Integer> genericIntArray = 
				new GenericArrayClass<Integer>(intArray);
				
		System.out.println("Contents of intArray: ");
		
		for (int num : intArray) {
			System.out.printf("%d ", num);
		}		
				
		System.out.printf("\nAverage of intArray: %s\n", 
				genericIntArray.average());		
				
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		GenericArrayClass<Double> genericDoubleArray = 
				new GenericArrayClass<Double>(doubleArray);
				
		System.out.println("\nContents of doubleArray: ");		 			
		
		for (double num : doubleArray) {
			System.out.printf("%s ", num);
		}
		
		System.out.printf("\nAverage of doubleArray: %s\n", 
				genericDoubleArray.average());
		
	} // end main method

} // end BoundedTypeDemo class	
