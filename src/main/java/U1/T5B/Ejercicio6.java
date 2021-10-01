package U1.T5B;

import java.util.Scanner;

// Realiza un programa que calcule la media de tres notas que se solicitarán al usuario.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double notasSumadas= 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Dime 3 notas por favor");
            double notas = teclado.nextDouble();
            notasSumadas = notasSumadas + notas;
        }
        System.out.println("La media es: " + notasSumadas/3);
    }
}
