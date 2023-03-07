import javax.swing.JOptionPane;

public class Alg356 {
    public static void main(String[] args) {
        String nomes[] = new String[15];
        double nota1[] = new double[15];
        double nota2[] = new double[15];
        double media[] = new double[15];
        String situacao[] = new String[15]; 

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog(null, "Digite seu nome");
            nota1[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota1"));
            nota2[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota2"));
            media[i] = Math.ceil((nota1[i] + nota2[i])/2);     

            if (media[i]>6) situacao[i] = "AP";
            else situacao[i] = "RP";
            

        }

        for (int i = 0; i < nomes.length; i++) {
            JOptionPane.showMessageDialog(null, "Nome: "+nomes[i]+"\nNota1: "+nota1[i]+"\nNota2: "+nota2[i]+"\nMedia: "+media[i]+"\nSituacao: "+situacao[i]);
        }
        
    }
}
