package U3.U3_Entregable;

import java.util.Arrays;
import java.util.Scanner;

//Ejercicio 3
//Realiza un programa que muestre por pantalla un array bidimensional con
// tantas filas y columnas como indique el usuario. Deberá rellenarse la matriz con números
// aleatorios entre 14 y 78 (ambos incluidos).
//
//A continuación, el programa debe insertar en un array pares los números que se encuentran
// en la intersección de las filas pares con las columnas pares. Se hace lo mismo para el array
// impares con los números que se encuentran en la intersección de las filas impares con las columnas
// impares.
//
//Finalmente se debe mostrar la matriz de números, el array de números pares, el de números impares,
// y la suma, media y máximo y mínimo de cada uno de los arrays pares e impares.
//
//Ejemplo 1:
//
//Introduce el número de filas: 5
//Introduce el número de columnas: 8
//
//Matriz:
//[69, 17, 51, 49, 28, 45, 38, 28]
//[67, 78, 60, 44, 78, 47, 18, 40]
//[38, 48, 15, 67, 65, 56, 34, 51]
//[42, 52, 27, 75, 39, 14, 57, 63]
//[47, 22, 61, 26, 63, 46, 50, 31]
//
//Pares:
//[69, 51, 28, 38, 38, 15, 65, 34, 47, 61, 63, 50]
//
//Impares:
//[78, 44, 47, 40, 52, 75, 14, 63]
//
//Suma de pares: 559
//Suma de impares: 413
//Media de pares: 46
//Media de impares: 51
//Máximo de pares: 69
//Mínimo de pares: 15
//Máximo de impares: 78
//Mínimo de impares: 14
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime cuantas filas quieres que tenga: ");
        int fila = teclado.nextInt();
        System.out.println("Dime cuantas columnas quieres que tenga: ");
        int columna = teclado.nextInt();

        int [][]arrayMatriz = new int [fila][columna];
        rellenarArray(arrayMatriz);
        System.out.println("El array par quedaría así: "+ Arrays.toString(sacarPares(arrayMatriz)));
        getEstadisticasPar(sacarPares(arrayMatriz));
        System.out.println("El array impar quedaría así: "+ Arrays.toString(sacarImpares(arrayMatriz)));
        getEstadisticasImpar(sacarImpares(arrayMatriz));
    }

    private static int[] sacarPares(int[][] arrayMatriz) {
        int []arrayPar = new int [0];
        int contadorIntroducido = 0;
        for (int i = 0; i < arrayMatriz.length; i++) {
            for (int j = 0; j < arrayMatriz[i].length; j++) {
                if ((i % 2 ==0)  && (j %2 ==0)){
                    arrayPar = Arrays.copyOf(arrayPar,arrayPar.length+1);
                    arrayPar[contadorIntroducido] = arrayMatriz[i][j];
                    contadorIntroducido ++;
                }
            }
        }
        return arrayPar;
    }
    private static void getEstadisticasPar(int[] sacarPares) {
        int sumaPares = 0;
        int mediaPares = 0;
        int parMax = sacarPares[0];
        int parMin = sacarPares[0];
        for (int i = 0; i < sacarPares.length; i++) {
            sumaPares = sumaPares + sacarPares[i];
            if (parMax < sacarPares[i]){
                parMax = sacarPares[i];
            }
            if (parMin > sacarPares[i]){
                parMin = sacarPares[i];
            }

        }
        mediaPares = sumaPares / sacarPares.length;
        System.out.println("La suma de pares es: "+ sumaPares);
        System.out.println("La media de pares es: "+ mediaPares);
        System.out.println("El numero maximo de par es: "+ parMax);
        System.out.println("El numero minimo de par es: "+ parMin);

    }

    private static int[] sacarImpares(int[][] arrayMatriz) {
        int []arrayimpar = new int [0];
        int contadorIntroducido = 0;
        for (int i = 0; i < arrayMatriz.length; i++) {
            for (int j = 0; j < arrayMatriz[i].length; j++) {
                if ((i % 2 !=0)  && (j %2 !=0)){
                    arrayimpar = Arrays.copyOf(arrayimpar,arrayimpar.length+1);
                    arrayimpar[contadorIntroducido] = arrayMatriz[i][j];
                    contadorIntroducido ++;
                }
            }
        }
        return arrayimpar;
    }
    private static void getEstadisticasImpar(int[] sacarImpares) {
        int sumaImpares = 0;
        int mediaImpares = 0;
        int imparMax = sacarImpares[0];
        int imparMin = sacarImpares[0];
        for (int i = 0; i < sacarImpares.length; i++) {
            sumaImpares = sumaImpares + sacarImpares[i];
            if (imparMax < sacarImpares[i]){
                imparMax = sacarImpares[i];
            }
            if (imparMin > sacarImpares[i]){
                imparMin = sacarImpares[i];
            }
        }
        mediaImpares = sumaImpares / sacarImpares.length;
        System.out.println("La suma de Impares es: "+ sumaImpares);
        System.out.println("La media de Impares es: "+ mediaImpares);
        System.out.println("El numero maximo de Impar es: "+ imparMax);
        System.out.println("El numero minimo de Impar es: "+ imparMin);
    }

    private static void rellenarArray(int[][] arrayMatriz) {
        for (int i = 0; i < arrayMatriz.length; i++) {
            for (int j = 0; j < arrayMatriz[i].length; j++) {
                arrayMatriz[i][j] = (int) (14+Math.random()*65);
                System.out.print(" | " + arrayMatriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
