import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Operação (+-*/): ");
        char op = sc.next().charAt(0);
        
        double res;
        switch(op) {
            case '+': res = n1 + n2; break;
            case '-': res = n1 - n2; break;
            case '*': res = n1 * n2; break;
            case '/': 
                if(n2 != 0) res = n1 / n2;
                else {
                    System.out.println("Erro: divisão por zero");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }
        
        System.out.println("Resultado: " + res);
        sc.close();
    }
}