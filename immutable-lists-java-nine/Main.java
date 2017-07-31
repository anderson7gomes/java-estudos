import java.util.List;

class Main {

	public static void main(String[] args) {
	
		List<String> foods = List.of("eggs", "burguer", "SPAM", "fish", "SPAM");
		
		try {
			foods.set(0, "SPAM");
		} catch (UnsupportedOperationException e) {
			System.out.println("Lists created with of() method are immutables");
		}
		
		System.out.println(foods);
		
	}

}
