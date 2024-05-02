import java.util.Scanner;

public class NotasTurma {
    public static void main(String args[]) {
        final int ALUNOS = 5;
        final int PROVAS = 2;

        int lin, col;
        double mediaTurma = 0;

        double notas[][] = new double[ALUNOS][PROVAS];
        Scanner entrada = new Scanner(System.in);

        for (lin = 0; lin < ALUNOS; lin++) {
            System.out.printf("\nDigite as notas do %d o aluno: ", lin + 1);
            for (col = 0; col < PROVAS; col++)
                notas[lin][col] = entrada.nextDouble();
        }

        for (lin = 0; lin < ALUNOS; lin++) {
            for (col = 0; col < PROVAS; col++) {
                mediaTurma += notas[lin][col];
            }
        }
        mediaTurma /= (ALUNOS * PROVAS);

        System.out.println("\nNotas e Medias:");

        for (lin = 0; lin < ALUNOS; lin++) {
            double mediaAluno = 0;
            System.out.printf("\nAluno %d: ", lin + 1);
            for (col = 0; col < PROVAS; col++) {
                System.out.printf("%2.2f ", notas[lin][col]);
                mediaAluno += notas[lin][col];
            }
            mediaAluno /= PROVAS;
            System.out.printf(" - Media: %2.2f ", mediaAluno);
            
            if (mediaAluno > mediaTurma) {
                System.out.println(" - Acima da media");
            } else if (mediaAluno < mediaTurma) {
                System.out.println(" - Abaixo da media");
            } else {
                System.out.println(" - Dentro da media");
            }
        }

        System.out.printf("\nMedia da Turma: %2.2f\n", mediaTurma);
    }
}
