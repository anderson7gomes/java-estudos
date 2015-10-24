import java.util.Calendar;
import java.util.GregorianCalendar;

class GregorianCalendarMethodsDemo {
	
	public static void main(String[] args) {

		GregorianCalendar gregCalendar = 
				new GregorianCalendar(2016, 
						Calendar.MARCH, 30, 16, 30, 12);

		System.out.println(gregCalendar.get(Calendar.YEAR));
		System.out.println(gregCalendar.get(Calendar.MONTH));
		System.out.println(gregCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(gregCalendar.get(Calendar.HOUR));
		System.out.println(gregCalendar.get(Calendar.MINUTE));
		System.out.println(gregCalendar.get(Calendar.SECOND));
		
		System.out.println();

		gregCalendar.roll(Calendar.MONTH, 12);
		
		// cai na mesma data

		System.out.println(gregCalendar.get(Calendar.YEAR));
		System.out.println(gregCalendar.get(Calendar.MONTH));
		System.out.println(gregCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(gregCalendar.get(Calendar.HOUR));
		System.out.println(gregCalendar.get(Calendar.MINUTE));
		System.out.println(gregCalendar.get(Calendar.SECOND));
						
		System.out.println(gregCalendar.getCalendarType());
		
		int year = gregCalendar.get(Calendar.YEAR);

		System.out.printf("%s is %sa leap year\n", 
				year, (gregCalendar.isLeapYear(year) ? "" : "not "));

	} // end main method
	
} // end GregorianCalendarMethodsDemo class