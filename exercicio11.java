import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU\n1-Opção 1\n2-Opção 2\n3-Opção 3");
        System.out.print("Escolha: ");
        int op = sc.nextInt();
        
        switch(op) {
            case 1: System.out.println("Executando opção 1"); break;
            case 2: System.out.println("Executando opção 2"); break;
            case 3: System.out.println("Executando opção 3"); break;
            default: System.out.println("Opção inválida");
        }
        sc.close();
    }
}