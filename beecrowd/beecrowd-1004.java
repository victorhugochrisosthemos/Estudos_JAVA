import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        int valor1;
        int valor2;
        int resultado;
        
        valor1 = Integer.parseInt(scanner.nextLine());
        valor2 = Integer.parseInt(scanner.nextLine());
        
        resultado = valor1 * valor2;
        
        System.out.println("PROD = " + resultado);
 
    }
 
}
