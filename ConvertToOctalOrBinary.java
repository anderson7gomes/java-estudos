import java.util.Scanner;
import java.util.Stack;

class ConvertToOctalOrBinary {

    private static final int OCTAL = 8;
    private static final int BINARY = 2;

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro " + 
                "positivo a ser convertido: ");
        int number = input.nextInt();

        int base = 0;
    
        do {
    
            System.out.println("Escolha a base(2 - binario, 8 - octal): ");
            base = input.nextInt();
            
            if (!isValidBase(base)) {
                System.out.println("Base inválida!");
            }   
        
        } while (!isValidBase(base));
        
        System.out.println("Valor convertido: " + toBase(number, base));
    
    } // end method main
    
    private static String toBase(int num, final int base) {
    
        Stack<Integer> remaindersStack = new Stack<>();
        
        int quotient = base; // para poder entrar no loop
        
        while (quotient > base - 1) {
        
            quotient = num / base;
        
            remaindersStack.push(num % base);
            
            num = quotient;
        
        }
        
        if (quotient > 0) {
            remaindersStack.push(quotient);
        }
        
        StringBuilder binary = new StringBuilder();

        while (!remaindersStack.empty()) {
            binary.append(remaindersStack.pop());
        }
        
        return binary.toString();
    
    } // end method toBase
    
    private static boolean isValidBase(int base) {
    
        return (base == BINARY || base == OCTAL);
    
    } // end method isValidBase

} // end class ConvertToOctalOrBinary
