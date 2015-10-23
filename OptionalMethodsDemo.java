import java.util.Optional;

class OptionalMethodsDemo {

	public static void main(String[] args) {
	
		Optional<Foo> foo = Optional.of(new Foo(7));
		
		System.out.println(foo.get());
		
		Optional<String> emptyFoo = Optional.empty();
		
		System.out.println(emptyFoo.orElse("Default"));
	
	} // end main method

} // end OptionalMethodsDemo class

class Foo {

	private int id;
	
	Foo(int id) {
		
		this.id = id;	
		
	} // end Foo constructor
	
	int getId() {
	
		return id;
	
	} // end getId method
	
	@Override
	public String toString() {
	
		return String.valueOf(id);
	
	} // end toString method

} // end Foo method
