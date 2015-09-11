class StringConstructorsDemo {
	
	public static void main(String[] args) {
		
		String str1 = new String("Anderson");

		System.out.println(str1);

		char[] chars = {'J', 'a', 'v', 'a'};

		String str2 = new String(chars);

		System.out.println(str2);

		char[] chars2 = {'U', 'n', 'i', 'v', 'e', 'r'};

		String str3 = new String(chars2, 0, 4);

		System.out.println(str3);

		StringBuilder sb = new StringBuilder("Gomes");

		String str4 = new String(sb);

		System.out.println(str4);

		String str5 = new String(str4);

		System.out.println(str5);

		byte[] bytes = {65, 66, 67};

		String str6 = new String(bytes);

		System.out.println(str6);

		CharSequence[] sequences = new CharSequence[2];
		sequences[0] = str5;
		sequences[1] = sb;

		for (int i = 0; i < sequences.length; i++) {
			System.out.println(sequences[i]);
		}

	} // end main method

} // end StringConstructorsDemo class