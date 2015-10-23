import java.util.BitSet;

class BitSetDemo {

	public static void main(String[] args) {
	
		BitSet bitSet1 = new BitSet();
		
		bitSet1.set(0);
		bitSet1.set(1);
		bitSet1.set(2);
		bitSet1.clear(2);
		bitSet1.set(5);
		
		BitSet bitSet2 = new BitSet();
		
		bitSet2.clear(0, 5);
		
		bitSet1.and(bitSet2);
		
		System.out.println(bitSet1);
	
		System.out.println(bitSet2);
	
		bitSet1.set(4, 8);
		
		bitSet1.flip(6, 8);
		
		System.out.println(bitSet1);
	
		System.out.println(bitSet1.nextClearBit(2));
	
	} // end main method

} // end BitSetDemo class
