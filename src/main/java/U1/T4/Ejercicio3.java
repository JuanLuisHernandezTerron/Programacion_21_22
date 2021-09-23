package U1.T4;

//Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales.

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la primera nota: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Dime la segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.println("Dime la segunda nota: ");
        double nota3 = teclado.nextDouble();

        double notaDecimal = ((nota1 + nota2 + nota3) / 3); // Hacemos la media de los 3 numeros.
        int notaMedia = (int) notaDecimal; // convertimos el numero decimal en entero.

        System.out.println("La nota media es: " + notaMedia);
    }
}
