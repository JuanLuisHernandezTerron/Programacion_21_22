package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

//Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
// Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una tercera,
// de forma que los 12 números sigan ordenados. Fusionar significa copiar en el orden correcto
// para que los datos resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] array = {2, 3, 6, 8, 9, 10};  //i
        int[] array2 = {5, 7, 1, 12, 11, 4}; //j
        int[] arrayvacio = new int[array.length + array2.length];
        int i = 0;
        int j = 0;

        Arrays.sort(array);
        Arrays.sort(array2);
        for (int k = 0; k < arrayvacio.length; k++) {
            if (i < array.length && j == array.length) {
                arrayvacio[k] = array[i];
                i++;
            } else if (j < array.length && i == array.length) {
                arrayvacio[k] = array2[j];
                j++;
            } else if (array[i] < array2[j]) {
                arrayvacio[k] = array[i];
                i++;
            } else {
                arrayvacio[k] = array2[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(arrayvacio));
    }
}
