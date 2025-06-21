import javax.swing.JOptionPane;

public class exercicio22 {
    public static void main(String[] args) {
        int soma = 0;
        
        for(int i = 1; i <= 5; i++) {
            soma += Integer.parseInt(JOptionPane.showInputDialog("Número " + i + ":"));
        }
        
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}