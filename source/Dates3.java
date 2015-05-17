/* classe que demonstra alguns métodos da classe DateFormat */ 

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

class Dates3 {

	public static void main(String[] args) {
	
		Date date = new Date(1_000_000_000_000L);
		
		DateFormat[] dateFormatArray = new DateFormat[6];
		
		dateFormatArray[0] = DateFormat.getInstance();
		dateFormatArray[1] = DateFormat.getDateInstance();
		dateFormatArray[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dateFormatArray[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dateFormatArray[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dateFormatArray[5] = DateFormat.getDateInstance(DateFormat.FULL);
	
		for (DateFormat df : dateFormatArray) {
			System.out.println(df.format(date));
		}
		
		String fullDate = dateFormatArray[5].format(date);
		
		try {
		
			Date date2 = dateFormatArray[5].parse(fullDate);
			System.out.println(date2);
			
		} catch (ParseException e) {
			System.err.println("Exception parsing String to Date");
		}
	
	} // end method main

} // end class Dates3
