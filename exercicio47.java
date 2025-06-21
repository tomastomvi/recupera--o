import java.util.Scanner;

public class exercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SENHA = "java123";
        String tentativa;
        int tentativas = 0;
        boolean acertou = false;
        
        do {
            System.out.print("Senha: ");
            tentativa = sc.nextLine();
            tentativas++;
            
            if(tentativa.equals(SENHA)) {
                acertou = true;
            } else if(tentativas < 3) {
                System.out.println("Erro! Tentativas restantes: " + (3-tentativas));
            }
        } while(!acertou && tentativas < 3);
        
        System.out.println(acertou ? "Acesso concedido" : "Acesso bloqueado");
        sc.close();
    }
}