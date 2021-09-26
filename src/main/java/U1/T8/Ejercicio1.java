package U1.T8;
//Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo, y su cuadrado.
// El proceso terminará cuando el número introducido por teclado sea 0.

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroIntroducido = 1;

        System.out.print("Dime un numero ");
        numeroIntroducido = teclado.nextInt();

            while (numeroIntroducido != 0) {

                if (numeroIntroducido % 2 == 0) {
                    System.out.println("Es par");
                } else {
                    System.out.println("Es impar");
                }

                if (numeroIntroducido > 0) {
                    System.out.println("Es positivo");
                } else{
                    System.out.println("Es negativo");
                }

                int numeroCuadrado = (int) Math.pow(numeroIntroducido, 2);
                System.out.println("Su cuadrado es " + numeroCuadrado);

                System.out.print("Dime otro numero ");
                numeroIntroducido = teclado.nextInt();
        }
    }
}
