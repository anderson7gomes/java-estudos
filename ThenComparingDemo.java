import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class LastNameComparator implements Comparator<String> {

	public int compare(String str1, String str2) {
	
		int i = str1.lastIndexOf(' ') + 1;
		int j = str2.lastIndexOf(' ') + 1;
		
		return str1.substring(i).
				compareTo(str2.substring(j));
	
	} // end compare method

} // end LastNameComparator class

class FirstNameComparator implements Comparator<String> {

	public int compare(String str1, String str2) {
	
		return str1.compareTo(str2);
	
	} // end compare method

} // end FistNameComparator class 

class ThenComparingDemo {

	public static void main(String[] args) {
	
		Comparator<String> thenComparingFirstName = 
				(new LastNameComparator()).
					thenComparing(new FirstNameComparator());
					
		TreeMap<String, Double> treeMap = 
				new TreeMap<>(thenComparingFirstName);	
				
		treeMap.put("Anderson Gomes", 7000.0);
		treeMap.put("Valinha Nascimento", 4500.0);
		treeMap.put("Erivelton Cruz", 3000.0);
		treeMap.put("Allisson Gomes", 9500.0);
		
		for (Map.Entry entry : treeMap.entrySet()) {
		
			System.out.printf("%s: %s\n", entry.getKey(), 
					entry.getValue());
		
		}				
	
	} // end main method

} // end ThenComparingDemo class
