import java.util.EnumSet;

class EnumSetMethodsDemo {

	public static void main(String[] args) {
	
		EnumSet<MyEnum> enumSet = EnumSet.of(MyEnum.ONE, MyEnum.TWO);
		
		System.out.println(enumSet);
		
		enumSet = EnumSet.range(MyEnum.TWO, MyEnum.FOUR);
		
		System.out.println(enumSet);
	
		enumSet = EnumSet.allOf(MyEnum.class);
		
		System.out.println(enumSet);
	
	} // end main method

} // end EnumSetMethodsDemo class

enum MyEnum {

	ONE, TWO, THREE, FOUR, FIVE

} // end MyEnum enum
