package U1.T8;
// Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(" ");
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " * " + j + " = "+ i*j);
            }
        }
    }
}
