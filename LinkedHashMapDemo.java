import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class LinkedHashMapDemo {
	
	public static void main(String[] args) {
	
		LinkedHashMap<String, Double> lhm = 
				new LinkedHashMap<String, Double>(16, 0.75f, true);
	
		lhm.put("Anderson", 4500.0);
		lhm.put("Shunabra", 3000.0);
		
		printEntrySet(lhm.entrySet());
		
		lhm.put("Anderson", 5000.0);
		
		System.out.println();
		
		printEntrySet(lhm.entrySet());
	
	} // end main method

	static void printEntrySet(Set<Map.Entry<String, Double>> entry) {
	
		for (Map.Entry<String, Double> e : entry) {
		
			System.out.printf("%s: %.2f\n", e.getKey(), e.getValue());
		
		}
	
	} // end printEntrySet method

} // end LinkedHashMapDemo class
