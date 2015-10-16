import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class UnmodifiableMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Double> hashMap = 
				new HashMap<>();

		hashMap.put("Anderson", 3500.0);
		hashMap.put("Batman", 4500.0);
		
		Map<String, Double> map = 
			Collections.unmodifiableMap(hashMap);
			
	//	map.put("Pinguim", 2500.0);			

	} // end main method

} // end UnmodifiableMapDemo class