import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Números de 1 a 10:");
        
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}