package U3.Varios.Arrays;

import java.util.Arrays;

//Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
//lo que se especifica en los comentarios:
//
//public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
//                                 // que contienen el 7 (por ej. 7, 27, 782)
//                                 // que se encuentren en otro array que se
//                                 // pasa como parámetro. El tamaño del array
//                                 // que se devuelve será menor o igual al
//                                // que se pasa como parámetro.
//
//Utiliza esta función en un programa para comprobar que funcionan bien. Para
//que el ejercicio resulte más fácil, las repeticiones de números que contienen
//7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
//el array devuelto también estará repetido 3 veces. Si no existe ningún número
//que contiene 7 en el array x, se devuelve un array con el número -1 como único
//elemento.
public class ejercicio3_entregable_19_20 {
    public static void main(String[] args) {
        int [] array = new int [5];
        rellenarArray(array);
        System.out.println(Arrays.toString(array));
        filtrarCon7(array);
    }

    private static void filtrarCon7(int[] array) {
        int [] arrayFiltrado7 = new int[0];
        int numeroAUX = 0;
        int cociente = 0;
        int resto = 0;
        int contadorIntroducido=0;

        for (int i = 0; i < array.length ; i++) {
            cociente = array[i];
            while (cociente > 0){
                resto = cociente % 10;
                cociente = cociente/10;
                if (resto == 7){
                    arrayFiltrado7 = Arrays.copyOf(arrayFiltrado7,arrayFiltrado7.length+1);
                    arrayFiltrado7[contadorIntroducido] = array[i];
                    contadorIntroducido ++;
                    break;
                }
            }
        }

        if (arrayFiltrado7.length == 0){
            arrayFiltrado7 = Arrays.copyOf(arrayFiltrado7,arrayFiltrado7.length+1);
            arrayFiltrado7[0] = -1;
        }

        System.out.println(Arrays.toString(arrayFiltrado7));
    }

    private static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
    }
}
