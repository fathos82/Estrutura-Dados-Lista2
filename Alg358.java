import java.util.Scanner;

public class Alg358 {
    public static void main(String[] args) {
       
        int lucro1 = 0;
        int lucro2 = 0;
        int lucro3 = 0;

        Double compra; 
        Double venda;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor de compra dessa mercadoria: ");
            compra = scan.nextDouble();
            System.out.print("Digite o valor de venda dessa mercadoria: ");
            venda = scan.nextDouble();

            if (venda < compra * 1.1) {
                lucro1 += 1;
            } else if (venda <= compra * 1.2) {
                lucro2 += 1;
            } else {
                lucro3 += 1;
            }
        }

        scan.close();

        System.out.println("Pecas com menos de 10% de lucro: " + lucro1);
        System.out.println("Pecas com menos de 20% de lucro: " + lucro2);
        System.out.println("Pecas com mais  de 20% de lucro: " + lucro3);
    }
}
    

