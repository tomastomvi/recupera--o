import javax.swing.JOptionPane;
import java.util.Random;

public class exercicio46 {
    public static void main(String[] args) {
        Random rand = new Random();
        int secreto = rand.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;
        
        do {
            palpite = Integer.parseInt(JOptionPane.showInputDialog("Palpite (1-100):"));
            tentativas++;
            
            if(palpite < secreto) {
                JOptionPane.showMessageDialog(null, "MAIOR");
            } else if(palpite > secreto) {
                JOptionPane.showMessageDialog(null, "MENOR");
            }
        } while(palpite != secreto);
        
        JOptionPane.showMessageDialog(null, "Acertou em " + tentativas + " tentativas!");
    }
}