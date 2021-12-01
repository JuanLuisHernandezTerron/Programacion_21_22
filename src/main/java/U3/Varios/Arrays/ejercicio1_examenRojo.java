package U3.Varios.Arrays;

import java.util.Arrays;

//Define la función esta  con la siguiente cabecera:
//
//public static boolean esta(int[] vector, int num)
//
//Que nos devuelva si un elemento está en un vector(array) unidimensional.
//
//Usar dicho elemente para construir la siguiente función:
//
//public static int[] unirSinRepetidos(int v1[],int[] v2)
//
//Que una los dos vectores pero sin elementos repetidos. Usar dicha función en el método
//main mostrando el vector resultado por pantalla.
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
public class ejercicio1_examenRojo {
    public static void main(String[] args) {
        int [] v1 = {8,9,2};
        int [] v2 = {3,2,6};
        System.out.println(Arrays.toString(unirSinRepetidos(v1,v2)));
    }

    public static int[] unirSinRepetidos(int v1[],int[] v2){
        int [] arrayUnir = new int[v1.length + v2.length];
        int indiceI = 0;
        int indiceJ = 0;
        int numeroBasura = 0;
        int contadorIntroducido = 0;
        for (int i = 0; i < arrayUnir.length; i++) {
            for (int j = 0; j < arrayUnir.length; j++) {
                if (contadorIntroducido < arrayUnir.length) {
                    if (v1.length < arrayUnir.length) {
                        arrayUnir[contadorIntroducido] = v1[indiceI];
                        indiceI++;
                        contadorIntroducido++;
                    }
                    if (v2.length < arrayUnir.length) {
                        arrayUnir[contadorIntroducido] = v2[indiceJ];
                        indiceJ++;
                        contadorIntroducido++;
                    }
                }
            }
        }
        return seRepite(arrayUnir);
    }

    private static int[] seRepite(int[] arrayUnir) {
        int contadorMetido = 0;
        int contadorRepetido = 0;
        int []arrayAux = new int[0];
        int indiceJ = 1;
        int numeroBAsura = 0;
        for (int i = 0; i < arrayUnir.length; i++) {
            for (int j = indiceJ; j < arrayUnir.length; j++) {
                if (arrayUnir[i] == arrayUnir[indiceJ]){
                    contadorRepetido ++;
                    numeroBAsura = numeroBAsura + arrayUnir[j];
                }else{
                    arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                    arrayAux[contadorMetido] = arrayUnir[i];
                    contadorMetido ++;
                    break;
                }
            }
            indiceJ++;
            Arrays.sort(arrayAux);
        }
        return arrayAux;
    }
}
