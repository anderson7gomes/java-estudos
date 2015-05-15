/* classe que demonstra a utilização de supressed exceptions */

import java.io.IOException;

class Bad implements AutoCloseable {

	String name;
	
	Bad(String name) {
		this.name = name;
	} // fim do construtor Bad com um parâmetro

	@Override
	public void close() throws IOException {
		throw new IOException("Close - " + name);
	} // fim do métod close

} // fim da classe Bad

class Supressed {

	public static void main(String[] args) {
	
		try (Bad bad1 = new Bad("1"); Bad bad2 = new Bad("2")) {
		
			System.out.println("Try");
		
		} catch (IOException e) {
			System.err.println(e.getMessage());
			
			for (Throwable t : e.getSuppressed()) {
				System.err.println("suppressed: " + t);
			}
			
		}
	
	} // fim do método main

} // fim da classe Supressed
