package U1.T8B;
//Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir
// de uno que se introduce por teclado.

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();

        int numeroTope = numeroIntroducido + 5;

        while (numeroIntroducido <= numeroTope){
            int cuadrado = (int) Math.pow(numeroIntroducido,2);
            int cubo = (int) Math.pow(numeroIntroducido,3);
            System.out.print(numeroIntroducido + " " + cuadrado + " " + cubo + "\n");
            numeroIntroducido ++;
        }

    }
}
