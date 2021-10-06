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

    int altura = 3;

    switch (posicion) {
        case "arriba":
            System.out.println("  "+ caracter);
            System.out.println(" "+caracter+ caracter+caracter);
            System.out.println(caracter + caracter + caracter + caracter + caracter);
            break;
        case "abajo":
              System.out.println(caracter + caracter + caracter + caracter + caracter);
              System.out.println(" "+caracter+ caracter+caracter);
              System.out.println("  "+ caracter);
            break;
        case "derecha":
            System.out.println(caracter);
            System.out.println(caracter + caracter + caracter );
            System.out.println(caracter + caracter +caracter + caracter + caracter);
            System.out.println(caracter+caracter + caracter);
            System.out.println(caracter);
            break;
        case "izquierda":
            System.out.println("    "+caracter);
            System.out.println("  " + caracter+caracter+caracter);
            System.out.println(caracter + caracter +caracter + caracter + caracter);
            System.out.println("  " + caracter+caracter+caracter);
            System.out.println("    "+caracter);
    }
  }
}

