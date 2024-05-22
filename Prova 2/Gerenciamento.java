// Implemente o seguinte conjunto de classes usando herança. 
// Codifique um programa que leia os dados de 5 funcionários, armazene em vetor e exiba seus dados usando polimorfismo. 
// Observe que a classe funcionário é abstrata e o pagamento do funcionário é calculado nas subclasses concretas: 
// Programador (possui salário mensal) e Instrutor (recebe de acordo com as horas trabalhadas).
import java.util.Scanner;

public class Gerenciamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o tipo de funcionario (1- Programador, 2- Instrutor): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o email: ");
            String mail = scanner.nextLine();

            if (tipo == 1) {
                System.out.println("Digite a linguagem: ");
                String linguagem = scanner.nextLine();

                System.out.println("Digite o salario mensal: ");
                float salario = scanner.nextFloat();

                Programador programador = new Programador(nome, mail, linguagem);
                programador.setSalario(salario);
                funcionarios[i] = programador;

            } else if (tipo == 2) {
                System.out.println("Digite a disciplina: ");
                String disciplina = scanner.nextLine();

                System.out.println("Digite as horas mensais: ");
                int horasMensais = scanner.nextInt();

                System.out.println("Digite o valor por hora de aula: ");
                float valorHoraAula = scanner.nextFloat();

                Instrutor instrutor = new Instrutor(nome, mail, disciplina);
                instrutor.setHorasMensais(horasMensais);
                instrutor.setValorHoraAula(valorHoraAula);
                funcionarios[i] = instrutor;
            }
        }

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibeDados();
            System.out.println();
        }

        scanner.close();
    }
}
