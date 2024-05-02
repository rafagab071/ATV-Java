public class ContaCorrente {
    private String NumConta;
    private String titular;
    private double saldo;

    public ContaCorrente(String NumConta, String titular, double saldo){
        this.NumConta = NumConta;
        this.titular = titular;

        if(saldo >= 0){
            this.saldo = saldo;
        }
        else {
            this.saldo = 0;
        }
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void deposito(double quantia){
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Foi depositado R$" + quantia + " em sua conta.");
        } else {
            System.out.println("O valor para depósito deve ser superior a R$0,00");
        }
    }
    public void saque(double quantia){
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Foi feito o saque de R$" + quantia + " de sua conta.");
        } else {
            System.out.println("Saldo insuficiente ou valor incorreto para realizar saque.");
        }
    }
    public void exibirDados(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Numero da Conta: " + NumConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("-----------------------------------------------------");
        
    }
    public static void main(String[] args){
        teste_contacorrente.test();
    }
}