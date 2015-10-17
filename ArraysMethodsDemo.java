/*

	void parallelPrefix(long[], LongBinaryOperator)

*/

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

class ArraysMethodsDemo {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Red", 
				"Green", "Yellow");

		System.out.println(list);
		
		long[] longArray = {3, 5, -6, 4 , 1, -2};
		
		int index = Arrays.binarySearch(longArray, 0, 6, -6);
		
		System.out.println("-6 index: " + index);
		
		long[] copy = Arrays.copyOf(longArray, 6);

		System.out.println(Arrays.toString(copy));

		System.out.println(Arrays.equals(longArray, copy));

		Arrays.sort(longArray, 1, 6);

		System.out.println(Arrays.toString(longArray));

		Arrays.fill(longArray, 4, 6, 7);

		System.out.println(Arrays.toString(longArray));

		Arrays.parallelPrefix(longArray, (l1, l2) -> l1 * l2);

		System.out.println(Arrays.toString(longArray));

	} // end main method

} // end ArraysMethodsDemo class