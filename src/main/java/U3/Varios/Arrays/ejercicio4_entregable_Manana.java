package U3.Varios.Arrays;
//Realiza un programa que rellene un array de 5 filas por 9 columnas con
//números enteros positivos comprendidos entre 100 y 1000 (ambos incluidos). A
//continuación, el programa deberá dar la posición tanto del máximo como del
//mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.
public class ejercicio4_entregable_Manana {
    public static void main(String[] args) {
        int [][] arrayRelleno = new int [5][9];
        rellenarArray(arrayRelleno);

    }

    private static boolean es_Repetido(int [][]array, int numeroRepetido) {
        boolean se_repite = false;
        int contadorIntroducido = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == numeroRepetido){
                    if (contadorIntroducido > 0){
                        se_repite = true;
                    }
                    contadorIntroducido++;
                }
            }
        }
        return se_repite;
    }

    private static void rellenarArray(int[][] arrayRelleno) {
        for (int i = 0; i < arrayRelleno.length; i++) {
            for (int j = 0; j < arrayRelleno[i].length; j++) {
                arrayRelleno[i][j] = (int) (101+Math.random()*900);
                int numeroAux = arrayRelleno[i][j];

                while (es_Repetido(arrayRelleno, numeroAux)){
                    arrayRelleno[i][j] = (int) (101+Math.random()*900);
                }
                System.out.print(" | "+arrayRelleno[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
