/* classes que demonstra a utilização das classe Date e Calendar */

import java.util.Calendar;
import java.util.Date;

class Dates2 {

	public static void main(String[] args) {
	
		Date date = new Date(1_000_000_000_000L);
		
		System.out.println(date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		if (Calendar.SUNDAY == calendar.getFirstDayOfWeek()) {
		
			System.out.println("Sunday is the first day of week");
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

		}
		
		calendar.add(Calendar.MONTH, 4);
		
		date = calendar.getTime();
		System.out.println(date);
	
	} // end method main

} // end class Dates2
