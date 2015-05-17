/* classe que demonstra a utilização da classe Locale */

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class LocaleTest {

	public static void main(String[] args) {
	
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 11, 14);
		
		Date date = calendar.getTime();
	
		Locale locIT = new Locale("it", "IT");
		Locale locPT = new Locale("pt");
		Locale locBR = new Locale("pt", "BR");
		Locale locIN = new Locale("hi", "IN");
		Locale locJA = new Locale("ja");
	
		DateFormat dfUS = DateFormat.getDateInstance();
		System.out.println("US: " + dfUS.format(date));
	
		DateFormat dfUSFull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("US Full: " + dfUSFull.format(date));
		
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		System.out.println("Italy: " + dfIT.format(date));
		
		DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
		System.out.println("Portugal: " + dfPT.format(date));
		
		DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
		System.out.println("Brazil: " + dfBR.format(date));
		
		DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
		System.out.println("India: " + dfIN.format(date));
		
		DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
		System.out.println("Japan: " + dfJA.format(date));
		
		System.out.println("-------------");
		
		System.out.println(locIT.getDisplayCountry());
		
		System.out.println(locIT.getDisplayCountry(locIT));
		
		System.out.println(locBR.getDisplayLanguage());
		
		System.out.println(locBR.getDisplayLanguage(locBR));
	
	} // end method main

} // end class LocaleTest
