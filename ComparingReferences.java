class ComparingReferences {

	public static void main(String[] args) {
	
		boolean b;
		
		Dog dog = new Dog();
		Pet pet = new Pet();
		Cat cat = new Cat();
		
		b = dog == pet;
		b = pet == pet;
		
		//b = cat == dog; won't compile
	
	}

} // fim da classe ComparingReferences

class Dog {}

class Pet extends Dog {}

class Cat {}
