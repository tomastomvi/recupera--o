import javax.swing.JOptionPane;

public class exercicio18 {
    public static void main(String[] args) {
        String[] opcoes = {"km-m", "m-cm", "cm-mm"};
        int op = JOptionPane.showOptionDialog(null, "Tipo de conversão:", 
            "Conversor", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
        double res;
        
        switch(op) {
            case 0: res = valor * 1000; break;
            case 1: res = valor * 100; break;
            case 2: res = valor * 10; break;
            default: res = 0;
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: " + res);
    }
}