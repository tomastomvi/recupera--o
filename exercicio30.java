import javax.swing.JOptionPane;

public class exercicio30 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos termos Fibonacci?"));
        int a = 0, b = 1;
        StringBuilder sb = new StringBuilder("Fibonacci:\n");
        
        for(int i = 0; i < n; i++) {
            sb.append(a).append(" ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}