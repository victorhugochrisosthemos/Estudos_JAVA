import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner scanner = new Scanner(System.in);
        double  resultado;
        double valor1 = scanner.nextDouble();
        resultado = 3.14159 * valor1 * valor1;
        System.out.println(String.format("A=%.4f", resultado));
 
    }
 
}
