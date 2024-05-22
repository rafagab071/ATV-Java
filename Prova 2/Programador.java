class Programador extends Funcionario {
    private String linguagem;
    private float salarioMensal;

    public Programador(String nome, String mail, String linguagem) {
        super(nome, mail);
        this.linguagem = linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setSalario(float salario) {
        this.salarioMensal = salario;
    }

    public float pagamento() {
        return salarioMensal;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + mail);
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Salario Mensal: " + salarioMensal);
    }
}
