public class TesteCarro{
   public static void test(){
      Carro c;
      
      c = new Carro("Civic", "RFK0071", 2019, 2019, 4, 120000);
      
      c.imprime();
      c.deprecia(10);
      
      System.out.println("Carro depreciado");
      c.imprime();
   }
}