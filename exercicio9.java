import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int maior = Integer.MIN_VALUE;
        int lin = 0, col = 0;
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("Valor para ["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    lin = i;
                    col = j;
                }
            }
        }
        
        System.out.println("Maior valor: " + maior + " na posição ["+lin+"]["+col+"]");
        sc.close();
    }
}