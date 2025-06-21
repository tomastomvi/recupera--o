import javax.swing.JOptionPane;

public class exercicio26 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        StringBuilder sb = new StringBuilder("Tabuada do " + num + ":\n");
        
        for(int i = 1; i <= 10; i++) {
            sb.append(num).append(" x ").append(i).append(" = ").append(num*i).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}