import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Valor para ["+i+"]["+j+"]:"));
            }
        }
        
        StringBuilder sb = new StringBuilder("Diagonal principal:\n");
        for(int i = 0; i < 3; i++) {
            sb.append(matriz[i][i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}