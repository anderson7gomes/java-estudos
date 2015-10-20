import java.util.Enumeration;
import java.util.Hashtable;

class HashtableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<String, Double> hashtable = 
				new Hashtable(5, 0.80f);

		hashtable.put("Anderson", 5000.0);
		hashtable.put("Gomes", 4500.0);
		
		if (!hashtable.isEmpty()) {
			
			Enumeration<Double> enumValues = 
					hashtable.elements();

			Enumeration<String> enumKeys =
					hashtable.keys();		

			while (enumKeys.hasMoreElements()) {

				System.out.printf("%s: %s\n", 
						enumKeys.nextElement(),
						enumValues.nextElement());

			}	

		} else {
			System.out.println("Hashtable is empty");
		}		

	} // end main method

} // end HashtableDemo class