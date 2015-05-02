/* classe que demonstra a utilização de autobox com arrays de inteiros */

class AutoboxArrayTest {

	public static void main(String[] args) {
	
		int[] intArray = {2, 3, 7, 3, 1};
	//	Integer[] integerArray1 = intArray;

		Integer[] integerArray2 = { 3, 8, 5, 3 };

		Number[] numberArray = integerArray2;
	
	} // fim do método main

} // fim da classe AutoboxArrayTest
