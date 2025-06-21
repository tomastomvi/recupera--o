import javax.swing.JOptionPane;

public class exercicio34 {
    public static void main(String[] args) {
        double soma = 0;
        int cont = 0;
        double num;
        
        do {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número positivo (negativo para parar):"));
            if(num >= 0) {
                soma += num;
                cont++;
            }
        } while(num >= 0);
        
        if(cont > 0) {
            JOptionPane.showMessageDialog(null, "Média: " + (soma/cont));
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número válido");
        }
    }
}