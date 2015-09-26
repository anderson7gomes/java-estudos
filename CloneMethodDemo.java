class CloneMethodDemo {
	
	public static void main(String[] args) {
		
		Foo f1 = new Foo("Anderson", new Bar());
		Foo f2;

		System.out.println("f1's var: " + f1.getVar());

		try {

			f2 = (Foo) f1.clone();	
			System.out.println("f2's var: " + f2.getVar());

			System.out.println(f1 == f2);
			System.out.println(f1.getBar() == f2.getBar());

		} catch (CloneNotSupportedException e) {

			System.err.println("Foo not suports clone operation");
			System.exit(1);

		}

	} // end main method

} // end CloneMethodDemo class

class Foo implements Cloneable {
	
	private String var;
	private Bar bar;

	Foo(String var, Bar bar) {
		
		this.var = var;
		this.bar = bar;

	} // end Foo constructor -- String

	String getVar() {
		
		return var;

	} // end getVar method

	Bar getBar() {
		
		return bar;

	} // end getBar method

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();

	} // end clone method

} // end Foo class

class Bar {} // end Bar class