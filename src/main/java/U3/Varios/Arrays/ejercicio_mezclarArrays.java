package U3.Varios.Arrays;

import java.util.Arrays;

//Define la función mezcla con la siguiente cabecera:
//
//public static int[] mezcla(int[] a, int[] b)
//
//Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de
// mezclar los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a, etc.
// Los vectores y b pueden tener longitudes diferentes; por tanto, si se terminan los números de un
// array se terminan de coger todos los que quedan del otro.
//
//Ejemplos:
//
//Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
//
//Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
//
//Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
//
//Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
public class ejercicio_mezclarArrays {
    public static void main(String[] args) {
        int []vector1 = {7,3,5,6,8};
        int []vector2 = {9,6,6,5,7};
        System.out.println(Arrays.toString(unirArrays(vector1,vector2)));
        System.out.println(Arrays.toString(quitarRepetidos(unirArrays(vector1,vector2))));
    }

    private static int[] quitarRepetidos(int[] unirArrays) {
        int []arraySinrepetidos = new int[0];
        int contadorArray = 0;
        int contadorJ = 1;
        for (int i = 0; i < unirArrays.length; i++) {
            for (int j = contadorJ; j < unirArrays.length; j++) {
                if (unirArrays[i] == unirArrays[contadorJ]){

                }else{
                    arraySinrepetidos = Arrays.copyOf(arraySinrepetidos,arraySinrepetidos.length+1);
                    arraySinrepetidos[contadorArray] = unirArrays[i];
                    contadorArray ++;
                    break;
                }
            }
            contadorJ ++;
        }
        return arraySinrepetidos;
    }


    private static int[] unirArrays(int[] vector1, int[] vector2) {
        int [] arrayAUX = new int[vector1.length+vector2.length];
        int indiceA = 0;
        int indiceB = 0;
        int contadorArrayAUX = 0;
        int contadorIntroducidoAUX = 0;

        for (int i = 0; i < arrayAUX.length; i++) {
            if (contadorArrayAUX <arrayAUX.length) {
                if (contadorIntroducidoAUX == 0) {
                    arrayAUX[contadorArrayAUX] = vector1[indiceA];
                    contadorArrayAUX++;
                    indiceA++;
                    contadorIntroducidoAUX++;
                }
                if (contadorIntroducidoAUX == 1) {
                    arrayAUX[contadorArrayAUX] = vector2[indiceB];
                    contadorArrayAUX++;
                    indiceB++;
                }
                contadorIntroducidoAUX = 0;
            }
        }
        return arrayAUX;
    }
}
