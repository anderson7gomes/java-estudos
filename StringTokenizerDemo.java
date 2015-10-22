import java.util.StringTokenizer;

class StringTokenizerDemo {

	public static void main(String[] args) {
	
		String msg = "Anderson;Gomes;Andrade";
		
		StringTokenizer tokenizer = new StringTokenizer(msg, ";");
		
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	
	} // end main method

} // end StringTokenizerDemo class
