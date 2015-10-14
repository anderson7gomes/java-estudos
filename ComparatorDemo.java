import java.util.Comparator;
import java.util.TreeSet;

class FooComparator implements Comparator<Foo> {

	public int compare(Foo f1, Foo f2) {
	
		return f2.number - f1.number;			
	
	} // end compare method

} // end FooComparator class

class Foo {

	int number;
	
	Foo(int number) {
	
		this.number = number;
	
	} // end Foo constructor -- int
	
	@Override
	public String toString() {
	
		return String.valueOf(number);
	
	} // end toString method

} // end Foo class

class ComparatorDemo {

	public static void main(String[] args) {
	
		TreeSet<Foo> treeSet = new TreeSet<>(new FooComparator());
		
		treeSet.add(new Foo(5));
		treeSet.add(new Foo(1));
		treeSet.add(new Foo(8));
		treeSet.add(new Foo(7));
		
		System.out.println(treeSet);
	
	} // end main method

} // end ComparatorDemo class
