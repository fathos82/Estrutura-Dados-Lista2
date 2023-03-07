import javax.swing.JOptionPane;

public class Alg346 {
    public static void main(String[] args) {
        String opcao; 
        String frase;
        while (true) {
            opcao = JOptionPane.showInputDialog(null, "MENU\n1 imprime o comprimento da frase\n2 para imprimeiro e os 2 ultimos caracteres\n3 imprima a frase espelhada\n4 encerrar programa");
            
            if (opcao.equals("4")) System.exit(0);

            frase = JOptionPane.showInputDialog(null, "Digite a frase: ");
            switch (opcao) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Comprimento da mensagem: "+frase.length());
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "2 primeiras letras: "+frase.substring(0, 2)+"2 ultimas: "+frase.substring(frase.length()-2));
                    break;
                case "3":
                String reverseFrase = ""; 
                    for (int i = frase.length() - 1; i >= 0 ; i--) {
                        reverseFrase += frase.charAt(i);
                    }
                    JOptionPane.showMessageDialog(null, "frase espelhada: "+reverseFrase);
                    break;
                
            }

        }
    }
}
