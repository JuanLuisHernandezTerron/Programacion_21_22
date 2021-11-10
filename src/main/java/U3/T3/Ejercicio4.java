package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

//Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta.
// La aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5
// (siendo n la longitud indicada anteriormente por el usuario). El jugador introduce ahora una
// combinación de prueba. En cada intento se mostrará como pista, para cada dígito, si es mayor menor o
// igual que el correspondiente de la combinación secreta.
//
//Ejemplo:
//
//-Introduzca longitud de la clave
//
//-3
//
//(se genera la clave secreta, por ejemplo 152)
//
//-Intente acertarla
//
//-351
//
//-3 es mayor,
//
// 5 es igual,
//
// 1 es menor
//
//- Intente acertarla de nuevo
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la longitud de la clave: ");
        int longitudClave = teclado.nextInt();


        int espaciosArrays[] = new int[longitudClave];
        int espacioArrays2[] = new int[longitudClave];
        boolean es_acertado = false;
        for (int i = 0; i < longitudClave; i++) {
            espaciosArrays[i] = (int) (Math.random() * 5 + 1);
        }


        es_Igual(teclado, longitudClave, espaciosArrays, espacioArrays2, es_acertado);

        if (es_acertado) {
            System.out.println("Has acertado la clave secreta");
        } else {
            es_Igual(teclado, longitudClave, espaciosArrays, espacioArrays2, es_acertado);
        }
    }

    private static boolean es_Igual(Scanner teclado, int longitudClave, int[] espaciosArrays, int[] espacioArrays2, boolean es_acertado) {
        for (int j = 0; j < longitudClave; j++) {
            System.out.println("Dime numeros");
            int numerosIntroducir = teclado.nextInt();
            espacioArrays2[j] = numerosIntroducir;
        }

        for (int i = 0; i < longitudClave; i++) {
            if (espaciosArrays[i] == espacioArrays2[i]) {
                System.out.println("Array1: " + espaciosArrays[i] + " - Array2: " + espacioArrays2[i] + " Son iguales");
            } else if ((espaciosArrays[i] < espacioArrays2[i])) {
                System.out.println("Array1: " + espaciosArrays[i] + " - Array2: " + espacioArrays2[i] + " El numero " + espacioArrays2[i] + " es mayor");
            } else {
                System.out.println("Array1: " + espaciosArrays[i] + " - Array2: " + espacioArrays2[i] + " El numero " + espacioArrays2[i] + " es menor");
            }
        }
        if (Arrays.equals(espaciosArrays, espacioArrays2)) {
            es_acertado = true;
        }
        return es_acertado;
    }
}
