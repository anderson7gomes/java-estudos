import java.util.Enumeration;
import java.util.Vector;

class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector(3);

		System.out.println("vector initial size: " + 
				vector.size());

		vector.addElement(1);
		vector.addElement(2);
		vector.addElement(3);
		vector.addElement(4);
		
		System.out.println("vector size after four additions: " + 
				vector.size());
		
		System.out.println("vector capacity: " + vector.capacity());		

		System.out.println("First element: " + 
				vector.firstElement());
				
		System.out.println("Last element: " +
				vector.lastElement());

		System.out.printf("vector contains 3? %b\n", 
				vector.contains(3));		

		System.out.println("vector elements:");
				
		Enumeration<Integer> enumeration = vector.elements();
		
		while (enumeration.hasMoreElements()) {
			System.out.printf("%s ", enumeration.nextElement());
		}				
		
		System.out.println();				

	} // end main method

} // end VectorDemo class