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

        int []espacioArray = {1,6,5,9,2,7};
        int []espacioArray2 = {7,5,6,7,2,3};
        int []arrayOrdenado = new int [espacioArray.length + espacioArray2.length];
        System.arraycopy(espacioArray,0,arrayOrdenado,0,espacioArray.length);
        System.arraycopy(espacioArray2,0,arrayOrdenado,espacioArray2.length,espacioArray2.length);
        ordenarArrays(espacioArray);
        ordenarArrays(espacioArray2);
        ordenarArrays(arrayOrdenado);
    }

    private static void ordenarArrays(int[] arrays) {
        boolean es_Ordenado = false;

        while (es_Ordenado == false){
            int contadorCambios = 0;
            for (int i = 0; i < arrays.length-1; i++) {
                if (arrays[i] > arrays[i+1]){
                    int numAUX = arrays[i];
                    arrays[i] = arrays[i+1];
                    arrays[i+1] = numAUX;
                    contadorCambios ++;
                }
            }

            if (contadorCambios == 0){
                es_Ordenado = true;
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
