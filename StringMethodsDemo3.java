import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class StringMethodsDemo3 {

	public static void main(String[] args) {
	
		String original = "This is a test. This is, too";
		String target = "is";
		String replace = "was";
		
		int index;
		
		do {
		
			index = original.indexOf(target);
			
			if (index != -1) {
			
				String originalStart = original.substring(0, index);
				String originalEnd = original.substring(
						index + target.length(), original.length());
				original = originalStart + replace + originalEnd;
				System.out.println(original);
				
			}
		
		} while (index != -1);
		
		try (BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in))) {
		
			System.out.print("Enter a string to trim: ");
			String input = br.readLine();
			
			System.out.println("\"".concat(input.trim()).concat("\""));	
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		char[] chars = {'a', 'b', 'c', 'd'};
		
		System.out.println(String.valueOf(chars));
	
	} // end main method

} // end StringMethodsDemo3 class
