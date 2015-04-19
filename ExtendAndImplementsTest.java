interface Pet {

	void beFriendly();

} // fim da interface Pet

class Dog {

	public void beFriendly() {
		System.out.println("beFriendly da classe Dog");
	}

} // fim da classe Dog

class Beagle extends Dog implements Pet { } // fim da classe Beagle

class ExtendAndImplementsTest {

	public static void main(String[] args) {
	
		Pet pet = new Beagle();
		pet.beFriendly();
	
	}

} // fim da classe ExtendAndImplementsTest
