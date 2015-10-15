import java.util.Map;
import java.util.TreeMap;

class ThenComparingWithLambda {

	public static void main(String[] args) {
	
		TreeMap<String, Double> treeMap = 
				new TreeMap<>((str1, str2) -> {
				
					int i = str1.lastIndexOf(' ') + 1;
					int j = str2.lastIndexOf(' ') + 1;
					
					int k = str1.substring(i).compareTo(str2.substring(j));
					
					if (k == 0) {
						return str1.compareTo(str2);
					}
				
					return k;
				
				});
	
		treeMap.put("Anderson Gomes", 7000.0);
		treeMap.put("Valinha Nascimento", 4500.0);
		treeMap.put("Erivelton Cruz", 3000.0);
		treeMap.put("Allisson Gomes", 9500.0);
		
		for (Map.Entry entry : treeMap.entrySet()) {
		
			System.out.printf("%s: %s\n", entry.getKey(), 
					entry.getValue());
		
		}	
	
	} // end main method

} // end ThenComparingWithLambda class
