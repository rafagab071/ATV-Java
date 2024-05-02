public class Circulo {
    private double raio;
    public void setRaio(double r) {
        raio = r;
    }
    public double getRaio() {
        return raio;
    }
    public double calculaDiametro(){
        return raio * 2;
    }
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    public double calculaCircunferencia() {
        return 2 * Math.PI * raio;
    }
    public void exibeDados() {
        System.out.printf("Raio: %.2f\n", raio);
        System.out.printf("Diametro: %.2f\n",  calculaDiametro());
        System.out.printf("Area: %.2f\n", calculaArea());
        System.out.printf("Circunferencia: %.2f\n", calculaCircunferencia());
    }
    public static void main(String[] args) {
        teste_circulo.test();
    }

}



