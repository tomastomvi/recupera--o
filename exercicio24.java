import javax.swing.JOptionPane;

public class exercicio24 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        
        for(int i = 0; i < 10; i++) {
            nomes[i] = JOptionPane.showInputDialog("Nome " + (i+1) + ":");
        }
        
        StringBuilder sb = new StringBuilder("Nomes:\n");
        for(String nome : nomes) {
            sb.append(nome).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}