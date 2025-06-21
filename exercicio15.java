import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int op;
        
        do {
            System.out.println("\nCAIXA ELETRÔNICO");
            System.out.println("1-Saldo\n2-Saque\n3-Depósito\n0-Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            
            switch(op) {
                case 1:
                    System.out.println("Saldo: R$" + saldo);
                    break;
                case 2:
                    System.out.print("Valor saque: R$");
                    double saque = sc.nextDouble();
                    if(saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.print("Valor depósito: R$");
                    saldo += sc.nextDouble();
                    System.out.println("Depósito realizado");
                    break;
            }
        } while(op != 0);
        sc.close();
    }
}