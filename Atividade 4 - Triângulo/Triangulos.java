//Programa que verifica se os três valores informados formam um Triângulo
//Em caso verdadeiro, ele informa o tipo de Triângulo formado

import java.util.Scanner;

public class Triangulos {
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      double l1, l2, l3;
      
      System.out.print("Digite o valor do primeiro lado do triangulo: ");
      l1 = input.nextDouble();
      
      System.out.print("Digite o valor do segundo lado do triangulo: ");
      l2 = input.nextDouble();
      
      System.out.print("Digite o valor do terceiro lado do triangulo: ");
      l3 = input.nextDouble();
      
      if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1){
         System.out.println("\nOs valores informados formam um triangulo\n");
         
         if (l1 == l2 && l1 == l3){
            System.out.println("Este e um triangulo Equilatero!");
         }
         else if (l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("Este e um triangulo Isoceles!");
         }
         else {
            System.out.println("Este e um triangulo Escaleno!");
         }
      }
      else {
         System.out.println("\nOs valores informados Nao formam um triangulo");
      }
   }
}
