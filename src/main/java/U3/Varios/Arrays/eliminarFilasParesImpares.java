package U3.Varios.Arrays;

import java.util.Arrays;

public class eliminarFilasParesImpares {
    public static void main(String[] args) {
        int [][] arrayRelleno = new int[4][4];
        rellenarArray(arrayRelleno);
        System.out.println();
        mostrarArray(eliminarFilasColumnasImpares(arrayRelleno));
    }

    private static void mostrarArray(int[][] eliminarFilasColumnasImpares) {
        for (int i = 0; i < eliminarFilasColumnasImpares.length; i++) {
            for (int j = 0; j < eliminarFilasColumnasImpares[i].length; j++) {
                System.out.print(" | " + eliminarFilasColumnasImpares[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static int[][] eliminarFilasColumnasImpares(int[][] arrayRelleno){
        int [][] arrayAUX = new int[arrayRelleno.length/2][arrayRelleno[0].length];
        int contadorInsertadoI = 0;
        int contadorInsertado = 0;
            for (int i = 0; i < arrayRelleno.length; i++) {
                for (int j = 0; j < arrayRelleno[i].length; j++) {
                    if (i % 2 != 0){
                        break;
                    }
                    if (i % 2 == 0){
                        arrayAUX[contadorInsertadoI][contadorInsertado] = arrayRelleno[i][j];
                        contadorInsertado ++;
                    }
                }
                if (contadorInsertadoI %2 == 0) {
                    contadorInsertadoI++;
                }
                contadorInsertado =0;
            }
        return arrayAUX;
    }
    private static void rellenarArray(int[][] arrayRelleno) {
        for (int i = 0; i < arrayRelleno.length; i++) {
            for (int j = 0; j < arrayRelleno[i].length; j++) {
                arrayRelleno[i][j] = (int) (Math.random()*100);
                System.out.print(" | " + arrayRelleno[i][j]+ " | ");
            }
            System.out.println();
        }
    }
}
