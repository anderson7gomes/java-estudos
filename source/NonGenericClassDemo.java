class NonGenericClassDemo {
	
	public static void main(String[] args) {
		
		NonGenericClass iOb = new NonGenericClass(42);

		System.out.printf("Type of iOb: %s\n", iOb.getTypeClassName());
				
		int v = (Integer) iOb.getField();			
				
		System.out.printf("value: %s\n", v);	
		
		NonGenericClass sOb = new NonGenericClass("Generic String");
				
		System.out.printf("\nType of sOb: %s\n", sOb.getTypeClassName());
				
		System.out.printf("value: %s\n", sOb.getField());
		
		iOb = sOb; // semantically wrong, but sintatically correct
		
	   // v = (Integer) iOb.getField(); // causes a runtime error						

	} // end main method

} // end NonGenericClassDemo class

class NonGenericClass {
	
	Object field;

	NonGenericClass(Object fieldValue) {
		
		field = fieldValue;

	} // end constructor - Object

	String getTypeClassName() {

		return field.getClass().getName();

	} // end getTypeClassName method

	Object getField() {
		
		return field;

	} // end getField method

} // end NonGenericClass class
