class Wrappers {

	public static void main(String[] args) {

		System.out.println("----Character----\n");

		Character character = new Character('b');

		System.out.println(character);
		System.out.println(Character.toString(character));
		System.out.println(Character.valueOf(character));
		System.out.println(character.charValue());

		System.out.println("\n----Boolean----\n");

		Boolean bool1 = new Boolean("TrUe");
		Boolean bool2 = new Boolean(false);

		System.out.println(bool1);
		System.out.println(bool2);

		System.out.println(bool1.booleanValue());
		System.out.println(bool2.booleanValue());

		boolean bool3 = Boolean.parseBoolean("trus");

		System.out.println(bool3);

		System.out.println(Boolean.toString(true));

		Boolean bool4 = Boolean.valueOf("Yes");

		System.out.println(bool4);

		System.out.println(Boolean.TRUE.booleanValue());

		System.out.println("\n----Byte----\n");

		Byte byte1 = new Byte((new Integer(27).byteValue()));
		Byte byte2 = new Byte("27");

		System.out.println(byte1.byteValue());
		System.out.println(byte2);

		Byte byte3 = Byte.valueOf("28");
		System.out.println(byte3);

		System.out.println(Byte.parseByte("30"));

		Boolean b = 2 > 1;

		if (b) {
			System.out.println("2 > 1");
		}

	} // end method main

} // end Wrappers class