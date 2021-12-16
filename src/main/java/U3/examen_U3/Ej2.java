package U3.examen_U3;
//Realiza un programa que genere 10 números aleatorios entre 12 y 89 y que los almacene en un array.
//A continuación, se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello otro
// array adicional (o bien utilizando originalmente un array bidimensional, como se prefiera).
// Seguidamente el programa pasará los números pares a las primeras posiciones, conservando el orden,
// desplazando el resto de números (los impares) de tal forma que no se pierda ninguno y se conserve el
// orden entre ellos. Al final se debe mostrar el array resultante junto con el índice.
//
//Ejemplo:
//
//Array original:
//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//[54, 63, 83, 47, 13, 69, 63, 80, 56, 47]
//
//Array nuevo:
//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//[54, 80, 56, 63, 83, 47, 13, 69, 63, 47]
public class Ej2 {
    public static void main(String[] args) {
        int [][] array = new int[2][10];
        rellenarArray(array);
        mostrarArray(array);
        mostrarArray(ordenarArray(array));
    }


    private static int[][] ordenarArray(int[][] array) {
        int [][] arrayAUX = new int[array.length][array[0].length];
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0){
                    arrayAUX[i][j] = j;
                }else if (i == 1){
                    if (array[i][j] % 2 == 0){
                        arrayAUX[i][contadorPares] = array[i][j];
                        contadorPares ++;
                    }
                }
            }
        }
        contadorImpares = contadorPares;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0){
                    arrayAUX[i][j] = j;
                }else if (i == 1){
                    if (array[i][j] % 2 != 0){
                        arrayAUX[i][contadorImpares] = array[i][j];
                        contadorImpares ++;
                    }
                }
            }
        }
        return arrayAUX;
    }

    private static void mostrarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" | " + array[i][j]+ " | ");
            }
            System.out.println();
        }
    }

    private static void rellenarArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0){
                    array[i][j] = j;
                }else if (i == 1){
                    array[i][j] = (int) (12+Math.random()*77);
                }
            }
        }
    }
}
