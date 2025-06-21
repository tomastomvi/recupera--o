import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior = Double.MIN_VALUE;
        
        for(int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            double num = sc.nextDouble();
            if(num > maior) maior = num;
        }
        
        System.out.println("Maior número: " + maior);
        sc.close();
    }
}