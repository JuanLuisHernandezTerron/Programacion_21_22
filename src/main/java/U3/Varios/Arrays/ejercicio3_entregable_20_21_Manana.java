package U3.Varios.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Ejercicio 3
//
//Implementa una función con nombre corteza que sea capaz de extraer la capa
//exterior de un array bidimensional. Esta capa se extrae en forma de array de
//una dimensión. La extracción de números comienza en la esquina superior
//izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
//tanto el código de la función como el código de prueba que la usa. La cabecera
//de la función es la siguiente:
//
//public static int[] corteza(int[][] n)
//
//Por ejemplo, si el array bidimensional a es el que se muestra a continuación:
//
//45 92 14 20 25 78
//35 72 24 45 42 60
//32 42 64 23 41 39
//98 45 94 11 18 48
//
//El array unidimensional generado por corteza(a) sería el siguiente:
//
//45 92 14 20 25 78 60 39 48 18 11 94 45 98 32 35
public class ejercicio3_entregable_20_21_Manana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas filas quiere que tenga: ");
        int fila = teclado.nextInt();
        System.out.println("Cuantas columnas quiere que tenga: ");
        int columna = teclado.nextInt();

        int [][]n = new int [fila][columna];
        rellenarArray(n);
        sacarCorteza(n);
    }

    private static void sacarCorteza(int[][] n) {
        int numeros = 0;
        int contadorDerecha = 0;
        int contadorUltimaLinea = 0;
        int contadorIntroducido = 0;
        int [] arrayAUX = new int[0];

        for (int i = 0; i < n.length; i++) {
            contadorUltimaLinea = 0;
            int contadorUltimaFila = n[i].length-1;
            for (int j = 0; j < n[i].length; j++) {
                if (contadorDerecha < 1){
                    arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                    arrayAUX[contadorIntroducido] = n[i][j];
                    contadorIntroducido++;
                }
                if (contadorDerecha > 0 && contadorUltimaLinea == n.length+1){
                    arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                    arrayAUX[contadorIntroducido] = n[i][j];
                    contadorIntroducido ++;
                }
                if (contadorDerecha == n.length-1 && (contadorUltimaLinea < n[i].length)){
                    arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                    arrayAUX[contadorIntroducido] = n[i][contadorUltimaFila-j];
                    contadorIntroducido ++;
                }

                contadorUltimaLinea++;
            }
            contadorDerecha ++;
        }
        int contadorIzquierda = n.length-1;
        for (int i = 1; i < n.length-1; i++) {
            arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
            arrayAUX[contadorIntroducido] = n[contadorIzquierda-i][0];
            contadorIntroducido ++;

        }
        System.out.println(Arrays.toString(arrayAUX));
    }

    private static void rellenarArray(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = (int) (100+Math.random()*100);
                System.out.print(" | " + n[i][j] + " | ");
            }
            System.out.println();
        }
    }
}


// if (contadorDerecha == n.length) { //En array bidi, los .lenght a secas son las filas, si es [i][n.length] sería las columnas.
//         contadorUltimaLinea++;
//         }