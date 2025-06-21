import javax.swing.JOptionPane;

public class exercicio48{
    public static void main(String[] args) {
        char continuar;
        
        do {
            int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas?"));
            double soma = 0;
            
            for(int i = 0; i < qtd; i++) {
                soma += Double.parseDouble(JOptionPane.showInputDialog("Nota " + (i+1) + ":"));
            }
            
            JOptionPane.showMessageDialog(null, "Média: " + (soma/qtd));
            continuar = JOptionPane.showInputDialog("Calcular outra média? (S/N)").charAt(0);
        } while(Character.toUpperCase(continuar) == 'S');
    }
}