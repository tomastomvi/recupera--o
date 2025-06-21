import javax.swing.JOptionPane;

public class exercicio44 {
    public static void main(String[] args) {
        StringBuilder nomes = new StringBuilder("Nomes:\n");
        String nome;
        
        do {
            nome = JOptionPane.showInputDialog("Digite um nome (fim para parar):");
            if(!nome.equalsIgnoreCase("fim")) {
                nomes.append(nome).append("\n");
            }
        } while(!nome.equalsIgnoreCase("fim"));
        
        JOptionPane.showMessageDialog(null, nomes.toString());
    }
}