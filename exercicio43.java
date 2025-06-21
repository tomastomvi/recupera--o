import java.util.Scanner;

public class exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("\nMENU\n1-Opção 1\n2-Opção 2\n3-Opção 3\n0-Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            
            switch(op) {
                case 1: System.out.println("Opção 1"); break;
                case 2: System.out.println("Opção 2"); break;
                case 3: System.out.println("Opção 3"); break;
            }
        } while(op != 0);
        sc.close();
    }
}