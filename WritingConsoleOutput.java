import java.io.PrintWriter;

class WritingConsoleOutput {

	public static void main(String[] args) {

		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println("This is a String");

		int number = 7;

		pw.println(number);

	} // end main method

} // end WritingConsoleOutput class