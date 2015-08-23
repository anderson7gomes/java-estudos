class GenericClassDemo {
	
	public static void main(String[] args) {
		
		GenericClass<Integer, String> isOb = 
				new GenericClass<Integer, String>(42, "Quarenta e Dois");

		System.out.printf("Type of field1 of isOb: %s\n", 
				isOb.getField1ClassName());	
				
		System.out.printf("Type of field2 of isOb: %s\n", 
				isOb.getField2ClassName());			
				
		System.out.printf("value of field1: %s\n", isOb.getField1());
		
		System.out.printf("value of field2: %s\n", isOb.getField2());	
		
	} // end main method

} // end GenericClassDemo class

class GenericClass<T, V> {
	
	T field1;
	V field2;

	GenericClass(T fieldValue1, V fieldValue2) {
		
		field1 = fieldValue1;
		field2 = fieldValue2;

	} // end constructor - T, V

	String getField1ClassName() {

		return field1.getClass().getName();

	} // end getField1ClassName method

	String getField2ClassName() {

		return field2.getClass().getName();

	} // end getField2ClassName method

	T getField1() {
		
		return field1;

	} // end getField1 method
	
	V getField2() {
		
		return field2;

	} // end getField2 method

} // end GenericClass class
