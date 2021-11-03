package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

//Escribir una aplicación que solicite al usuario cuántos números desea introducir.
// A continuación, se introducirá por teclado esa cantidad de números enteros, y por último,
// los mostrará en el orden inverso al introducido.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres introducir: ");
        int numerosIntroducir = teclado.nextInt();

        int espaciosArray[] = new int[numerosIntroducir];
        int ArrayAUX[] = new int[numerosIntroducir];

        for (int i = 0; i < numerosIntroducir; i++) {
            System.out.print("Dime un numero: ");
            espaciosArray[i] = teclado.nextInt();
        }

        for (int i = 0; i < numerosIntroducir; i++) {
            ArrayAUX[numerosIntroducir-i-1] = espaciosArray[i];
        }

        System.out.println(Arrays.toString(ArrayAUX));

    }
}
