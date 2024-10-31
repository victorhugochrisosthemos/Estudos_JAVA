/*
6 - Fatorial: Faça um programa que calcule o fatorial de um número informado pelo
usuário.
*/


import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean sair = false;
        int number;
        int opcao;
        long acumulador;
        
        while(!sair){
            acumulador = 1;
            
            System.out.println("---------------------------------------");
            
            System.out.println("Vamos ver o fatorial de qual numero?");
            
            number = Integer.parseInt(scanner.nextLine());
            
            for(int i = 1; i <= number; i++){
                
                acumulador = (long)(acumulador * i);
                
                System.out.print(i + " ");
                if(i != number){
                     System.out.print("x ");
                }else{
                    System.out.println("= " + acumulador);
                }
                
            }
            
            System.out.println("Deseja Sair? 1 - NAO // 2 - SIM");
            
            opcao = Integer.parseInt(scanner.nextLine());
            
            if(opcao == 2){
                sair = true;
            }
        }
        
        System.out.println("FIM");
    }
}