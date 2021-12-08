package U3.Varios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
//lo que se especifica en los comentarios:
//
//public static int[] filtraCon8(int x[]) // Devuelve un array con todos los números
//                                 // que contienen el 8 (por ej. 8, 28, 782)
//                                 // que se encuentren en otro array que se
//                                 // pasa como parámetro. El tamaño del array
//                                 // que se devuelve será menor o igual al
//                                 // que se pasa como parámetro.
//
//Utiliza esta función en un programa para comprobar que funcionan bien. Para
//que el ejercicio resulte más fácil, las repeticiones de números que contienen
//8 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
//el array devuelto también estará repetido 3 veces. Si no existe ningún número
//que contiene 8 en el array x, se devuelve un array con el número -1 como único
//elemento.
public class ejercicio3_DavidGonzalez {
    public static void main(String[] args) {
        int [] x  = new int[8];
        rellenarArray(x);
        System.out.println(Arrays.toString(filtrarcon8(x)));

    }

    public static int[] filtrarcon8(int[] x){
        int [] arrayAUX = new int [0];
        int cociente = 0;
        int resto = 0;
        int contadorAux = 0;
        for (int i = 0; i < x.length; i++) {
            cociente = x[i];
            while (cociente > 0){
                resto = cociente %10;
                cociente = cociente / 10;
                if (resto == 8){
                    arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                    arrayAUX[contadorAux] = x[i];
                    contadorAux ++;
                }
            }
        }
        return arrayAUX;
    }

    private static void rellenarArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(x));
    }
}
