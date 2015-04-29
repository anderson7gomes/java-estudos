class InstanceofTest {

	public static void main(String[] args) {
	
		Face f1 = new Bar();
		Face f2 = new Foo();
		Bar b1 = new Bar();
		Bar b2 = new Foo();
		Foo foo = new Foo();
		
		/* for f1 */
		
		if (f1 instanceof Face) { 
			System.out.println("f1 instanceof Face");
		} 
		
		if (f1 instanceof Bar) { 
			System.out.println("f1 instanceof Bar");
		} 
		
		if (f1 instanceof Foo) { 
			System.out.println("f1 instanceof Foo");
		} 
		
		if (f1 instanceof Object) { 
			System.out.println("f1 instanceof Object");
		} 
	
		/* for f2 */
		
		if (f2 instanceof Face) { 
			System.out.println("f2 instanceof Face");
		} 
		
		if (f2 instanceof Bar) { 
			System.out.println("f2 instanceof Bar");
		} 
		
		if (f2 instanceof Foo) { 
			System.out.println("f2 instanceof Foo");
		} 
		
		if (f2 instanceof Object) { 
			System.out.println("f2 instanceof Object");
		}
		
		/* for b1 */
		
		if (b1 instanceof Face) { 
			System.out.println("b1 instanceof Face");
		} 
		
		if (b1 instanceof Bar) { 
			System.out.println("b1 instanceof Bar");
		} 
		
		if (b1 instanceof Foo) { 
			System.out.println("b1 instanceof Foo");
		} 
		
		if (b1 instanceof Object) { 
			System.out.println("b1 instanceof Object");
		}
		
		/* for b2 */
		
		if (b2 instanceof Face) { 
			System.out.println("b2 instanceof Face");
		} 
		
		if (b2 instanceof Bar) { 
			System.out.println("b2 instanceof Bar");
		} 
		
		if (b2 instanceof Foo) { 
			System.out.println("b2 instanceof Foo");
		} 
		
		if (b2 instanceof Object) { 
			System.out.println("b2 instanceof Object");
		}
		
		/* for foo */
		
		if (foo instanceof Face) { 
			System.out.println("foo instanceof Face");
		} 
		
		if (foo instanceof Bar) { 
			System.out.println("foo instanceof Bar");
		} 
		
		if (foo instanceof Foo) { 
			System.out.println("foo instanceof Foo");
		} 
		
		if (foo instanceof Object) { 
			System.out.println("foo instanceof Object");
		}
	
	}

} // fim da classe InstanceofTest

interface Face {}

class Bar implements Face {}

class Foo extends Bar {}
