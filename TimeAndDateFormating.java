import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;

class TimeAndDateFormating {
	
	public static void main(String[] args) {
		
		Formatter formatter = new Formatter();

		Calendar cal = new GregorianCalendar(2016, Calendar.AUGUST, 29);

		formatter.format("%tD", cal);

		System.out.println(formatter);
		formatter.close();

		formatter = new Formatter();

		formatter.format("%tc", cal);

		System.out.println(formatter);
		formatter.close();

		formatter = new Formatter();

		for (int i = 1; i <= 10; i++) {
			
			formatter.format("%2s%5s%5s\n",
					i, (int) Math.pow(i, 2), 
					(int) Math.pow(i, 3));

		}

		System.out.println(formatter);

		formatter.close();

		formatter = new Formatter();

		formatter.format("%4s\n%.3s\n", 
				"Anderson", "Anderson");

		formatter.format("%020d", 1);

		System.out.println(formatter);
		
		formatter.close();		

	} // end main method

} // ebd TimeAndDateFormating class