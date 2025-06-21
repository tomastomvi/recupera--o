import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Nome aluno " + (i+1) + ": ");
            nomes[i] = sc.nextLine();
            System.out.print("Nota: ");
            notas[i] = sc.nextDouble();
            sc.nextLine(); // Limpar buffer
        }
        
        System.out.println("\nMédias:");
        for(int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + ": " + notas[i]);
        }
        sc.close();
    }
}