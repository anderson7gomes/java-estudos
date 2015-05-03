/* classe que demonstra a utilização de um labeled break */

class LabeledBreakTest {

	public static void main(String[] args) {
	
		int i = 1;
		int j = 1;
		
	outer:	
		while (i <= 8) {
		
			while (j <= 9) {
			
				System.out.println(j);
				++j;
				++i;
				
				continue outer;	
					
			}
		
		}
	
	}

} // fim da classe LabeledBreakTest
