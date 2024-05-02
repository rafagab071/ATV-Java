import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para calcular o enesimo termo da sequencia de Fibonacci: ");
        int n = scanner.nextInt();

        int[] fibonacci = new int[n + 1];
        
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.printf("O %d termo da sequencia de Fibonacci eh: %d\n", n, fibonacci[n]);
        
        System.out.print("Os numeros da sequencia de Fibonacci ate " + n + " sao: { ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci[i] + ", ");
        }
        System.out.print("}");
        System.out.println();
    }
}
