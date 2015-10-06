import java.util.ArrayList;

class ArrayListMethodsDemo {

	public static void main(String[] args) {
	
		ArrayList<String> arrayList = new ArrayList<>(10);
		
		System.out.printf("Initial capacity of array list: %d\n", 
				arrayList.size());
				
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
				
		arrayList.removeIf((s) -> s.startsWith("On"));
		
		System.out.printf("array list content: %s\n", arrayList);
		
		System.out.printf("Capacity of array list after adding elements: %d\n",
				arrayList.size());
				
		String[] array = new String[3];
		
		array = arrayList.toArray(array);				

		for (String s : array) {
			System.out.println(s);
		}
		
	} // end main method

} // end ArrayListMethodsDemo class
