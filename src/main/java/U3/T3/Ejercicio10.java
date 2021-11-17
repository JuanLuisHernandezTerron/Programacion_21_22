package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

// Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional que debe rellenar de
// la siguiente forma: se leerá por teclado una serie de números, guardando en la tabla los pares hasta que esté llena,
// e ignorando los impares. La función tiene que devolver la cantidad de impares desechados.
public class Ejercicio10 {
    public static void main(String[] args) {
        int [] arrayPares = new int [5];
        System.out.println("Hay "+meterDatos(arrayPares)+ " numeros impares" + ", el array quedaría tal que así: " + Arrays.toString(arrayPares));
    }

    private static int meterDatos(int [] array) {
        Scanner teclado = new Scanner(System.in);
        int numerosImpares = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime numeros para rellenar el array: ");
            int numero = teclado.nextInt();
            if (numero % 2 == 0){
                array[i] = numero;
            }else{
                numerosImpares ++;
                i --; //Nos sirve para que no avance hasta que sea par
            }
        }
        return numerosImpares;
    }

}
