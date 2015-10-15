import java.util.EnumMap;
import java.util.Collection;

class EnumMapDemo {

	public static void main(String[] args) {
	
		EnumMap<Color, String> enumMap = new EnumMap<>(Color.class);
		
		enumMap.put(Color.RED, "Red");
		enumMap.put(Color.GREEN, "Green");
		enumMap.put(Color.YELLOW, "Yellow");
		
		Collection<String> nameSet = enumMap.values();
		
		for (String name : nameSet) {
			System.out.println(name);
		}
	
	} // end main method

} // end EnumMapDemo class

enum Color {

	RED, GREEN, YELLOW

} // end Color enum
