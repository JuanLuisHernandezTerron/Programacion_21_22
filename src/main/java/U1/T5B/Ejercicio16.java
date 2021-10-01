package U1.T5B;

import java.util.Scanner;
// Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Dime el numero entero");
    int numeroIntroducido = teclado.nextInt();

    int numeroAux = numeroIntroducido % 10;

    System.out.println("El ultimo numero del numero introducido es: " + numeroAux);
  }
}
