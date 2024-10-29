/*
3 - Fibonacci Iterativo: Escreva um programa que gere os primeiros n números da
sequência de Fibonacci de forma iterativa, onde n é informado pelo usuário.
*/
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean sair = false;
        
        while(!sair){
            int n;
            int ultimo = 1;
            int penultimo = 1;
            int resultado = 0;
            int opcao;
            
            System.out.println("------------------------------");
            System.out.println("SEQUENCIA FIBONACCI");
            System.out.println("Informe a quantidade n de elementos da sequencia: ");
            
            n = Integer.parseInt(scanner.nextLine());
            
            if(n == 1){
                System.out.println(ultimo);
            }else{
                if(n == 2){
                    System.out.println(ultimo + " " + penultimo);
                }else{
                    System.out.print(ultimo + " " + penultimo + " ");
                    n -= 2;
                    while(n > 0){
                        resultado = ultimo + penultimo;
                        penultimo = ultimo;
                        ultimo = resultado;
                        System.out.print(resultado + " ");
                        n--;
                    }
                }
            }
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("Deseja sair? 1- SIM // 2 - NAO");
            opcao = Integer.parseInt(scanner.nextLine());
            if(opcao == 1){
                sair = true;
            }
        }
    }
}