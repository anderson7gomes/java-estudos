class ABSequence implements CharSequence, Appendable, Comparable<ABSequence> {

	private StringBuilder internalSequence;

	ABSequence(String sequence) {
	
		if (!isValidABSequence(sequence)) {
			throw new InvalidABSequenceException(sequence);
		}
		
		internalSequence = new StringBuilder(sequence);
	
	} // end ABSequence constructor
	
	public int compareTo(ABSequence sequence) {
	
		return internalSequence.toString().compareTo(sequence.toString());
	
	} // end compareTo method
	
	public char charAt(int index) {
	
		return internalSequence.charAt(index);
	
	} // end charAt method
	
	public int length() {
	
		return internalSequence.length();
	
	} // end length method
	
	public CharSequence subSequence(int startIndex, int stopIndex) {
	
		return internalSequence.subSequence(startIndex, stopIndex);
	
	} // end subSequence method
	
	public Appendable append(char c) {
	
		if (c != 'a' && c != 'b') {
			throw new IllegalArgumentException("character must be 'a' or 'b'");
		}
		
		internalSequence.append(c);
		
		return internalSequence;
	
	} // end append method -- char
	
	public Appendable append(CharSequence sequence) {
	
		if (!isValidABSequence(sequence.toString())) {
			throw new InvalidABSequenceException(sequence.toString());
		}
	
		internalSequence.append(sequence);
		
		return internalSequence;
	
	} // end append method -- CharSequence
	
	public Appendable append(CharSequence sequence, int start, int end) {
	
		if (!isValidABSequence(sequence.toString())) {
			throw new InvalidABSequenceException(sequence.toString());
		}
		
		internalSequence.append(sequence, start, end);
		
		return internalSequence;
	
	} // end append method -- CharSequence, int, int
	
	@Override
	public String toString() {
	
		return internalSequence.toString();
	
	} // end toString method

	static boolean isValidABSequence(String sequence) {
	
		for (int i = 0; i < sequence.length(); i++) {
		
			char character = sequence.charAt(i);
		
			if (character != 'a' && character != 'b') {
				return false;
			}
		
		}
		
		return true;
	
	} // end isValidABSequence method
	
	public static void main(String[] args) {
	
		ABSequence sequence = new ABSequence("abbaab");
		
		sequence.append('a');
		
		System.out.println(sequence);
	
	} // end main method

} // end ABSequence class

class InvalidABSequenceException extends RuntimeException {

	InvalidABSequenceException(String sequence) {
		
		super(sequence);
		
	} // end InvalidABSequenceException constructor -- String

} // end InvalidABSequenceException class
