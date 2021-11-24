package U3.Varios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4_entregable_Tarde {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("De cuantas dimensiones quieres hacer el tablero: ");
        int numeroTableros = teclado.nextInt();

        String [][] arrayRelleno = new String[numeroTableros][numeroTableros];
        rellenarArray(arrayRelleno);
        System.out.println("Dime una posicion: ");
        String numeroIntroducido = teclado.nextLine();
        int fila = Integer.parseInt(numeroIntroducido.substring(0,1));
        int columna = Integer.parseInt(numeroIntroducido.substring(2,3));


    }

    private static void rellenarArray(String[][] arrayRelleno) {
        for (int i = 0; i < arrayRelleno.length; i++) {
            for (int j = 0; j < arrayRelleno[i].length; j++) {
                arrayRelleno[i][j] = rellenarTablero((int) (Math.random()*2));
                System.out.print(" | "+arrayRelleno[i][j] + " | ");
            }
            System.out.println();
        }
    }

    static String rellenarTablero (int numero){
        String cadena= "";
        if (numero == 0){
            cadena = "X";
        }else{
            cadena = "-";
        }
        return cadena;
    }

    static String comprobar_bomba_arribaIzq(){

    }

}
