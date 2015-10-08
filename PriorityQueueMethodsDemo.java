import java.util.PriorityQueue;

class PriorityQueueMethodsDemo {

	public static void main(String[] args) {
	
		PriorityQueue<Foo> priorityQueue = new PriorityQueue<>(Foo::compareFoo);
		
		priorityQueue.add(new Foo(5));
		priorityQueue.add(new Foo(3));
		priorityQueue.add(new Foo(1));
		priorityQueue.add(new Foo(2));
		
		Foo foo = priorityQueue.poll();
		
		System.out.println(priorityQueue);
	
	} // end main method

} // end PriorityQueueMethodsDemo class

class Foo {

	int factor;
	
	Foo(int factor) {
	
		this.factor = factor;
	
	} // end Foo constructor

	static int compareFoo(Foo foo1, Foo foo2) {
	
		return foo1.factor - foo2.factor;
	
	} // end compareFoo method
	
	@Override
	public String toString() {
	
		return String.valueOf(factor);
	
	} // end toString method

} // end Foo class
