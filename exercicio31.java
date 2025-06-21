import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int num;
        
        System.out.println("Digite números (0 para parar):");
        while((num = sc.nextInt()) != 0) {
            soma += num;
        }
        
        System.out.println("Soma: " + soma);
        sc.close();
    }
}