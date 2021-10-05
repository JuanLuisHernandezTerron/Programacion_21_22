package U1.T5B;
// Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que
// podrá ser una letra, un número o un símbolo como *, +, -, $, &,etc. El programa debe permitir al
// usuario mediante un menú elegir si el vértice
// de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Donde quieres que este mirando el vertice: ");
    String posicion = teclado.next();
    System.out.print("Dime que caracter quieres que tenga ");
    String caracter = teclado.next();
    System.out.print("Dime que altura quieres que tenga la piramide: ");
    int altura = teclado.nextInt();

    switch (posicion) {
      case "arriba":
        for (int i = 0; i < altura; i++) {
          for (int espaciosBlancos = 0; espaciosBlancos < altura - i; espaciosBlancos++) {
            System.out.print("/");
          }
          for (int rellenoPiramide = 0; rellenoPiramide <= i * 2; rellenoPiramide++) {
            System.out.print(caracter);
          }
          System.out.println();
        }
        break;
      case "abajo":
        for (int i = 0; i < altura; i++) {
          for (int espaciosBlancos = 0; espaciosBlancos < altura + i; espaciosBlancos++) {
            System.out.print("/");
          }
          for (int rellenoPiramide = 0; rellenoPiramide <= i * 2; rellenoPiramide++) {
            System.out.print(caracter);
          }
          System.out.println();
        }
        break;
    }
  }
}

