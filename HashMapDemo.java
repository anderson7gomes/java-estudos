import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Double> hashMap = new HashMap<>();

		hashMap.put("Anderson Gomes", 2000.0);
		hashMap.put("Leandro Nascimento", 1500.0);
		hashMap.put("Cleilson Lakesti", 3250.0);
		hashMap.put("Jose Lucas", 1750.0);

		printEntrySet(hashMap.entrySet());

		double amount = hashMap.get("Leandro Nascimento");
		hashMap.put("Leandro Nascimento", 1000 + amount);

		System.out.println();

		printEntrySet(hashMap.entrySet());

	} // end main method

	static void printEntrySet(Set<Map.Entry<String, Double>> entry) {
		
		for (Map.Entry<String, Double> e : entry) {
			
			System.out.printf("%s: %.2f\n", e.getKey(),
					e.getValue());

		}

	} // end printEntrySet method
 
} // end HashMapDemo class