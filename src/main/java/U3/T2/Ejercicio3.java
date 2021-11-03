package U3.T2;

import java.util.Scanner;
//Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una frase por favor: ");
        String frase = teclado.nextLine();

        int longitudPalabra = frase.length();
        String caracterMedio = String.valueOf(frase.charAt(longitudPalabra/2));

      if (caracterMedio.equalsIgnoreCase(" ")){
          System.out.print("Es un espacio");
      }else{
          System.out.print("No es un espacio");
      }
    }
}
