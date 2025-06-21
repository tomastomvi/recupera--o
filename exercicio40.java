import javax.swing.JOptionPane;

public class exercicio40 {
    public static void main(String[] args) {
        int op;
        
        do {
            String menu = "CALCULADORA\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n0-Sair";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            if(op >= 1 && op <= 4) {
                double n1 = Double.parseDouble(JOptionPane.showInputDialog("Número 1:"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog("Número 2:"));
                double res = 0;
                
                switch(op) {
                    case 1: res = n1 + n2; break;
                    case 2: res = n1 - n2; break;
                    case 3: res = n1 * n2; break;
                    case 4: 
                        if(n2 != 0) res = n1 / n2;
                        else {
                            JOptionPane.showMessageDialog(null, "Erro: divisão por zero");
                            continue;
                        }
                        break;
                }
                
                JOptionPane.showMessageDialog(null, "Resultado: " + res);
            }
        } while(op != 0);
    }
}