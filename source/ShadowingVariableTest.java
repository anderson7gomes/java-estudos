class Super {

	int number = 2;
	
	int getNumber() {
		return number;
	}

} // fim da classe Super

class Sub extends Super {

	int number = 6;
	
	@Override
	int getNumber() {
		return number;
	}

} // fim da classe Sub

class ShadowingVariableTest {

	public static void main( String[] args ) {
	
		Super[] supers = { new Super(), new Sub(), new Super() };
		
		for ( Super s : supers ) {
			System.out.println(s.getNumber());
		}
		
		Sub sub = new Sub();
		System.out.println(sub.getNumber());
	
	}

} // fim da classe ShadowingVariableTest
