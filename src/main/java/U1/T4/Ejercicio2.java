package U1.T4;
//Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
// Hay que tener en cuenta que la media puede contener decimales.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la primera nota: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Dime la segunda nota: ");
        double nota2 = teclado.nextDouble();

        double notaMedia = ((nota1 + nota2) / 2);

        System.out.println("La nota media es: " + notaMedia);
    }
}
