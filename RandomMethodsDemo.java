import java.util.Random;

class RandomMethodsDemo {

	public static void main(String[] args) {
	
		Random random = new Random();
		
		int randomInteger = random.nextInt();
		boolean randomBoolean = random.nextBoolean();
		double randomDouble = random.nextDouble();
		float randomFloat = random.nextFloat();
		long randomLong = random.nextLong();
		
		System.out.println(randomInteger);
		System.out.println(randomBoolean);
		System.out.println(randomDouble);
		System.out.println(randomFloat);
		System.out.println(randomLong + "\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextGaussian());
		}
	
	} // end main method

} // end RandomMethodsDemo class
