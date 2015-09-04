/* classe que demonstra a situação de variable capture com lambda expressions */

interface MyFunc {
	int func(int n);
} // fim da interface funcional MyFunc

class VarCapture {

	public int number;

	public static void main(String[] args) {
	
		int var = 1;
		
		VarCapture varCapture = new VarCapture();
		
		MyFunc square = (n) -> {
		
			varCapture.number = 5;
			
			return n*n;
		
		};
	
	}

} // fim da classe VarCapture
