package U3.T2;

import java.util.Scanner;

//Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una frase por favor: ");
        String frase = teclado.nextLine();

        int longitudFrase = frase.length();
        int contadorEspacios = 0;

        for (int i = 0; i < longitudFrase; i++) {
            String recorridoFrase = String.valueOf(frase.charAt(i));
            if ( recorridoFrase.equalsIgnoreCase(" ")){
                contadorEspacios ++;
            }
        }
        System.out.println("Hay "+ contadorEspacios +" espacios");
    }
}
