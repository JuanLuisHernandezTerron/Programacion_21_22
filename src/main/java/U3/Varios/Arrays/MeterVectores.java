package U3.Varios.Arrays;

import java.util.Arrays;

////Define la función mezcla con la siguiente cabecera:
////
////public static int[] mezcla(int[] a, int[] b)
////
////Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de
//// mezclar los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a, etc.
//// Los vectores y b pueden tener longitudes diferentes; por tanto, si se terminan los números de un
//// array se terminan de coger todos los que quedan del otro.
////
////Ejemplos:
////
////Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
////
////Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
////
////Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
////
////Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
public class MeterVectores {
    public static void main(String[] args) {
        int [] vector1 = {1,2,2,3};
        int [] vector2 = {4,2,6};


        System.out.println(Arrays.toString(quitarRepetidos(unirArrays(vector1,vector2))));
    }

    private static int [] quitarRepetidos(int[] arrayRepetido) {
        int [] arrayAUX = new int[1];
        int contador = 0;
        for (int i = 0; i < arrayRepetido.length; i++) {
            if (!esRepetido(arrayRepetido[i],arrayAUX)){
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contador] = arrayRepetido[i];
                contador ++;
            }
        }
        return arrayAUX;
    }

    private static boolean esRepetido(int arrayQuitarRepetido, int[] arrayAUX) {
        boolean es_repetido = false;
        for (int j = 0; j < arrayAUX.length; j++) {
            if ( arrayQuitarRepetido == arrayAUX[j]){
                es_repetido = true;
            }
        }
        return es_repetido;
    }

    private static int[] unirArrays(int[] vector1, int[] vector2) {
        int [] arrayAux = new int[0];
        int indiceI = 0;
        int indiceJ = 0;
        int contadorIntroducido = 0;

        for (int i = 0; i < vector1.length + vector2.length; i++) {
                if (indiceI < vector1.length && indiceJ < vector2.length){
                    arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+2);
                    arrayAux[contadorIntroducido] = vector1[indiceI];
                    contadorIntroducido++;
                    arrayAux[contadorIntroducido] = vector2[indiceJ];
                    indiceI ++;
                    indiceJ ++;
                    contadorIntroducido++;
                }else if( indiceI < vector1.length && indiceJ == vector2.length){
                    arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                    arrayAux[contadorIntroducido] = vector1[indiceI];
                    contadorIntroducido++;
                }else if(indiceJ < vector2.length && indiceI == vector2.length){
                    arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                    arrayAux[contadorIntroducido] = vector2[indiceJ];
                    contadorIntroducido++;
                }
            }
        return arrayAux;
    }
}
