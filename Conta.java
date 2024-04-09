import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.println("Insira o numero de 1 a 6 digitos: ");
            n = input.nextInt();
            if (n < 1 || n > 999999) {
                System.out.println("Entrada invalida. Por favor, insira um numero valido.");
            }
        } while (n < 1 || n > 999999);

        int s = 0;
        int d = n;

        while (d > 0) {
            s += d % 10;
            d /= 10;
        }
        s %= 10;
        System.out.printf("O numero da sua conta é: %06d" + " - " + "%d", n, s);
    }
}



