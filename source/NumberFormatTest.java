/* 
 * classe que demonstra a chamada à factory methods 
 * da classe NumberFormat e ao método format 
 */
 
import java.text.NumberFormat; 
import java.util.Locale; 
 
class NumberFormatTest {

	public static void main(String[] args) {
	
		float f = 123.4567F;
		Locale locBr = new Locale("pt", "br");
		
		NumberFormat[] formatters = new NumberFormat[4];
		
		formatters[0] = NumberFormat.getInstance();
		formatters[1] = NumberFormat.getInstance(locBr);
		formatters[2] = NumberFormat.getCurrencyInstance();
		formatters[3] = NumberFormat.getCurrencyInstance(locBr);
		
		for (NumberFormat nf : formatters) {
			System.out.println(nf.format(f));
		}
	
	} // end method main

} // end class NumberFormatTest 
