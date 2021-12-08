package U3.Varios.Arrays;
//Realiza un programa que rellene un array de 6 filas por 10 columnas con
//números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
//continuación, el programa deberá dar la posición tanto del máximo como del
//mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.
public class ejercicio2_entregableDavidGonzalez {
    public static void main(String[] args) {
        int [][] array = new int[6][10];
        rellenarArray(array);
        sacarMin(array);
        sacarMax(array);
    }

    private static void sacarMin(int[][] array) {
        int numeroMin = 1000;
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (numeroMin > array[i][j]){
                    numeroMin = array[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("EL numero mas pequeño es "+numeroMin+",y su posicion es "+ fila+","+columna);
    }

    private static void sacarMax(int[][] array) {
     int numeroMax = 0;
     int fila = 0;
     int columna = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (numeroMax < array[i][j]){
                    numeroMax = array[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("El numero mas grande es "+numeroMax+",y su posicion es "+fila+","+columna);
    }

    private static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*1001);
                System.out.print(" | " + array[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
