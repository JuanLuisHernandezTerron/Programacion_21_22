package U3.Varios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Crea una función con la siguiente cabecera:
//
//public String convierteEnMorse(int n)
//
//Esta función convierte el número n al sistema Morse y lo devuelve en una
//cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
//Morse. Utiliza esta función en un programa para comprobar que funciona bien.
//Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
//desde el programa principal.
//
//1 . _ _ _ _ 6 _ . . . .
//2 . . _ _ _ 7 _ _ . . .
//3 . . . _ _ 8 _ _ _ . .
//4 . . . . _ 9 _ _ _ _ .
//5 . . . . . 0 _ _ _ _ _
public class ejercicio2_entregable_Tarde {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el numero que quieres pasar a morse: ");
        int numeroIntroducido = teclado.nextInt();
        String numeroCadena = Integer.toString(numeroIntroducido);
        System.out.println(convierteEnMorse(numeroIntroducido));
    }

    private static String convierteEnMorse(int n) {
        String numero = Integer.toString(n);
        int longitud = numero.length();
        int contadorMorse = 0;
        String codigoTraducido = "";
        for (int i = 0; i < numero.length(); i++) {
            switch (numero.charAt(i)){
                case '1':
                    codigoTraducido = codigoTraducido + ". _ _ _ _ ";
                    break;
                case '2':
                    codigoTraducido = codigoTraducido + ". . _ _ _ ";
                    break;
                case '3':
                    codigoTraducido = codigoTraducido + ". . . _ _ ";
                    break;
                case '4':
                    codigoTraducido = codigoTraducido + ". . . . _ ";
                    break;
                case '5':
                    codigoTraducido = codigoTraducido + ". . . . . ";
                    break;
                case '6':
                    codigoTraducido = codigoTraducido + "_ . . . . ";
                    break;
                case '7':
                    codigoTraducido = codigoTraducido + "_ _ . . . ";
                    break;
                case '8':
                    codigoTraducido = codigoTraducido + "_ _ _ . . ";
                    break;
                case '9':
                    codigoTraducido = codigoTraducido + "_ _ _ _ . ";
                    break;
                case '0':
                    codigoTraducido = codigoTraducido + "_ _ _ _ _ ";
                    break;
            }
        }
        return codigoTraducido;
    }
}
