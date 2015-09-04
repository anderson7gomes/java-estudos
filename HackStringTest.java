class String {

	private String s;

	String(String s) {
		this.s = s;
	}
	
	@Override
	public String toString() {
		return s;
	}
	
	public void doStuff() {
		System.out.println("stuff");
	}

} // fim da classe String

class HackStringTest {

	public static void main(String[] args) {
	
		String s = new String("Anderson");
		
		System.out.println(s);
	
	}

} // fim da classe HackStringTest
