package U3.Varios.Arrays;

import java.util.Scanner;

//Hacer una algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N filas y N
//columnas con número aleatorios entre 100 y 200.
//
//Mostrar dicho array y a continuación rotarlo 90 grados:
//
//Ejemplo:
//
//Introduce la dimensión del Array: 5
public class ejercicio3_entregable_Tarde {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantas dimensiones quieres que tenga el tablero? ");
        int dimendionArray = teclado.nextInt();

        int [][] arrayRelleno = new int[dimendionArray][dimendionArray];
        int [][] arrayVacio = new int [arrayRelleno.length][arrayRelleno.length];
        rellenarArray(arrayRelleno);
        rotarArray(arrayRelleno,arrayVacio);

        for (int i = 0; i < arrayRelleno.length; i++) {
            for (int j = 0; j < arrayRelleno[i].length; j++) {
                System.out.print(" | "+arrayVacio[i][j]+ " | ");
            }
            System.out.println();
        }
    }

    private static void rotarArray(int [][]array,int [][]arrayVacio) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayVacio[j][array.length-i-1] = array[i][j];
            }
            System.out.println();
        }
    }

    private static void rellenarArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (100+Math.random()*100);
                System.out.print(" | "+array[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
