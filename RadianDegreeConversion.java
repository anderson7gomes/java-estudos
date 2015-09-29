class  RadianDegreeConversion {

	public static void main(String[] args) {
	
		System.out.printf("90 degrees is %.4f radians\n", Math.toRadians(90.0));
		
		System.out.printf("%.4f radians is %.4f degrees\n", 
				Math.toRadians(90.0), Math.toDegrees(Math.toRadians(90.0)));		
	
	} // end main method

} // end RadianDegreeConversion class
