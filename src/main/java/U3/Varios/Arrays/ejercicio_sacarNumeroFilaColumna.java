package U3.Varios.Arrays;

import java.util.Scanner;

//Sacaremos el numero que el usuario quiera , introduciendo la columna y la fila.
public class ejercicio_sacarNumeroFilaColumna {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [][] array = new int[5][5];
        rellenarArray(array);
        System.out.print("En que fila esta el numero que quieres sacar?");
        int fila = teclado.nextInt();
        System.out.print("En que colmna esta el numero que quieres sacar?");
        int columna = teclado.nextInt();
        System.out.println("El numero que está en la fila "+fila+" y en la columna "+columna+" es "+sacarNumeroArray(array,fila,columna));
    }

    private static int sacarNumeroArray(int[][] array, int fila, int columna) {
        int numero = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == fila && j == columna){
                    numero = array[i][j];
                }
            }
        }
        return numero;
    }

    private static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*100);
                System.out.print(" | "+ array[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
