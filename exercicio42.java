import javax.swing.JOptionPane;

public class exercicio42 {
    public static void main(String[] args) {
        int positivos = 0;
        double num;
        
        do {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número (negativo para parar):"));
            if(num >= 0) positivos++;
        } while(num >= 0);
        
        JOptionPane.showMessageDialog(null, "Positivos digitados: " + positivos);
    }
}