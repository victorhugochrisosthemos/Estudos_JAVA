/* 
2 - Conversor de Temperatura: Faça um programa que converta uma temperatura em
Celsius para Fahrenheit e vice-versa. O usuário deve informar a temperatura e a escala
desejada.
*/
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        int valor;
        float resultado = 0;
        boolean sair = false;
        
        while(!sair){
        System.out.println("CONVERSAO DE TEMPERATURA");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Celsius para Kelvin");
        System.out.println("3. Fahrenheit para Celsius");
        System.out.println("4. Fahrenheit para Kelvin");
        System.out.println("5. Kelvin para Celsius");
        System.out.println("6. Kelvin para Fahrenheit");
        System.out.println("7. Sair");
        System.out.println("Escolha uma opcao: ");
        opcao = Integer.parseInt(scanner.nextLine());
        if(opcao != 7){
            System.out.println("Informe o valor de entrada: ");
            valor = Integer.parseInt(scanner.nextLine());
            switch(opcao){
                case 1:
                    resultado = (float)((valor * 1.8) + 32);
                    break;
                case 2:
                    resultado = (float)(valor + 273);
                    break;
                case 3:
                    resultado = (float)((valor - 32) / 1.8);
                    break;
                case 4:
                    resultado = (float)((valor - 32) * 5/9 + 273);
                    break;
                case 5:
                    resultado = (float)(valor - 273);
                    break;
                case 6:
                    resultado = (float)((valor - 273) * 1.8 + 32);
                    break;
            }
            System.out.println("Resultado: " + resultado);
        }else{
            sair = true;
        }
        System.out.println("-----------------------------");
        }
        
    }
}