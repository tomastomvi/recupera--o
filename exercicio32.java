import javax.swing.JOptionPane;

public class exercicio32 {
    public static void main(String[] args) {
        int i = 1;
        StringBuilder sb = new StringBuilder("Números 1-20:\n");
        
        while(i <= 20) {
            sb.append(i).append(" ");
            i++;
        }
        
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}