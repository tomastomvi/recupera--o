import java.util.Scanner;

public class exerciccio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("Valores do vetor:");
        for(int num : vetor) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}