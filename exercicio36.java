import javax.swing.JOptionPane;

public class exercicio36{
    public static void main(String[] args) {
        int op;
        
        do {
            String menu = "MENU\n1-Opção 1\n2-Opção 2\n0-Sair";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(op) {
                case 1: JOptionPane.showMessageDialog(null, "Opção 1"); break;
                case 2: JOptionPane.showMessageDialog(null, "Opção 2"); break;
            }
        } while(op != 0);
    }
}