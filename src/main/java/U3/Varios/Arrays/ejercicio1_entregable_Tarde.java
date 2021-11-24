package U3.Varios.Arrays;

import java.util.Arrays;

//Crea la función filtraPrimos que:
//
//Recibe un array de enteros
//Devuelve un array de enteros con todos los primos que se encuentran en el array origen
//Obviamente el tamaño del array  que se devuelve será de una longitud menor o igual al que se pasa como parámetro.
// Para facilitar el ejercicio aunque un número primo se repita lo añadiremos al vector. Si no existe ningún número
// primo en el vector original, se devuelve un array con el número -1 como único elemento.

public class ejercicio1_entregable_Tarde {
    public static void main(String[] args) {
        int []arrayNumeros = {2,3,4,6,7,8,13,11,29,34};
        arrayPrimos(arrayNumeros);
        System.out.println(Arrays.toString(arrayPrimos(arrayNumeros)));
    }

    private static int[] arrayPrimos(int[] arrayNumeros) {
        int [] arrayVacio = new int [0];
        int contadorPrimos = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            boolean es_primo = true;
            for (int j = 2; j < arrayNumeros[i]; j++) {
                if(arrayNumeros[i] % j == 0){
                    es_primo = false;
                    break;
                }
            }
            if (es_primo){
                arrayVacio = Arrays.copyOf(arrayVacio,arrayVacio.length+1);
                arrayVacio[contadorPrimos] = arrayNumeros[i];
                contadorPrimos ++;
            }
        }
        return arrayVacio;
    }
}
