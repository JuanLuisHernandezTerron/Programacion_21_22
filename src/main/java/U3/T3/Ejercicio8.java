package U3.T3;

import java.util.Arrays;

// Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición [i,j] debe contener i+j.
// Después, se debe mostrar su contenido.
public class Ejercicio8 {
    public static void main(String[] args) {
        int [][] array1 = new int [5][5];

        for (int i = 0; i < array1.length; i++) {
            System.out.println();
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = i+j;
                System.out.print(" | "+array1[i][j]+ " ");
            }
        }
    }
}
