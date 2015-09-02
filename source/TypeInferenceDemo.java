import java.util.Scanner;

class GenericClass<T, V> {

	T ob1;
	V ob2;
	
	GenericClass(T ob1, V ob2) {
	
		this.ob1 = ob1;
		this.ob2 = ob2;
	
	} // end GenericClass constructor -- T, V
	
	/*

	ambiguidade devido à erasure
	
	void set(T ob1) {
		this.ob1 = ob1;
	} // end set method
	
	void set(V ob2) {
		this.ob2 = ob2;
	} // end set method

	*/

	static void foo(GenericClass<?, ?> obj) {
	
		System.out.println("Inside foo static method");
	
	} // end foo method

} // end GenericClass class

class TypeInferenceDemo {

	public static void main(String[] args) {
	
		GenericClass<String, Short> aObject = new GenericClass<>("Anderson", 
				new Short("7"));
		
		System.out.printf("field value 1: %s\nfield value 2: %s\n", 
				aObject.ob1, aObject.ob2);
				
		GenericClass.foo(new GenericClass<>(new Scanner(System.in), "Gomes"));		
	
	} // end main method
	
} // end TypeInferenceDemo class
