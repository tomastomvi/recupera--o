import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] clientes = new String[100];
        int total = 0;
        int op;
        
        do {
            System.out.println("\nCADASTRO CLIENTES");
            System.out.println("1-Adicionar\n2-Listar\n3-Editar\n4-Excluir\n0-Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine(); // Limpar buffer
            
            switch(op) {
                case 1:
                    if(total < clientes.length) {
                        System.out.print("Nome: ");
                        clientes[total++] = sc.nextLine();
                    } else {
                        System.out.println("Limite atingido");
                    }
                    break;
                case 2:
                    System.out.println("Clientes:");
                    for(int i = 0; i < total; i++) {
                        System.out.println((i+1) + ". " + clientes[i]);
                    }
                    break;
                case 3:
                    System.out.print("Número do cliente: ");
                    int editar = sc.nextInt() - 1;
                    sc.nextLine();
                    if(editar >= 0 && editar < total) {
                        System.out.print("Novo nome: ");
                        clientes[editar] = sc.nextLine();
                    } else {
                        System.out.println("Inválido");
                    }
                    break;
                case 4:
                    System.out.print("Número do cliente: ");
                    int excluir = sc.nextInt() - 1;
                    if(excluir >= 0 && excluir < total) {
                        for(int i = excluir; i < total-1; i++) {
                            clientes[i] = clientes[i+1];
                        }
                        total--;
                    } else {
                        System.out.println("Inválido");
                    }
                    break;
            }
        } while(op != 0);
        sc.close();
    }
}