import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int cont = 0;
        double nota;
        
        System.out.println("Digite notas (0-10), outro valor para parar:");
        while(true) {
            nota = sc.nextDouble();
            if(nota < 0 || nota > 10) break;
            soma += nota;
            cont++;
        }
        
        if(cont > 0) {
            System.out.println("Média: " + (soma/cont));
        } else {
            System.out.println("Nenhuma nota válida");
        }
        sc.close();
    }
}