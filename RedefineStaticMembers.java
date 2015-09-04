class SuperStatic {

	static int number = 2;

	static void doStuff() {
		System.out.println("a");
	}

} // fim da classe SuperStatic

class SubStatic extends SuperStatic {

	static int number = 4;

	static void doStuff() {
		System.out.println("b");
	}

} // fim da classe SubStatic

class RedefineStaticMembers {

	public static void main(String[] args) {
	
		SuperStatic[] superStatics = { 
				new SuperStatic(), new SubStatic(), new SuperStatic() };
				
		for ( SuperStatic s : superStatics ) {
			s.doStuff();
			System.out.println( s.number );
		}		
	
		SubStatic sub = new SubStatic();
		sub.doStuff();
		System.out.println(sub.number);
	
	}

} // fim da classe RedefineStaticMembers
