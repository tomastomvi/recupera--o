import java.util.Scanner;

public class exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        
        System.out.println("Números 1-10:");
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= 10);
        sc.close();
    }
}