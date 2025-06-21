import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SENHA = "morcegobr45";
        String tentativa;
        
        do {
            System.out.print("Senha: ");
            tentativa = sc.nextLine();
        } while(!tentativa.equals(SENHA));
        
        System.out.println("Acesso permitido");
        sc.close();
    }
}