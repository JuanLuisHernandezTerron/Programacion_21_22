package U3.Varios.Arrays;
//Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
// diferentes países. El array que contiene los nombres de los paises es el siguiente:
// pais = {“España”, “Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular
// mediante un
//array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210.
// Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar
// utilizando el array de países (no se pueden escribir directamente).
public class ejercicio3_examenRojo {
    public static void main(String[] args) {
        int [][] arrayPaises = new int[4][10];
        rellenarArray(arrayPaises);
        calcularAlturas(arrayPaises);
    }

    private static void calcularAlturas(int[][] arrayPaises) {
        System.out.println("                                                                                                    MED MIN MAX");
        for (int i = 0; i < arrayPaises.length; i++) {
            int contadorDerecha = 0;
           if (i == 0){
               System.out.print("España   ");
           }else if ( i == 1){
               System.out.print("Rusia    ");
           }else if (i == 2){
               System.out.print("Japón    ");
           }else if (i == 3){
               System.out.print("Australia");
           }

            for (int j = 0; j < arrayPaises[i].length; j++) {
                System.out.print(" | " + arrayPaises[i][j] + " | ");
            }
            System.out.print(sacarMedia(arrayPaises, i));
            System.out.print(sacarMax(arrayPaises, i));
            System.out.println();
        }
    }

    private static int sacarMax(int[][] arrayPaises, int i) {
        int numeroMin = 0;
        for (int j = 0; j < arrayPaises.length; j++) {

        }
        return numeroMin;
    }

    private static int sacarMedia(int[][] arrayPaises, int i) {
        int suma = 0;
        for (int l = 0; l < arrayPaises.length; l++) {
            suma = suma + arrayPaises[i][l];
        }
        return suma/arrayPaises.length;
    }


    private static void rellenarArray(int[][] arrayPaises) {
        for (int i = 0; i < arrayPaises.length; i++) {
            for (int j = 0; j < arrayPaises[i].length; j++) {
                arrayPaises[i][j] = (int) (100+Math.random()*101);
            }
        }
    }
}
