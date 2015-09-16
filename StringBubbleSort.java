class StringBubbleSort {

	public static void main(String[] args) {
	
		String[] strings = {"cama", "mesa", "banho", "Now"};
		
		for (int i = 0; i < strings.length - 1; i++) {
		
			for (int j = i + 1; j < strings.length; j++) {
			
				if (strings[j].compareToIgnoreCase(strings[i]) < 0) {
				
					String aux = strings[j];
					strings[j] = strings[i];
					strings[i] = aux;
				
				}
			
			}
		
		}
		
		System.out.println("Sorted strings:\n");
		
		for (String s : strings) {
			System.out.println(s);
		}
	
		System.out.println();
	
	} // end main method

} // end StringBubbleSort class
