/* classe que define alguns instance init e static init blocks */

class InitBlocksTest {

	static Object var;

	InitBlocksTest() { }
	
	{ var = new String("hello1"); }
	
	{ var = new String("hello2"); }

	static { var = new String("hello0"); }
	
	public static void main(String[] args) {
	
		InitBlocksTest blockTest = new InitBlocksTest();
		
		System.out.println(blockTest.var);
	
	}

} // fim da classe InitBlocksTest
