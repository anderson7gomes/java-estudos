import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

class FormatFlags {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH);

		Formatter formatter = new Formatter();
		formatter.format("%-10.2f%s", 12.3456, "Hello");
		System.out.println(formatter);
		formatter.close();

		formatter = new Formatter();
		formatter.format("%+d, %+d", 10, -10);
		System.out.println(formatter);
		formatter.close();

		formatter = new Formatter();
		formatter.format("% d\n% d\n% d\n", 
				10, -10, 10);
		formatter.format("%(.2f\n", -34.5);
		formatter.format("%(.2f\n", 34.5);		
		System.out.println(formatter);
		formatter.close();
		
		formatter = new Formatter();
		formatter.format("%,.2f", 1123456.78);
		System.out.println(formatter);
		formatter.close();		

		formatter = new Formatter();
		formatter.format("%E\n%S", 345.67, "Hello");
		System.out.println(formatter);
		formatter.close();

		Calendar cal = Calendar.getInstance();

		formatter = new Formatter();
		formatter.format("%d, %1$d, %2$d\n", 255, 256);
		formatter.format("%te de %<tB de %<tY", cal);
		System.out.println(formatter);
		formatter.close();

	} // end main method

} // end FormatFlags class