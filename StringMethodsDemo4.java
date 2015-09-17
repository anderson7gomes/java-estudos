import java.util.Arrays;
import java.util.Collection;

class StringMethodsDemo4 {
	
	public static void main(String[] args) {
		
		String original = "My name is Anderson";

		System.out.println("original: " + original);
		System.out.println("original upper case: " + 
				original.toUpperCase());
		System.out.println("original lower case: " + 
				original.toLowerCase());

		String joined = String.join(";", getStrings());

		System.out.println(joined);

		String[] joinedSplited = joined.split(";");

		System.out.println("joinedSplited values:");

		for (String s : joinedSplited) {
			System.out.println(s);
		}

	} // end main method

	static Collection<String> getStrings() {
		
		return Arrays.asList(new String[] {"Anderson", 
				"Gomes", "Andrade"});

	} // end getStrings method

} // end StringMethodsDemo4 class