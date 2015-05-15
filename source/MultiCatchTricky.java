class AException extends Exception {}

class BException extends Exception {}

class CException extends Exception {}

class MultiCatchTricky {

	void throwExceptions() throws AException, BException {}
	
	public static void main(String[] args) throws AException, BException {
	
		MultiCatchTricky test = new MultiCatchTricky();
	
		try {
			test.throwExceptions();
		} catch (AException | BException e) {
			throw e;
		}
		
	} // fim do método main

} // fim da classe MultiCatchTricky
