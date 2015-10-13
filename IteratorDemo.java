import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.List;
import java.util.Iterator;

class IteratorDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");

		Iterator<String> iterator = list.iterator();

		System.out.println("list content:\n");

		while (iterator.hasNext()) {
			
			String element = iterator.next();
			System.out.println(element);

		}

		System.out.println("\nModifying list elements...\n");

		ListIterator<String> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			
			String element = listIterator.next();
			listIterator.set(element + "+");

		}

		System.out.println("Reversing list content:\n");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	} // end main method

} // end IteratorDemo class