package U1.T5B;

import java.util.Scanner;
// Escribe un programa que ordene tres números enteros introducidos por teclado.
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Dime el primer numero entero: ");
    int numero1 = teclado.nextInt();

    System.out.print("Dime el segundo numero entero: ");
    int numero2 = teclado.nextInt();

    System.out.print("Dime el tercer numero entero: ");
    int numero3 = teclado.nextInt();

    if (((numero1 > numero2) && (numero1 > numero3)) && ((numero2 < numero1) &&(numero2 > numero3))){
      System.out.print("El orden sería: "+ numero1 +" "+ numero2 + " "+ numero3 );
    }else if (((numero2 > numero1) && (numero2 > numero3)) && ((numero3 < numero2) && (numero3 > numero1))){
      System.out.print("El orden sería: "+ numero2 +" "+ numero3 + " "+ numero1 );
    }else {
      System.out.println("El orden sería: "+ numero3 +" "+ numero1 + " "+ numero2);
    }
  }
}
