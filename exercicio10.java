import javax.swing.JOptionPane;

public class exercicio10 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        boolean simetrica = true;
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Valor para ["+i+"]["+j+"]:"));
            }
        }
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "A matriz " + (simetrica ? "é" : "não é") + " simétrica");
    }
}