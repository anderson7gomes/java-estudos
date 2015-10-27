import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

class FormatterDemo {
	
	public static void main(String[] args) throws IOException {
		
		Formatter formatter = new Formatter();

		System.out.println(formatter);

		formatter.format("%s %s\n", "Hello", "World");

		System.out.println(formatter);
		
		formatter.format("%s", "Anderson");

		System.out.println(formatter);

		Appendable appendable = formatter.out();

		System.out.println(appendable);

		appendable.append(" Gomes");

		System.out.println(formatter);

		Formatter fileFormatter = null;

		try {
			fileFormatter = 
					new Formatter("formatted.txt");	
		} catch (FileNotFoundException e) {

			System.err.println(e.getMessage());
			System.exit(1);

		}

		fileFormatter.format("%s %d\n", "Anderson", 21);
		fileFormatter.format("%s", "Programmer");

		formatter.format("\nOctal: %o, Hexa: %x, Scientific Float: %e", 
				196, 196, 196.0);

		System.out.println(formatter);

		formatter.close();
		fileFormatter.close();

	} // end main method

} // end FormatterDemo class