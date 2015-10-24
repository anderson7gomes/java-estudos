import java.util.Calendar;
import java.util.Date;

class CalendarMethodsDemo {
	
	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();

		calendar.set(2015, Calendar.DECEMBER, 30);

		System.out.println("Year: " +
				calendar.get(Calendar.YEAR));

		System.out.println("Month: " +
				calendar.get(Calendar.MONTH));
				
		System.out.println("Day: " +
				calendar.get(Calendar.DAY_OF_MONTH));		
				
		calendar.setTime(new Date());
		
		System.out.println("Year: " +
				calendar.get(Calendar.YEAR));

		System.out.println("Month: " +
				calendar.get(Calendar.MONTH));
				
		System.out.println("Day: " +
				calendar.get(Calendar.DAY_OF_MONTH));	

		if (calendar.isLenient()) {
			System.out.println("calendar is lenient");
		}			

	} // end main method

} // end CalendarMethodsDemo class