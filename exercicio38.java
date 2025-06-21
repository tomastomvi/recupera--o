import javax.swing.JOptionPane;

public class exercicio38 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        StringBuilder sb = new StringBuilder("Contagem:\n");
        
        while(num >= 0) {
            sb.append(num).append("\n");
            num--;
        }
        
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}