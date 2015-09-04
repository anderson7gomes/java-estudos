class Animal {

	void makeNoise() { 
		System.out.println("generic noise");	
	}

} // fim da classe Animal

class Dog extends Animal {

	@Override
	void makeNoise() {
		System.out.println("bark");
	}
	
	void playDead() {
		System.out.println("roll over");
	}

} // fim da classe Dog

class CastTest2 {

	public static void main(String[] args) {
	
		Animal[] animals = { new Animal(), new Dog(), new Animal() };
		
		for ( Animal animal : animals ) {
		
			if ( animal instanceof Dog ) {
				( (Dog) animal ).playDead();
			}
		
		}
	
	} // fim do método main

} // fim da classe CastTest2
