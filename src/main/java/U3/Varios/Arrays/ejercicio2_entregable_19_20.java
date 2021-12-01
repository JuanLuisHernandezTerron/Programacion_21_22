package U3.Varios.Arrays;
//Escribe un programa que pida 20 números enteros. Estos números se deben
//introducir en un array de 4 filas por 5 columnas. El programa mostrará las
//sumas parciales de filas y columnas igual que si de una hoja de cálculo se
//tratara. La suma total debe aparecer en la esquina inferior derecha.
public class ejercicio2_entregable_19_20 {
    public static void main(String[] args) {
        int [][] arrayTotal = new int [4][5];
        rellenarArray(arrayTotal);
        sumaArrayFila(arrayTotal);
        System.out.println("---------------------------------------");
        sumaArrayColumnas(arrayTotal);
        sumaTotal(arrayTotal);
    }

    private static void sumaTotal(int[][] arrayTotal) {

        int total = 0;
        for (int i = 0; i < arrayTotal.length; i++) {
            total = sumaColumna(arrayTotal,i) + sumaFilaTotal(arrayTotal);
        }
        System.out.print(" | " + total + " | ");
    }

    private static int sumaArrayColumnas(int[][] arrayTotal) {
        int sumaColumnas = 0;
        int contadorColumnas = 0;
        int sumatotal = 0;
        sumaArrayFila(arrayTotal);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

            }
            sumatotal = sumatotal+sumaColumna(arrayTotal,i);
            System.out.print(" | " + sumaColumna(arrayTotal,i) + " | ");
        }
        return sumatotal;
    }
    static int sumaColumna (int [][] array , int i){
        int sumacolumna = 0;
        for (int j = 0; j < array.length; j++) {
            sumacolumna = array[j][i] + sumacolumna;
        }
        return sumacolumna;
    }

    static int sumaFilaTotal (int [][] array){
        int sumaFila = 0;
        for (int i = 0; i < array.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumaFila = array[i][j] + sumaFila;
            }
        }
        return sumaFila;
    }

    private static void sumaArrayFila(int[][] arrayTotal) {

        for (int i = 0; i < arrayTotal.length; i++) {
            int sumaTotal = 0;
            for (int j = 0; j < arrayTotal[i].length; j++) {
                System.out.print(" | " + arrayTotal[i][j] + " | ");
                sumaTotal = arrayTotal[i][j] + sumaTotal;
            }
            System.out.println(sumaTotal);
        }
    }


    private static void rellenarArray(int[][] arrayTotal) {
        for (int i = 0; i < arrayTotal.length; i++) {
            for (int j = 0; j < arrayTotal[i].length; j++) {
                arrayTotal[i][j] = (int) (Math.random()*101);
            }
        }
    }
}
