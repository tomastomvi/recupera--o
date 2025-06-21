import javax.swing.JOptionPane;

public class exercicio6 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int cont = 0;
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Valor para ["+i+"]["+j+"]:"));
                if(matriz[i][j] > 10) cont++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Elementos > 10: " + cont);
    }
}