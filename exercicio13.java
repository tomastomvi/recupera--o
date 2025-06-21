import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);
        
        String tipo;
        switch(letra) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                tipo = "Vogal"; break;
            default:
                tipo = "Consoante";
        }
        
        System.out.println(tipo);
        sc.close();
    }
}