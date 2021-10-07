package U3.T1;

import java.util.Scanner;

//Diseñar una función que nos diga si un número es primo.
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el numero que quieres saber si es primo o no: ");
        int numeroIntroducido = teclado.nextInt();
        boolean es_primo = false;

        if (primoNoprimo(numeroIntroducido, es_primo)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }

    static boolean primoNoprimo(int numeroIntroducido, boolean es_primo) {
        for (int i = 1; i <= numeroIntroducido; i++) {
            es_primo = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    es_primo = false;
                    break;
                }
            }
        }
        return es_primo;
    }
}
