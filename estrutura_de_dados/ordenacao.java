import java.util.Scanner;

class HelloWorld {
    
    //Compara elementos aa frente e os troca se estiverem na ordem errada
    public static int[] bubble(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] < a[j]){
                    int auxiliar = a[j];
                    a[j] = a[i];
                    a[i] = auxiliar;
                }
            }
        }
        return a;
    }
    
    //Divide e conquista, divide a lista em sublistas, ordena cada uma e depois mescla as sublistas.
    public static int[] merge(int[] a){
        return a;
    }
    
    public static int[] quick(int[] a){
        return a;
    }
    
    public static int[] heap(int[] a){
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        boolean sair = false;
        int opcao;
        int[] resultado;
        int[] vetor_inicial = new int[11];
        vetor_inicial[0] = 9;
        vetor_inicial[1] = 2;
        vetor_inicial[2] = 8;
        vetor_inicial[3] = 3;
        vetor_inicial[4] = 7;
        vetor_inicial[5] = 4;
        vetor_inicial[6] = 4;
        vetor_inicial[7] = 22;
        vetor_inicial[8] = 101;
        vetor_inicial[9] = 1;
        vetor_inicial[10] = 15;
        
        while(!sair){
            
            
            System.out.println("-------------------------------------");
            
            System.out.print("A array eh essa -> [");
            for(int i = 0; i < vetor_inicial.length; i++){
                System.out.print(vetor_inicial[i]);
                if(i != vetor_inicial.length - 1){
                    System.out.print(",");
                }
            }
            System.out.println("]");
            
            System.out.println("Tipos de ordenacao");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Merge Sort");
            System.out.println("3 - Quick Sort");
            System.out.println("4 - Heap Sort");
            System.out.print("Escolha uma opcao: ");
            opcao = Integer.parseInt(scanner.nextLine());
            switch(opcao){
                case 1:
                    
                    long startTime = System.nanoTime();
                    resultado = bubble(vetor_inicial);
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime);
                    System.out.println("- - - - - - - - - - - - - -");
                    System.out.println("Tempo de execucao do bubble sort: " + duration + " nanossegundos");
                    System.out.println("- - - - - - - - - - - - - -");
                    
                    break;
                case 2:
                    resultado = merge(vetor_inicial);
                    break;
                case 3:
                    resultado = quick(vetor_inicial);
                    break;
                case 4:
                    resultado = heap(vetor_inicial);
                    break;
            }
            
            System.out.print("Array Ordenada -> ");
            System.out.print("[");
            for(int i = 0; i < vetor_inicial.length; i++){
                System.out.print(vetor_inicial[i]);
                if(i != vetor_inicial.length - 1){
                    System.out.print(",");
                }
            }
            System.out.println("]");
            System.out.println("-  -  -  -  -  -  -  -  -  -  -  -");
            
            System.out.println("Deseja sair? 1 - NAO // 2 - SIM");
            opcao = Integer.parseInt(scanner.nextLine());
            if(opcao == 2){
                sair = true;
            }
        }
    }
}