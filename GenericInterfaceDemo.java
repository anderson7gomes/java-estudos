interface MinMax<T extends Comparable<T>> {

	T min();
	T max();

} // end MinMax interface

class GenericClass<T extends Number> implements MinMax<Double> {

	private T[] numbers;
	
	GenericClass(T[] numbers) {
	
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException();
		}	
	
		this.numbers = numbers;	

	} // end constructor GenericClass -- T[]	

	public Double min() {
	
		double vMin = numbers[0].doubleValue();
		
		double vToCompare;
		
		for (int i = 1; i < numbers.length; i++) {
		
			vToCompare = numbers[i].doubleValue();
		
			if (vToCompare < vMin) {
				vMin = vToCompare;
			}
		
		}
		
		return vMin;
	
	} // end min method
	
	public Double max() {
	
		double vMax = numbers[0].doubleValue();
		
		double vToCompare;
		
		for (int i = 1; i < numbers.length; i++) {
		
			vToCompare = numbers[i].doubleValue();
		
			if (vToCompare > vMax) {
				vMax = vToCompare;
			}
		
		}
		
		return vMax;
	
	} // end max method

} // end GenericClass class

class GenericInterfaceDemo {

	public static void main(String[] args) {
	
		Integer[] integerArray = {2, 5, 3, 6, 1, 4};
		
		GenericMethodDemo.showArray(integerArray, "integerArray");
		
		GenericClass<Integer> genInt = new GenericClass<Integer>(integerArray);
		
		System.out.printf("Minimum of integerArray: %.2f\n", genInt.min());
	
	} // end main method

} // end GenericInterfaceDemo class
