/* classe que demonstra algumas e classes e métodos que manipulam tempo */

import java.time.*;

class TimeManagement {

	public static void main(String[] args) {
	
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate);
		
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.lengthOfMonth());
		
		localDate = localDate.minusDays(12);
		System.out.println(localDate);
		
		localDate = localDate.minusWeeks(1);
		System.out.println(localDate);
	
	}

} // fim da classe TimeManagement
