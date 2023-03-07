import java.util.Scanner;

public class Alg351 {
    public static void main(String[] args) {
       
        String nomes[] = {"ANITA","GUTO","JOAO","PEDRO", "FILIPE"};
        String palavra = "";
        boolean state = false;
        Scanner scan = new Scanner(System.in);

        while (true) {
            
            for (int i = 0; i < nomes.length; i++) {
                System.out.println("nome"+" "+nomes[i]);
            }
            palavra = scan.nextLine();  
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equals(palavra)){
                    System.out.println("encontrado na posicao: "+i);
                    state = true; 
                }
            }
            if (!state) {
            System.out.println("nome não encontrado");
            }

        }
        
        
    }
}
