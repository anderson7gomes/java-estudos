/* classe que demonstra as classe Pattern e Match */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexTest {

	public static void main(String[] args) {
	
		Pattern myPattern = Pattern.compile(args[0]);
		Matcher myMatcher = myPattern.matcher(args[1]);
		
		System.out.println("\nsource: " + args[1]);
		System.out.println("index:  0123456789");
		System.out.println("pattern: " + myMatcher.pattern());
		
		System.out.print("\noccurrences index: ");

		while (myMatcher.find()) {
			System.out.printf("%d ", myMatcher.start());
		}
		
		System.out.println();
 	
	} // end method main

} // end class RegexTest
