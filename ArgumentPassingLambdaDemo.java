@FunctionalInterface
interface StringFunc {

	String func(String str);

} // end StringFunc interface

class ArgumentPassingLambdaDemo {

	public static void main(String[] args) {
	
		System.out.println(applyTo(
				(str) -> str.toUpperCase(), "Anderson Gomes"));			
				
		StringFunc removeBlankSpaces = (str) -> {
		
			StringBuilder sb = new StringBuilder();
			
			char currentChar;
			
			for (int i = 0; i < str.length(); i++) {
			
				currentChar = str.charAt(i);
			
				if (currentChar != ' ') {
					sb.append(currentChar);
				}
			
			}
			
			return sb.toString();
		
		};		
				
		System.out.println(applyTo(
				removeBlankSpaces, "Write Once Run Anywhere"));			
	
	} // end main method
	
	static String applyTo(StringFunc function, String target) {
	
		return function.func(target);

	} // end applyTo method

} // end ArgumentPassingLambdaDemo class
