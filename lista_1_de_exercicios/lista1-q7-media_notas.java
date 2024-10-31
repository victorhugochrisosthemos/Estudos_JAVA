/*
7 - Média de Notas: Escreva um programa que solicite ao usuário as notas de três provas e
calcule a média final.
*/

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean sair = false;
        int opcao;
        int quantidade;
        int notas;
        float resultado;
        
        while(!sair){
            notas = 0;
            
            System.out.println("---------------------------------");
            System.out.println("Informe a quantidade de notas: ");
            quantidade = Integer.parseInt(scanner.nextLine());
            
            for(int i = 1; i <= quantidade; i++){
                System.out.print("Nota " + i + ": ");
                notas += Integer.parseInt(scanner.nextLine());
            }
            
            resultado = (float)(notas/quantidade);
            
            System.out.println("Media aritmetica: " + resultado);
            
            System.out.println("Deseja sair? 1 - NAO // 2 - SIM");
            opcao = Integer.parseInt(scanner.nextLine());
            if(opcao == 2){
                sair = true;
            }
        }
    }
}