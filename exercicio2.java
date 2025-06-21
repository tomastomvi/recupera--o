import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                matriz[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Valor para ["+i+"]["+j+"]:"));
            }
        }
        
        StringBuilder sb = new StringBuilder("Matriz:\n");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                sb.append(matriz[i][j]).append("\t");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}

