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
        System.out.println(Arrays.toString(noRepetidos(juntarArrays(v1,v2))));
    }

    private static int [] noRepetidos(int[] juntarArrays) {
        int [] arraySinRepetir = new int[0];
        int contadorIntroducido = 0;
        int numeroNoRepetidointroducido = 0;
        int numeroRepetido = 0;
        boolean esRepetido = false;

        for (int i = 0; i < juntarArrays.length; i++) {
            numeroRepetido = 0;
            esRepetido= false;
            for (int j = 0; j < juntarArrays.length; j++) {
                if (juntarArrays[i] == juntarArrays[j]){
                    numeroRepetido++;
                }
                if(numeroRepetido > 1){
                    esRepetido = true;
                }
                if (!esRepetido){
                    if (numeroNoRepetidointroducido < 1) {
                        arraySinRepetir = Arrays.copyOf(arraySinRepetir, arraySinRepetir.length + 1);
                        arraySinRepetir[contadorIntroducido] = juntarArrays[i];
                        contadorIntroducido++;
                    }
                    numeroNoRepetidointroducido ++;
                }
            }
            numeroNoRepetidointroducido = 0;
        }
        return arraySinRepetir;
    }

    private static int [] juntarArrays(int[] v1, int[] v2) {
        int [] arrayAUX = new int[v1.length+ v2.length];
        int contadorIntroducido = 0;
        int contadorI = 0;
        int contadorJ = 0;
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (contadorIntroducido != v1.length+ v2.length) {
                    if (contadorI < v1.length && contadorJ < v2.length) {
                        arrayAUX[contadorIntroducido] = v1[contadorI];
                        contadorIntroducido++;
                        contadorI++;
                        /*-----------------------------------------------*/
                        arrayAUX[contadorIntroducido] = v2[contadorJ];
                        contadorIntroducido++;
                        contadorJ++;
                    } else if (contadorI < v1.length && contadorJ == v2.length) {
                        arrayAUX[contadorIntroducido] = v1[contadorI];
                        contadorIntroducido++;
                        contadorI++;
                    } else if (contadorJ < v2.length && contadorI == v1.length) {
                        arrayAUX[contadorIntroducido] = v2[contadorJ];
                        contadorIntroducido++;
                        contadorJ++;
                    }
                }
            }
        }
        return arrayAUX;
    }
}
