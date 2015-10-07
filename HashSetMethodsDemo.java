import java.util.HashSet;

class HashSetMethodsDemo {

	public static void main(String[] args) {
	
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Eight");
		
		System.out.println(hashSet);
		
		hashSet.remove("Two");
		
		System.out.println(hashSet);
	
	} // end main method

} // end HashSetMethodsDemo class
