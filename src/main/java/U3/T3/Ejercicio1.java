package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

// Diseñar un programa que solicite al usuario 5 números decimales. A continuación,
// debe mostrar los números en el mismo orden en que se han introducido.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float numeros[] = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Dime 5 numeros aleatorios: ");
            numeros[i] = teclado.nextFloat();
        }
        System.out.println(Arrays.toString(numeros));
    }
}
