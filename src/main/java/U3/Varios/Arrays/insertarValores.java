package U3.Varios.Arrays;

import java.util.Arrays;

//Que nos devuelva si un elemento está en un vector(array) unidimensional.
//
//Usar dicho elemente para construir la siguiente función:
//
//public static int[] unirSinRepetidos(int v1[],int[] v2)
//
//Que una los dos vectores pero sin elementos repetidos. Usar dicha función en el método main mostrando el vector resultado por pantalla.
//
//Ejemplo1:
//
//v1 = {1,2,3}
//
//v2 = {4,5,6}
//
//El resultado de unirSinRepetidos() será:
//
//{1,2,3,4,5,6}
//
//Ejemplo2:
//
//v1 = {1,2,3}
//
//v2 = {3,2,5}
//
//El resultado de unirSinRepetidos() será:
//
//{1,2,3,5}
public class insertarValores {
    public static void main(String[] args) {
        int [] v1 = {1,2,6,5};
        int [] v2 = {4,6,8,8};

        System.out.println(Arrays.toString(juntarArrays(v1,v2)));
        quitarRepetidos(juntarArrays(v1,v2));

    }

    private static int[] quitarRepetidos(int[] juntarArrays) {
    int [] arraySinRepetir = new int[0];
        for (int i = 0; i < juntarArrays.length; i++) {
            for (int j = 0; j < juntarArrays.length; j++) {

            }
        }
    return arraySinRepetir;
    }

    private static int[] juntarArrays(int[] v1, int[] v2) {
        int [] arrayAUX = new int[v1.length+ v2.length];
        int contadorArray = 0;
        for (int i = 0; i < v1.length; i++) {
            arrayAUX[i] = v1[i];
        }
        for (int i = v1.length; i < v1.length+v2.length; i++) {
            arrayAUX[i] = v2[contadorArray++];
        }
        return arrayAUX;
    }

}
