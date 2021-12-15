package U3.U3_Entregable_Repetido;

import java.util.Arrays;
import java.util.Scanner;

//Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el siguiente prototipo:
//
//public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos)
//Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de Strings y una posición.
// Devolverá como resultado un array bidimensional en el que esté insertado como una nueva fila en la matriz el array en
// la posición que se indica.
//
//Se deberá imprimir la matriz antes y después de insertar la fila.
//
//NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario comprobarlo, como tampoco es
// necesario comprobar que la posición pasada es válida, se entenderá que el usuario pasa una posición válida.
//
//Ejemplo 1:
//
//matriz = {
//      {"a","b","c"},
//      {"d","e","f"},
//      {"g","h","i"}
//    }
//fila = {"j","k","l"}
//pos = 1
//El resultado de insertarFilaEnMatriz será:
//
//{
//{"a","b","c"},
//{"j","k","l"},
//{"d","e","f"},
//{"g","h","i"}
//}
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] fila = {"j","s","c"};
        String [][] matriz = {
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","i"}
        };

        System.out.println("Dime la posicion donde quieres insertar la fila:");
        int posFila = teclado.nextInt();
        mostrarArray(insertarFilaEnMatriz(matriz, fila, posFila));
    }

    private static void mostrarArray(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" | "+ matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos){
        String [][] arrayAux = new String [matriz.length+1][matriz[0].length];
        int contadorFilasInsertadas = 0;
        int columna = 0;
        int contadorFilasMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (contadorFilasInsertadas != matriz.length+1) {
                    if (contadorFilasInsertadas != pos) {
                        while (columna < matriz[i].length /*matriz[i].length = 3 -> Son las columnas*/) {
                            arrayAux[contadorFilasInsertadas][columna] = matriz[contadorFilasMatriz][columna];
                            columna++;
                        }
                        contadorFilasInsertadas++;
                        columna = 0;
                        contadorFilasMatriz++;
                    } else {
                        while (columna < matriz[i].length /*matriz[i].length = 3 -> Son las columnas*/) {
                            arrayAux[contadorFilasInsertadas][columna] = fila[columna];
                            columna++;
                        }
                        contadorFilasInsertadas++;
                    }
                    columna = 0;
                }
            }
        }
        return arrayAux;
    }
}
