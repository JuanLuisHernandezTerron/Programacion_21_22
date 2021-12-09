package U3.U3_Entregable;

import java.util.Arrays;
import java.util.Scanner;

//Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el siguiente prototipo:
//
//public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos)
//Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de Strings y una posición. Devolverá como resultado un array bidimensional en el que esté insertado como una nueva fila en la matriz el array en la posición que se indica.
//
//Se deberá imprimir la matriz antes y después de insertar la fila.
//
//NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario comprobarlo, como tampoco es necesario comprobar que la posición pasada es válida, se entenderá que el usuario pasa una posición válida.
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
public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      String [][] matriz = {
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","i"}
            };
      String [] fila = {"a","c","d"};

      System.out.println("Dime la posicion donde quieres introducir la fila: ");
      int posicion = teclado.nextInt();

      mostrarArray(insertarFilaEnMatriz(matriz, fila, posicion));

    }

    private static void mostrarArray(String[][] insertarFilaEnMatriz) {
        for (int i = 0; i < insertarFilaEnMatriz.length; i++) {
            for (int j = 0; j < insertarFilaEnMatriz[i].length; j++) {
                System.out.print(" | " + insertarFilaEnMatriz[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos){
        String [][]arrayAux = new String[4][3];
        int contadorFilas = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (contadorFilas == pos){
                    arrayAux[contadorFilas][j] = fila[j];
                }else if(i == matriz.length-1){
                    arrayAux[matriz.length][j] = matriz[i][j];
                }else{
                    arrayAux[contadorFilas][j] = matriz[i][j];
                }
            }
            contadorFilas ++;
        }
        return arrayAux;
    }
}
