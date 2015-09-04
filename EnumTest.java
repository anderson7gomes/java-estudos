class EnumTest {

	enum Color2 {RED}

	public static void main(String[] args) {

		Color color = Color.RED;

		System.out.println("color is: " + color);

		System.out.println("All colors and their ordinals:");

		for (Color c : Color.values()) {

			System.out.printf("%s %d\n", c, c.ordinal());

		} 

		color = Color.valueOf("BLUE");

		String message = "Now color is ";

		switch (color) {

			case RED: message += "red"; break;

			case GREEN: message += "green"; break;

			case BLUE: message += "blue"; break;

			case YELLOW: message += "yellow"; break;

		}

		if (Color.RED.compareTo(color) < 0) {
			System.out.printf("%s comes before %s\n", Color.RED.name(), color.name());
		}

		if (Color.RED.compareTo(color) > 0) {
			System.out.printf("%s comes before %s\n", color.name(), Color.RED.name());
		}

		if (Color.RED.compareTo(color) == 0) {
			System.out.printf("%s equals %s\n", color.name(), Color.RED.name());
		}

		if (Color2.RED.equals(Color.RED)) {
			System.out.println("Color2.RED equals Color.RED");
		} else {
			System.out.println("Color2.RED not equals Color.RED");
		}

		/* testando equals() com objeto de tipo diferente */

		if (Color2.RED.equals("Anderson")) {
			System.out.println("Color2.RED equals \"Anderson\"");
		} else {
			System.out.println("Color2.RED not equals \"Anderson\"");
		}

		Color.doStuff();

		System.out.println(message);

	} // end main method

} // end EnumTest class

enum Color {

	RED(2), GREEN(5), BLUE(), YELLOW(1);

	private int opacity;

	private Color(int opacity) {

		this.opacity = opacity;

	} // end Color constructor

	Color() {

		this(-1);

	} // end Color constructor

	public int getOpacity() {

		return opacity;

	} // end getOpacity method

	static void doStuff() {

		System.out.println("Inside doStuff()");

	} // end doStuff method

	@Override
	public String toString() {

		return String.format("Value of color is %s and its opacity is %s", 
				super.toString(), getOpacity());

	} // end toString method

} // end Color enum