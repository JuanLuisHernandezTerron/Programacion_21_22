package U1.T8B;

import java.util.Scanner;
//Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
// El programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
// dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la altura de la U");
        int altura = teclado.nextInt();

        for (int i = 0; i <= altura; i++) {
            System.out.println("*");
            for (int j = 0; j >= altura ; j++) { //espacios blancos
                System.out.print(" ");
            }
        }
    }
}
