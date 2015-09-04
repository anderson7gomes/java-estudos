/* classe que demonstraa utilização do operador instanceof com arrays */

class Dog {}

class Beagle extends Dog {}

class InstanceOfInArrays {

	public static void main(String[] args) {
	
		Dog[] dogs = new Dog[3];
		Beagle[] beagles = new Beagle[2];
		
		if (beagles instanceof Dog[]) {
			System.out.println("beagles is instanceof Dog[]");
		} 
	
	}

}
