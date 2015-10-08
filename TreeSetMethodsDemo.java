import java.util.SortedSet;
import java.util.TreeSet;

class TreeSetMethodsDemo {

	public static void main(String[] args) {
	
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		
		System.out.println(treeSet);
	
		SortedSet<String> treeSet2 = treeSet.subSet("M", "W");
		
		System.out.println(treeSet2);
	
	} // end main method

} // end TreeSetMethodsDemo class
