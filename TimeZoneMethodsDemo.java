import java.util.TimeZone;

class TimeZoneMethodsDemo {

	public static void main(String[] args) {
	
		String[] avaliableIDs = TimeZone.getAvailableIDs();
		
		for (String s : avaliableIDs) {
			System.out.println(s);
		}
	
		TimeZone tz = TimeZone.getDefault();
		
		System.out.println(tz.getID());
		System.out.println(tz.getDisplayName(true, TimeZone.LONG));
	
		TimeZone.setDefault(TimeZone.getTimeZone("US/Arizona"));
	
	} // end main method

} // end TimeZoneMethodsDemo class
