import java.util.ArrayList;
import java.util.Spliterator;

class SpliteratorDemo {

	public static void main(String[] args) {
	
		ArrayList<Double> numbers = new ArrayList<>();
		
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		
		Spliterator<Double> spliterator = numbers.spliterator();
	
		System.out.println("Numbers:\n");
	
		while (spliterator.tryAdvance((n) -> System.out.println(n)));
		
		ArrayList<Double> sqrts = new ArrayList<>();
		
		spliterator = numbers.spliterator();
		
		spliterator.forEachRemaining((n) -> sqrts.add(Math.sqrt(n)));
	
		spliterator = sqrts.spliterator();
		
		System.out.println("\nSquare roots:\n");
		
		spliterator.forEachRemaining((n) -> System.out.println(n));
	
	} // end main method

} // end SpliteratorDemo class
