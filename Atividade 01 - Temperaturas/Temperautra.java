import java.util.Scanner;

public class Temperautra
{
public static void main(String args[])
{
      Scanner input = new Scanner(System.in);
      float f, c;
      
      System.out.print("Digite a temperatura em Farenheit: ");
      f = input.nextFloat();
      
      c = (f-32) * (5.0f/9.0f);
      
      System.out.printf("A temperatura de %.2f em Celsius é %.2f\n", f, c);

}
}   
      