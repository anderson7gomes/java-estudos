class SystemMethodsDemo {

	public static void main(String[] args) {
		
		int[] sourceArray = {3, 2, 7, 4, 1};
		int[] targetArray = new int[6];
		
		System.arraycopy(sourceArray, 0, targetArray, 0, 5);
		
		printIntArray(sourceArray);
		printIntArray(targetArray);
		
		System.out.printf("line separator = \"%s\"\n", System.lineSeparator());
		
		long start = System.currentTimeMillis();
		
		for (int i = 1; i < 100_000_000; i++) {
			new SystemMethodsDemo();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Milliseconds to allocate 100.000.000 objects of this class: " + (end - start));
	
	} // end main method

	static void printIntArray(int[] array) {
	
		for (int element : array) {
			System.out.printf("%d ", element);
		}
		
		System.out.println();
	
	} // end printIntArray method

} // end SystemMethodsDemo class

