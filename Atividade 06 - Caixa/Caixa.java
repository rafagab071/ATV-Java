import java.util.Scanner;

public class Caixa {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float v, total = 0;
        
        do {
            System.out.println("Digite o valor do produto (use virgula): \n" + "Para finalizar a entrada, digite 0");
            v = input.nextFloat();
            if (v < 50.00) {
                total += v * 0.95; // Aplica 5% de desconto
            } else if (v >= 50.00 && v <= 100.00) {
                total += v * 0.90; // Aplica 10% de desconto
            } else if (v > 100.00 && v <= 200.00) {
                total += v * 0.85; // Aplica 15% de desconto
            } else if (v > 200) {
                total += v * 0.80; // Aplica 20% de desconto
            }
        } while (v > 0);
        
        System.out.printf("O valor total da compra com desconto foi: R$ %.2f", total);
    }
}
