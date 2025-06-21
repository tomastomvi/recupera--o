import java.util.Scanner;

public class exercicio45{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        char continuar;
        
        do {
            System.out.print("Valor do item: R$");
            total += sc.nextDouble();
            System.out.print("Mais itens? (S/N) ");
            continuar = sc.next().charAt(0);
        } while(Character.toUpperCase(continuar) == 'S');
        
        System.out.printf("Total: R$%.2f", total);
        sc.close();
    }
}