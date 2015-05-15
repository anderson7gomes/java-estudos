/* exemplo que demonstra a utilização a utilização de try-with-resources */

import java.io.Closeable;

class One implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("One - Close");
	} // fim do método close

} // fim da classe One

class Two implements Closeable {

	@Override
	public void close() {
		System.out.println("Two - Close");
	} // fim do método close

} // fim da classe Two 

class TryWithResources {

	public static void main(String[] args) {
	
		try (One one = new One(); Two two = new Two()) {
		
			System.out.println("Try");	
			
			throw new RuntimeException();
		
		} catch (Exception e) {
			System.out.println("Catch");
		} finally {
			System.out.println("Finally");
		}
	
	} // fim do método main
	
} // fim da classe TryWithResources
