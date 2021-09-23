package U1.T3;
// Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en kilómetros
// , usando datos de tipo float (1 milla = 1.609 km).

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime las millas: ");
        float numero1 = teclado.nextFloat();

        System.out.println("Son "+ (numero1 * 1.609) + "km");
    }
}
