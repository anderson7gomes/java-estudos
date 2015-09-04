/* classe que demonstra a utilização de blocos lambda */

import java.util.Scanner;

interface NumericFunc {
	int func(int n);
} // fim da interface funcional NumericFunc

class BlockLambdaDemo {

	public static void main(String[] args) {
	
		NumericFunc factorial = (n) -> {
		
			int result = 1;
			
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			
			return result;
		
		}; // fim do bloco lambda
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = input.nextInt();
		
		System.out.printf("O fatorial de %d é %d\n", num, factorial.func(num));
	
	}

} // fim da classe BlockLambdaDemo
