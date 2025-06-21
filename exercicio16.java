import javax.swing.JOptionPane;

public class exercicio16 {
    public static void main(String[] args) {
        String produto = JOptionPane.showInputDialog("Digite um produto:").toLowerCase();
        String categoria;
        
        switch(produto) {
            case "arroz": case "feijão": case "macarrão":
                categoria = "Alimentos"; break;
            case "sabonete": case "shampoo": case "pasta":
                categoria = "Higiene"; break;
            case "tv": case "celular": case "notebook":
                categoria = "Eletrônicos"; break;
            default:
                categoria = "Outros";
        }
        
        JOptionPane.showMessageDialog(null, "Categoria: " + categoria);
    }
}