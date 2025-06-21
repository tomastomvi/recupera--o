import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pares = new int[10];
        System.out.println("Digite 10 números pares entre 2 e 20:");
        
        for(int i = 0; i < 10; i++) {
            System.out.print((i+1) + "º número: ");
            pares[i] = sc.nextInt();
        }
        
        System.out.println("Números pares digitados:");
        for(int num : pares) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}