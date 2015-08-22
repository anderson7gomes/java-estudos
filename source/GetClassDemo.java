class GetClassDemo {
	
	public static void main(String[] args) {
		
		Object ref = new String("Hello");

		Class<?> refClass = ref.getClass(); 

		System.out.printf("ref's class: %s\n", refClass.getName());

		if (refClass.equals(Object.class)) {
			System.out.println("getClass() returns the class of reference");
		} else if (refClass.equals(String.class)) {
			System.out.println("getClass() returns the class of object");
		}

	} // end main method

} // end GetClassDemo class