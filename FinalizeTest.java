/* classe que demonstra que a chamada ao método finalize não invoca a JVM */

class FinalizeTest {
	
	public static void main (String[] args) {
		
		Dog dog = new Dog();
		dog.finalize();
		
		System.out.println(dog);
		
	}
	
} // fim da classe FinalizeTest

class Dog {
	
	@Override
	public void finalize() {
		System.out.println("Finalizing...");
	}
	
	@Override
	public String toString() {
		return "Dog generic toString()";
	}

} // fim da classe Dog
