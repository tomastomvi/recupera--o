import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] soma = new int[5];
        
        System.out.println("Vetor 1:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Posição " + i + ": ");
            vetor1[i] = sc.nextInt();
        }
        
        System.out.println("Vetor 2:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Posição " + i + ": ");
            vetor2[i] = sc.nextInt();
            soma[i] = vetor1[i] + vetor2[i];
        }
        
        System.out.println("Vetor soma:");
        for(int num : soma) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}