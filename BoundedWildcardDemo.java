class TwoD {
	
	private int x;
	private int y;

	TwoD(int x, int y) {
		
		this.x = x;
		this.y = y;

	} // end TwoD constructor -- x, y

	int getX() {
		return x;
	} // end getX method

	int getY() {
		return y;
	} // end getX method

} // end TwoD class

class ThreeD extends TwoD {
	
	private int z;

	ThreeD(int x, int y, int z) {
		
		super(x, y);
		
		this.z = z;

	} // end ThreeD constructor -- int, int, int

	int getZ() {
		return z;
	} // end getZ method

} // end ThreeDemo class

class FourD extends ThreeD {
	
	private int t;

	FourD(int x, int y, int z, int t) {
		
		super(x, y, z);

		this.t = t;

	} // end FourD constructor -- int, int, int, int

	int getT() {
		return t;	
	} // end getT method

} // end FourD class

class Coords<T extends TwoD> {
	
	private T[] coordinates;

	Coords(T[] coords) {
		this.coordinates = coords;
	} // end Coords constructor -- T[]

	T get(int index) {
		
		if (index < 0 || index >= coordinates.length) {
			throw new IllegalArgumentException("Invalid index");
		}

		return coordinates[index];

	} // end get method

	int size() {
		return coordinates.length;
	} // end size method

	static void showXYCoordinates(Coords<?> c, String name) {
		
		System.out.println("X Y coordinates of " + name);

		for (int i = 0; i < c.size(); i++) {

			System.out.printf("\n%d  %d", c.get(i).getX(), 
					c.get(i).getY());

		}

		System.out.println();

	} // end showXYCoordinates method

	static void showXYZCoordinates(Coords<? extends ThreeD> c, String name) {
		
		System.out.println("X Y Z coordinates of " + name);

		for (int i = 0; i < c.size(); i++) {

			System.out.printf("\n%d  %d  %d", c.get(i).getX(), 
					c.get(i).getY(), c.get(i).getZ());

		}

		System.out.println();

	} // end showXYZCoordinates method

	static void showXYZTCoordinates(Coords<? extends FourD> c, String name) {
		
		System.out.println("X Y Z T coordinates of " + name);

		for (int i = 0; i < c.size(); i++) {

			System.out.printf("\n%d  %d  %d  %d", c.get(i).getX(),
					c.get(i).getY(), c.get(i).getZ(), c.get(i).getT());

		}

		System.out.println();

	} // end showXYZTCoordinates method

} // end Coords class

class BoundedWildcardDemo {
	
	public static void main(String[] args) {
		
		TwoD[] twoD = {new TwoD(1, 2), new TwoD(2, 3),
					   new TwoD(3, 4)}; 

		ThreeD[] threeD = {new ThreeD(4, 5, 6), 
						   new ThreeD(6, 7, 8),
						   new ThreeD(8, 9, 10)};

		FourD[] fourD = {new FourD(10, 11, 12, 13),
						 new FourD(13, 14, 15, 16),
						 new FourD(16, 17, 18, 19)};				   

		Coords<TwoD> tdlocs = new Coords<TwoD>(twoD);
		Coords<ThreeD> thrdlocs = new Coords<ThreeD>(threeD);
		Coords<FourD> fdlocs = new Coords<FourD>(fourD);

		Coords.showXYCoordinates(tdlocs, "TwoD object");
		Coords.showXYCoordinates(thrdlocs, "ThreeD object");
		Coords.showXYCoordinates(fdlocs, "FourD object");

		Coords.showXYZCoordinates(thrdlocs, "ThreeD object");
		Coords.showXYZCoordinates(fdlocs, "FourD object");

		Coords.showXYZTCoordinates(fdlocs, "FourD object");

	} // end main method

} // end BoundedWildcardDemo