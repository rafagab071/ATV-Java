public class ContaCorrente {
    private String NumConta;
    private String titular;
    private double saldo;
    private double limite;

    // Construtor com saldo e limite
    public ContaCorrente(String NumConta, String titular, double saldo, double limite){
        this.NumConta = NumConta;
        this.titular = titular;
        this.limite = limite;

        if(saldo >= 0){
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    // Construtor sobrecarregado com limite padrão de R$1000,00
    public ContaCorrente(String NumConta, String titular, double saldo){
        this(NumConta, titular, saldo, 1000);
    }

    // Construtor sobrecarregado com número da conta e titular
    // Saldo e limite inicializados com 0
    public ContaCorrente(String NumConta, String titular){
        this(NumConta, titular, 0, 0);
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void deposito(double quantia){
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Foi depositado R$" + quantia + " em sua conta.");
        } else {
            System.out.println("O valor para deposito deve ser superior a R$0,00");
        }
    }

    public void saque(double quantia){
        if (quantia > 0 && quantia <= saldo + limite) {
            saldo -= quantia;
            System.out.println("Foi feito o saque de R$" + quantia + " de sua conta.");
        } else {
            System.out.println("Nao foi possivel realizar o saque de R$" + quantia + ". Recursos insuficientes.");
        }
    }

    public void exibirDados(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Numero da Conta: " + NumConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: R$" + limite);
        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args){
        teste_contacorrente.test();
    }
}
