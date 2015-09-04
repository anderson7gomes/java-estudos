class GenericClass<T extends Number> {

	T ob;
	
	GenericClass(T ob) {
		this.ob = ob;
	} // end GenericClass constructor

	@Override
	public String toString() {
		return String.valueOf(ob.intValue());
	} // end toString method

} // end GenericClass class

class GenericValuesArrayDemo {

	public static void main(String[] args) {
	
		GenericClass<?>[] genArray = new GenericClass<?>[4];
		
		genArray[0] = new GenericClass<Integer>(5);
		genArray[1] = new GenericClass<Integer>(2);
		genArray[2] = new GenericClass<Integer>(7);
		genArray[3] = new GenericClass<Integer>(1);
		
		for (GenericClass<?> i : genArray) {
			System.out.println(i);
		}
	
	} // end main method

} // end GenericValuesArrayDemo class
