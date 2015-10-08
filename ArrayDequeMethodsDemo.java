import java.util.ArrayDeque;

class ArrayDequeMethodsDemo {

	public static void main(String[] args) {
	
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		
		arrayDeque.add("One");
		arrayDeque.add("Two");
		arrayDeque.add("Four");
		
		System.out.println(arrayDeque);
		
		if (arrayDeque.offerLast("Five")) {
			System.out.println(arrayDeque);
		}
	
	} // end main method

} // end ArrayDeque class
