import java.util.Scanner;

public class exercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;
        
        for(int i = 0; i < 10; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        
        System.out.println("Média: " + (soma/10));
        sc.close();
    }
}