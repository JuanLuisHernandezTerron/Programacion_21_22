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
public class ejercicio1_entregable_Manana {
    public static void main(String[] args) {
        int [] vectorA = {8,9,5,9,8,1,2,0};
        int [] vectorB = {1,2,3,4,5,6,8,9,7,4,5,2,1};

        System.out.println(Arrays.toString(mezclarArrays(vectorA,vectorB)));
    }

    private static int[] mezclarArrays(int [] vectorA, int [] vectorB) {
        int []arrayAux =  new int [vectorA.length+vectorB.length];
        int posiciones_arrayA = 0;
        int posiciones_arrayB = 0;
        for (int i = 0; i < vectorA.length+vectorB.length; i++) {
            if (posiciones_arrayA < vectorA.length && posiciones_arrayB < vectorB.length){
                arrayAux[i++] = vectorA[posiciones_arrayA ++]; //Equivaldría a poner un contador abajo -> arrayAux[i++] = vectorA[posiciones_arrayA]; y abajo posiciones_arrayA++
                arrayAux[i] = vectorB[posiciones_arrayB ++];

            }else if (posiciones_arrayA == vectorA.length && posiciones_arrayB < vectorB.length){
                arrayAux[i] = vectorB[posiciones_arrayB ++];
            }else if (posiciones_arrayB == vectorB.length && posiciones_arrayA < vectorA.length){
                arrayAux[i] = vectorA[posiciones_arrayA ++];
            }
        }
        return arrayAux;

        //i++ quiere decir que primero hace la operacion y luego te suma la i, en cambio, el ++i , te suma la i y luego hace la operacion.
    }
}
