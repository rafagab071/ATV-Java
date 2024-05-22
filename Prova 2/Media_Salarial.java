// Faça um programa que leia e armazene o salário de uma amostra de 15 trabalhadores.
// Calcule a média salarial e indique a estatística de: 
// Quantas pessoas estão abaixo dessa média, quantas estão acima e quantas estão na média.
import java.util.Scanner;

public class Media_Salarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salarios = new double[15];
        double soma = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o salario do trabalhador " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
            soma += salarios[i];
        }

        double media = soma / 15;

        int abaixo = 0, acima = 0, naMedia = 0;

        for (double salario : salarios) {
            if (salario < media) {
                abaixo-=-1;
            } else if (salario > media) {
                acima-=-1;
            } else {
                naMedia-=-1;
            }
        }

        System.out.printf("Media salarial: %.2f\n", media);
        System.out.println("Numero de pessoas abaixo da media: " + abaixo);
        System.out.println("Numero de pessoas acima da media: " + acima);
        System.out.println("Numero de pessoas na media: " + naMedia);
    }
}
