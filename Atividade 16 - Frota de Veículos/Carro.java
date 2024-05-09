public class Carro extends Veiculo{
   private int numPortas;
   private int anoModelo;
   
   public Carro(String modelo, String placa, int anoFabr,
                  int anoModelo, int numPortas, double valor){
      super (modelo, placa, anoFabr, valor);
      setPortas(numPortas);
      setAnoModelo(anoModelo);
   }
   
   public void setPortas(int numPortas){
      this.numPortas = 2;
      if (numPortas > 2)   this.numPortas = numPortas;
   }
   
   public int getPortas(){
      return numPortas;
   }
   
   public void setAnoModelo(int anoModelo){
      this.anoModelo = anoModelo;
   }
   
   public int getAnoModelo(){
      return anoModelo;
   }
   
   public void imprime(){
      System.out.printf("\nVeiculo: %s\nPlaca: %7s\nFabr: %4d", modelo, placa, anoFabr);
      System.out.printf("\nModelo: %4d\n%02d Portas\nR$ %.2f\n", anoModelo, numPortas, valor);
   }            
}
