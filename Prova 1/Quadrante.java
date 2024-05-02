import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de pares de coordenadas: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite as coordenadas (x, y) do ponto %d: ", i + 1);
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (x == 0 && y == 0) {
                System.out.println("Origem");
            } else if (x == 0) {
                System.out.println("Eixo Y");
            } else if (y == 0) {
                System.out.println("Eixo X");
            } else if (x > 0 && y > 0) {
                System.out.println("Quadrante 1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante 2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante 3");
            } else {
                System.out.println("Quadrante 4");
            }
        }
    }
}
