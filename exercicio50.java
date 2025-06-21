import javax.swing.JOptionPane;

public class exercicio50 {
    public static void main(String[] args) {
        double saldo = 1000;
        int op;
        
        do {
            String menu = "SISTEMA BANCÁRIO\nSaldo: R$" + saldo + 
                        "\n1-Depósito\n2-Saque\n3-Saldo\n0-Sair";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(op) {
                case 1:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Valor depósito:"));
                    saldo += deposito;
                    break;
                case 2:
                    double saque = Double.parseDouble(JOptionPane.showInputDialog("Valor saque:"));
                    if(saque <= saldo) {
                        saldo -= saque;
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo: R$" + saldo);
                    break;
            }
        } while(op != 0);
    }
}