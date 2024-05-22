class Instrutor extends Funcionario {
    private String disciplina;
    private int horasMensais;
    private float valorHoraAula;

    public Instrutor(String nome, String mail, String disciplina) {
        super(nome, mail);
        this.disciplina = disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setHorasMensais(int horas) {
        this.horasMensais = horas;
    }

    public void setValorHoraAula(float valor) {
        this.valorHoraAula = valor;
    }

    public float pagamento() {
        return horasMensais * valorHoraAula;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + mail);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Horas Mensais: " + horasMensais);
        System.out.println("Valor por Hora de Aula: " + valorHoraAula);
        System.out.println("Pagamento Mensal: " + pagamento());
    }
}
