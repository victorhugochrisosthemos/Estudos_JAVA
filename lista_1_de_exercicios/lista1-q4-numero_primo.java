/*
4 - Verificador de Números Primos: Implemente um programa que verifique se um
número informado pelo usuário é primo ou não.
*/

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean sair = false;
        boolean verificacao;
        int opcao;
        int valor;
        int acumulador;
        
        while(!sair){
            verificacao = false;
            acumulador = 0;
            System.out.println("--------------------------------------");
            System.out.println("Informe um numero para vermos se eh primo: ");
            valor = Integer.parseInt(scanner.nextLine());
            for(int i = 1; i <= valor; i++){
                if(valor % i == 0){
                    //System.out.println(i + " eh divisivel");
                    acumulador++;
                }
            }
            if(acumulador == 2){
                verificacao = true;
            }
            if(verificacao == true){
                System.out.println(valor + " EH primo!");
            }else{
                System.out.println(valor + " NAO eh primo!");
            }
            System.out.println("Deseja continuar? 1 - SIM // 2 - NAO");
            opcao = Integer.parseInt(scanner.nextLine());
            if(opcao == 2){
                sair = true;
            }
        }
        
    }
}