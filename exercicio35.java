import java.util.Scanner;

public class exercicio35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int cont = 0;
        int idade;
        
        System.out.println("Digite idades (-1 para parar):");
        while((idade = sc.nextInt()) != -1) {
            soma += idade;
            cont++;
        }
        
        if(cont > 0) {
            System.out.println("Média: " + ((double)soma/cont));
        } else {
            System.out.println("Nenhuma idade informada");
        }
        sc.close();
    }
}