package U1.T8B;
// Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
// El programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad
// (división entera entre 2) de la altura más uno.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la longitud que quieres que tenga la L: ");
        int longitud = teclado.nextInt();

        for (int i = 0; i < longitud - 1; i++) {
            System.out.println("*");
        }

        for (int j = 0; j < longitud/2 +1 ; j++) {
            System.out.print("* ");
        }
    }
}
