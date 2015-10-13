import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String, Double> treeMap = new TreeMap<>();

		treeMap.put("Anderson Gomes", 2000.0);
		treeMap.put("Leandro Nascimento", 1500.0);
		treeMap.put("Cleilson Lakesti", 3250.0);
		treeMap.put("Jose Lucas", 1750.0);

		printEntrySet(treeMap.entrySet());

		double amount = treeMap.get("Leandro Nascimento");
		treeMap.put("Leandro Nascimento", 1000 + amount);

		System.out.println();

		printEntrySet(treeMap.entrySet());

	} // end main method

	static void printEntrySet(Set<Map.Entry<String, Double>> entry) {
		
		for (Map.Entry<String, Double> e : entry) {
			
			System.out.printf("%s: %.2f\n", e.getKey(),
					e.getValue());

		}

	} // end printEntrySet method

} // end TreeMapDemo class