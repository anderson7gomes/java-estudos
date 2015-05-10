/* 
 * classe que demonstra a utilização de uma 
 * lambda expression simples sem argumentos 
 */
 
interface MyNumber {
	double getValue();
} // fim da interface funcional MyNumber

interface MyNumber2 {
	
	double getValue();
	double getOtherValue(int number);
	
} // fim da interface MyNumber2

class LambdaDemo {

	public static void main(String[] args) {
	
		MyNumber number;
		
		/*
		MyNumber2 number2 = (n) -> 3.14; error: MyNumber2 is not 
										 a functional interface
		*/								 
		
		number = () -> 123.45;
		System.out.println("number.getValue(): () -> 123.45: " 
				+ number.getValue());
		
		number = () -> Math.random() * 100;
		System.out.printf("%s %.2f\n", 
				"number.getValue(): () -> Math.random() * 100", 
				number.getValue());
		
		// number = () -> "123.45"; won't compile
	
	}

} // fim da classe LambdaDemo
