package U1.T5B;
// Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Dime un numero entero: ");
    int numero = teclado.nextInt();

    boolean es_par = false;

    if (numero % 2 == 0) {
      es_par = true;
    }

    if (es_par == true) {
      System.out.println("Es par");
    } else {
      System.out.println("No es par");
    }

    if (numero % 5 == 0) {
      System.out.println("Es divisible entre 5");
    } else {
      System.out.println("No es divisible entre 5");
    }
  }
}
