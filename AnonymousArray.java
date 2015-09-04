/* classe que demonstra as capacidades de uma array anônimo */

class AnonymousArray {

	public static void main(String... args) {
	
		int[] array = new int[] {2, 5, 1};
		
		int index = 2;
		int element = new int[] {3, 4, 1, 9} [index];
		
		System.out.println(element);
		
		printArray(array);
	
	} // fim do método main
	
	public static void printArray(int[] array) {
	
		for (int element : array) {
			System.out.printf("%d ", element);
		}
		
		System.out.println();
	
	} // fim do método printArray
		
} // fim da classe AnonymousArray
