@FunctionalInterface
interface MyFunc<T> {
	
	boolean func(T value1, T value2);

} // end MyFunc interface

class Date {
	
	int day;
	int month;
	int year;

	Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;

	} // end Date constructor -- int, int, int
	
	boolean sameDate(Date d) {
		
		return (this.day == d.day) && 
				(this.month == d.month) &&
				(this.year == d.year);

	} // end sameDate method

} // end Date class

class InstanceReferenceMethodDemo {
	
	public static void main(String[] args) {
		
		Date[] dates = {new Date(3, 7, 2014),
						new Date(8, 2, 2013),
						new Date(3, 11, 2015),
						new Date(8, 2, 2013)};

		int result = count(Date::sameDate, dates, 
				new Date(8, 2, 2013));

		System.out.printf("%d dates equals 8/2/2013\n", result);		

	} // end main method

	static <T> int count(MyFunc<T> function, T[] values, T val) {
		
		int counter = 0;

		for (T v : values) {
			
			if (function.func(val, v)) {
				++counter;
			}

		}

		return counter;

	} // end count method

} // end InstanceReferenceMethodDemo class