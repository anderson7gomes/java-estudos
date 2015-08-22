class GenericClassDemo {
	
	public static void main(String[] args) {
		
		GenericClass<Integer> iOb = new GenericClass<Integer>(42);

		System.out.printf("Type of iOb: %s\n", 
				iOb.getTypeClassName());	
				
		System.out.printf("value: %s\n", iOb.getField());	
		
		GenericClass<String> sOb = 
				new GenericClass<String>("Generic String");
				
		System.out.printf("\nType of sOb: %s\n", 
				sOb.getTypeClassName());
				
		System.out.printf("value: %s\n", sOb.getField());						

	} // end main method

} // end GenericClassDemo class

class GenericClass<T> {
	
	T field;

	GenericClass(T fieldValue) {
		
		field = fieldValue;

	} // end constructor - T

	String getTypeClassName() {

		return field.getClass().getName();

	} // end getTypeClassName method

	T getField() {
		
		return field;

	} // end getField method

} // end GenericClass class