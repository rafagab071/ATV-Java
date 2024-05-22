abstract class Funcionario {
    protected String nome;
    protected String mail;

    public Funcionario(String nome, String mail) {
        this.nome = nome;
        this.mail = mail;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public abstract float pagamento();

    public abstract void exibeDados();
}
