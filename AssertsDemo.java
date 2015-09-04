/* 
 * classe que demonstra a utilização de asserts 
 * para verificação de fluxo no programa 
 */
 
class AssertsDemo {

	public static void main(String[] args) {
	
		int[] numbers = {2, 5, 1, 3, 2, -4, 5, 3, 9};
		
		for (int n : numbers) {
			showPositiveNumber(n);
		}
	
	} // fim do método main
	
	public static void showPositiveNumber(int number) {
	
		assert (number > 0) : "número negativo";
		
		System.out.println(number);
	
	} // fim do método doStuff
	
} // fim da classe AssertsDemo 
