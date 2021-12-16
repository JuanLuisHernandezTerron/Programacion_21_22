package U3.examen_U3;

import java.util.Scanner;

//Crea una función con la siguiente cabecera:
//
//public static boolean esPuntoDeSilla(int x[][], int i, int j)
//Que devuelve true si un número en una determinada posición de una matriz,
// es punto de silla. El punto de silla cumple la condición de ser el mínimo en su fila y
// máximo en su columna.
//
// Desde el programa principal se debe pedir al usuario un número de filas y de columnas, y generar una
// matriz de números enteros aleatorios entre 11 y 1003 con el tamaño introducido por el usuario.
// Llamará a la función para comprobar si cada uno de sus elementos es punto de silla.
public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime las filas que quieres que tenga la matriz: ");
        int fila = teclado.nextInt();

        System.out.print("Dime las columnas que quieres que tenga la matriz: ");
        int columna = teclado.nextInt();
        int [][]x = new int[fila][columna];
        rellenarArray(x);
        mostrarArray(x);
        puntoSilla(x);
    }

    private static void puntoSilla(int[][] x) {
        int numeroMayorColumna = x[0][0];
        int numeroMenorFila = x[0][0];
        int i = 0;
        int j = 0;
        int filaMayor = 0;
        int columnaMenor = 0;
        for (int contadorI = 0; contadorI < x.length; contadorI++) {
            for (int contadorJ = 0; contadorJ < x[contadorI].length; contadorJ++) {
                    if (numeroMenorFila > x[contadorI][contadorJ]){
                        numeroMenorFila = x[contadorI][contadorJ];
                        i = contadorI;
                        columnaMenor = contadorJ;
                    }
                    if (numeroMayorColumna < x[contadorI][contadorJ]) {
                        numeroMayorColumna = x[contadorI][contadorJ];
                        j = contadorJ;
                        filaMayor = contadorI;
                    }
                }
        }
        if (esPuntoDeSilla(x,i,j)){
            System.out.println("Hay un punto de silla en la fila" +i+" y en la columna"+j);
        }else{
            System.out.println("No hay punto de silla en esta matriz");
        }
    }
    public static boolean esPuntoDeSilla(int x[][], int i, int j){
        boolean esSilla = false;
        for (int k = 0; k < x.length; k++) {
            for (int l = 0; l < x[k].length; l++) {
                if (x[i][l] == i && x[k][j] == j){
                    esSilla = true;
                }
            }
        }
        return esSilla;
    }

    private static void mostrarArray(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(" | " + x[i][j] + " | ");
            }
            System.out.println();
        }
    }

    private static void rellenarArray(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int) (11+Math.random()*993);
            }
        }
    }
}
