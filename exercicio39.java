import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String LOGIN = "admin";
        final String SENHA = "1234";
        String l, s;
        
        do {
            System.out.print("Login: ");
            l = sc.nextLine();
            System.out.print("Senha: ");
            s = sc.nextLine();
        } while(!l.equals(LOGIN) || !s.equals(SENHA));
        
        System.out.println("Acesso concedido");
        sc.close();
    }
}