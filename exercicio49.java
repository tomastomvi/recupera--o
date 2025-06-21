import java.util.Scanner;

public class exercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String LOGIN = "admin";
        final String SENHA = "1234";
        int tentativas = 0;
        boolean acesso = false;
        
        do {
            System.out.print("Login: ");
            String l = sc.nextLine();
            System.out.print("Senha: ");
            String s = sc.nextLine();
            tentativas++;
            
            if(l.equals(LOGIN) && s.equals(SENHA)) {
                acesso = true;
            } else if(tentativas < 3) {
                System.out.println("Erro! Tentativas restantes: " + (3-tentativas));
            }
        } while(!acesso && tentativas < 3);
        
        System.out.println(acesso ? "Acesso concedido" : "Acesso bloqueado");
        sc.close();
    }
}