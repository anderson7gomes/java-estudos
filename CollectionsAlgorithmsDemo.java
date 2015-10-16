import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class CollectionsAlgorithmsDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = 
			new LinkedList<>();
		
		linkedList.add(8);
		linkedList.add(-20);
		linkedList.add(-8);
		linkedList.add(20);
		
		System.out.println("Linked list: " + linkedList);
		
		Comparator<Integer> reverseComp = 
				Collections.reverseOrder();

		Collections.sort(linkedList, reverseComp);
		
		System.out.println("Linked list ordered: " + 
				linkedList);
				
		Collections.shuffle(linkedList);
		
		System.out.println("Linked list shuffled: " + 
				linkedList);
				
		Integer max = Collections.max(linkedList);
		Integer min = Collections.min(linkedList);
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);						

	} // end main method

} // end CollectionsAlgorithmsDemo class