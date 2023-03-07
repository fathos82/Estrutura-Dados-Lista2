import javax.swing.JOptionPane;

public class Alg348{
    public static void main(String[] args){
        int qnt = 5;
        String nomes[] = new String[qnt];
        double notas1[] = new double[qnt];
        double notas2[] = new double[qnt];
        double medias[] = new double[qnt];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog(("Aluno"+(i+1)+", Digite seu nome: "));
            notas1[i] = Double.parseDouble(JOptionPane.showInputDialog(("Aluno"+(i+1)+", Digite sua nota1: ")));
            notas2[i] = Double.parseDouble(JOptionPane.showInputDialog(("Aluno"+(i+1)+", Digite seu nota2: ")));
            
            medias[i] = (notas1[i]+notas2[i]) / 2;
        }
        
        for (int i = 0; i < nomes.length; i++) {
            JOptionPane.showMessageDialog(null,"Nome: "+nomes[i]+"\n Nota1: "+notas1[i]+"\n Nota2: "+notas2[i]+"\n Media: "+medias[i]);
            
        }
          
    
    }
}