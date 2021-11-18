package U3.T3extra;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [][] arrayBidi = new int [10][10];
        funcionllenar(arrayBidi);

        int [] arrayVacio = new int[10];
        int contadorColumnas = 0;
        double numerosArray = 0;


        for (int i = 0; i < arrayBidi.length; i++) {
                arrayVacio[i] = arrayBidi[contadorColumnas][contadorColumnas]; //Como recorrer un array en diagonal
                contadorColumnas++; //Crearemos un contador para poder utilizarlo para recorrer posteriormente el array.
        }

        for (int i = 0; i < arrayVacio.length; i++) {
            numerosArray = numerosArray+arrayVacio[i];
        }

        System.out.println("Los numeros diagonales son: "+Arrays.toString(arrayVacio));
        Arrays.sort(arrayVacio);
        System.out.println("El numero mas pequeño es: " +arrayVacio[0]+" y el mas grande es: "+ arrayVacio[arrayVacio.length-1]);
        System.out.println("La media de los alumnos es: " + numerosArray / arrayVacio.length);
    }

    private static void funcionllenar(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { //
                array[i][j] = (int) (200+Math.random()*101);
                System.out.print(" | " + array[i][j] + " | ");
            }
            System.out.println();
        }
        return; //Se devuelve la funcion, ningun array.
    }
}
