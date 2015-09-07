@FunctionalInterface
interface MyFunc {

	int func();

} // end MyFunc interface

class VariableCaptureDemo {

	public static void main(String[] args) {
	
		int number = 7;
	
		MyFunc target = () -> number;
		
		System.out.println(target.func());
		
		foo(target);
	
	} // end main method
	
	static void foo(MyFunc target) {
	
		System.out.println("Inside foo method " + target.func());

	} // end foo methdo

} // end VariableCaptureDemo class
