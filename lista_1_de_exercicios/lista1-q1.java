/*  
1 - Calculadora Simples: Crie um programa que solicite dois números ao usuário e realize
as operações de soma, subtração, multiplicação e divisão entre eles.
*/

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor1;
        int valor2;
        int opcao;
        int resultado = 0;
        
        boolean sair = false;
        while(!sair){
            System.out.println("CALCULADORA DE NUMEROS INTEIROS");
            System.out.println("1. Soma");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("5. Sair do programa");
            System.out.println("Escolha uma opcao: ");
            opcao = Integer.parseInt(scanner.nextLine());
            
            if(opcao != 5){
                System.out.println("Informe o primeiro valor: ");
                valor1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Informe o segundo valor: ");
                valor2 = Integer.parseInt(scanner.nextLine());
                switch(opcao){
                case 1:
                    resultado = valor1 + valor2;
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    break;
                case 3:
                    resultado = valor1 * valor2;;
                    break;
                case 4:
                    resultado = valor1 / valor2;
                    break;
                }
                System.out.println("Resultado = " + resultado);
                
            }else{
                sair = true;
            }
            System.out.println("-------------------------");
            
        }
    }
}