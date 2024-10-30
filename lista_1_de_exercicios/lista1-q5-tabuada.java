/*
5 - Tabuada: Crie um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10.
*/

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value;
        boolean sair = false;
        int opcao;
        int resultado;
        
        while(!sair){
            System.out.println("---------------------------------");
            System.out.println("Informe qual tabuada voce desejada: ");
            value = Integer.parseInt(scanner.nextLine());
            
            for(int i = 1; i <= 10; i++){
                resultado = i*value;
                System.out.println(value + " X " + i + " = " + resultado);
            }
            
            System.out.println("Deseja sair? 1 - NAO // 2 - SIM");
            opcao = Integer.parseInt(scanner.nextLine());
            if(opcao == 2){
                sair = true;
            }
        }
    }
}