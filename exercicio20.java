import javax.swing.JOptionPane;

public class exercicio20 {
    public static void main(String[] args) {
        int[] votos = new int[3]; // 3 candidatos
        int voto;
        
        do {
            String menu = "VOTE:\n1-Candidato A\n2-Candidato B\n3-Candidato C\n0-Encerrar";
            voto = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            if(voto >= 1 && voto <= 3) {
                votos[voto-1]++;
            }
        } while(voto != 0);
        
        String resultado = "Resultado:\nCandidato A: " + votos[0] + 
                         "\nCandidato B: " + votos[1] + 
                         "\nCandidato C: " + votos[2];
        JOptionPane.showMessageDialog(null, resultado);
    }
}