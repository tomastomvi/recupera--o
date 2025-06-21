import javax.swing.JOptionPane;

public class exercicio12 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (1-7):"));
        String nomeDia;
        
        switch(dia) {
            case 1: nomeDia = "Domingo"; break;
            case 2: nomeDia = "Segunda"; break;
            case 3: nomeDia = "Terça"; break;
            case 4: nomeDia = "Quarta"; break;
            case 5: nomeDia = "Quinta"; break;
            case 6: nomeDia = "Sexta"; break;
            case 7: nomeDia = "Sábado"; break;
            default: nomeDia = "Inválido";
        }
        
        JOptionPane.showMessageDialog(null, "Dia: " + nomeDia);
    }
}