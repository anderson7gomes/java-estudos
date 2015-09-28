import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class LogarithmBase10Demo {

    public static void main(String[] args) {
    
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        
            System.out.print("Digite um número para calcular o logaritmo: ");
            double num = Integer.parseInt(br.readLine());
            
            double log = Math.log(num) / Math.log(10.0);
            
            System.out.println("Resultado: " + log);
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    } // end main method

} // end LogarithmBase10Demo class
