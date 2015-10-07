import java.util.LinkedList;

class LinkedListMethodsDemo {

	public static void main(String[] args) {
	
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("One");
		linkedList.add("Two");
		linkedList.add("Three");
		
		System.out.println(linkedList);
		
		linkedList.add(1, "Half");
		
		System.out.println(linkedList);
		
		String s = linkedList.get(1);
		
		linkedList.set(1, s + " changed");
		
		System.out.println(linkedList);
		
		linkedList.offerLast("Last");	
		
		System.out.println(linkedList);
	
	} // end main method

} // end LinkedListMethodsDemo class
