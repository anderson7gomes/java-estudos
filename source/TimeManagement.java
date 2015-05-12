/* classe que demonstra algumas e classes e métodos que manipulam tempo */

import java.time.*;

class TimeManagement {

	public static void main(String[] args) {
	
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.lengthOfMonth());
	
	}

} // fim da classe TimeManagement
