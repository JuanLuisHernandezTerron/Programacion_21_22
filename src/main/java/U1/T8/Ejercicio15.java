package U1.T8;
// Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos. Un número
// primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:
//
//1->primo
//
//2->primo
//
//3->primo
//
//4->no primo
//
//5->primo
//
//6->no primo
//
//7->primo
//
//8->no primo
//
//Resultado del programa: Entre 1 y 8 hay 5 números primos.

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();

        int contadorPrimo = 0;

        for (int i = 1; i <= numeroIntroducido ; i++) {
            for (int j = 2; j <= numeroIntroducido ; j++) {
                if ( i % j == 0){
                    contadorPrimo ++;
                }
            }
        }
        System.out.println(contadorPrimo);
    }
}
