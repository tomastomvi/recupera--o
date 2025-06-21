import javax.swing.JOptionPane;

public class exercicio8 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int pares = 0;
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matriz[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Valor para ["+i+"]["+j+"]:"));
                if(matriz[i][j] % 2 == 0) pares++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Números pares: " + pares);
    }
}