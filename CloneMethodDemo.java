class CloneMethodDemo {
	
	public static void main(String[] args) {
		
		Foo f1 = new Foo("Anderson");
		Foo f2;

		System.out.println("f1's var: " + f1.getVar());

		try {

			f2 = (Foo) f1.clone();	
			System.out.println("f2's var: " + f2.getVar());

			System.out.println(f1 == f2);

		} catch (CloneNotSupportedException e) {

			System.err.println("Foo not suports clone operation");
			System.exit(1);

		}

	} // end main method

} // end CloneMethodDemo class

class Foo implements Cloneable {
	
	private String var;

	Foo(String var) {
		
		this.var = var;

	} // end Foo constructor -- String

	String getVar() {
		
		return var;

	} // end getVar method

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();

	} // end clone method

} // end Foo class