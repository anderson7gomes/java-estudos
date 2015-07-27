class EnumTest {

	public static void main(String[] args) {

		Color color = Color.RED;

		System.out.println("color is: " + color);

		System.out.println("All colors:");

		for (Color c : Color.values()) {
			System.out.println(c);
		} 

		color = Color.valueOf("BLUE");

		String message = "Now color is ";

		switch (color) {

			case RED: message += "red"; break;

			case GREEN: message += "green"; break;

			case BLUE: message += "blue"; break;

			case YELLOW: message += "yellow"; break;

		}

		System.out.println(message);

	} // end main method

} // end EnumTest class

enum Color {

	RED, GREEN, BLUE, YELLOW;

	@Override
	public String toString() {

		return "value of color is " + super.toString();

	} // end toString method

} // end Color enum