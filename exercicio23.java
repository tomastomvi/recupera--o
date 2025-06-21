import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        
        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) cont++;
        }
        
        System.out.println("Pares entre 1-50: " + cont);
        sc.close();
    }
}