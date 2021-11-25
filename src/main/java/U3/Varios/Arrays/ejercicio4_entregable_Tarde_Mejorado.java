package U3.Varios.Arrays;

import java.util.Scanner;

public class ejercicio4_entregable_Tarde_Mejorado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("De cuantas dimensiones quieres hacer el tablero: ");
        int numeroTableros = teclado.nextInt();
        boolean es_explotado = false;
        String[][] arrayRelleno = new String[numeroTableros][numeroTableros];
        rellenarArray(arrayRelleno);
        System.out.println("Dime una posicion: ");
        String numeroIntroducido = teclado.next();
        int fila = Integer.parseInt(numeroIntroducido.substring(0, 1))-1;
        int columna = Integer.parseInt(numeroIntroducido.substring(2, 3))-1;

        if (comprobarBomba(fila, columna, arrayRelleno)) {
            System.out.println("La posicion " + fila + "," + columna + " tiene bomba, lo siento");
            es_explotado = true;
        } else {
            System.out.println("La posicion " + fila + "," + columna + " tiene " + comprobarIzquierdaArriba(arrayRelleno,fila,columna) + " bombas cercanas");
        }

        while (!es_explotado){
            for (int i = 0; i < arrayRelleno.length; i++) {
                for (int j = 0; j < arrayRelleno[i].length; j++) {
                    System.out.print(" | "+arrayRelleno[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println("Dime una posicion: ");
            numeroIntroducido = teclado.next();
            if (comprobarBomba(fila, columna, arrayRelleno)) {
                System.out.println("La posicion " + fila + "," + columna + " tiene bomba, lo siento");
                es_explotado = true;
            } else {
                System.out.println("La posicion " + fila + "," + columna + " tiene " + comprobarIzquierdaArriba(arrayRelleno,fila,columna) + " bombas cercanas");
            }
        }

    }

    private static void rellenarArray(String[][] arrayRelleno) {
        for (int i = 0; i < arrayRelleno.length; i++) {
            for (int j = 0; j < arrayRelleno[i].length; j++) {
                arrayRelleno[i][j] = rellenarTablero((int) (Math.random() * 2));
                System.out.print(" | " + arrayRelleno[i][j] + " | ");
            }
            System.out.println();
        }
    }

    static String rellenarTablero(int numero) {
        String cadena = "";
        if (numero == 0) {
            cadena = "X";
        } else {
            cadena = "-";
        }
        return cadena;
    }

    static boolean comprobarBomba(int fila, int columna, String array[][]) {
        boolean es_Bomba = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[fila][columna].equals("X")) {
                    es_Bomba = true;
                }
            }
        }
        return es_Bomba;
    }

    static int comprobarIzquierdaArriba(String array[][], int fila, int columna) {
        int contadorBombas = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (     fila-1 == i && columna-1 == j ||
                         (fila-1 == i && columna == j)||
                        (fila-1 == i && columna+1 == j)||
                        (fila== i && columna+1 == j)||
                        (fila+1 == i && columna+1 == j)||
                        (fila+1 == i && columna== j)||
                        (fila+1 == i && columna-1 == j)||
                        (fila == i && columna-1 == j)
                ){
                    if (array[i][j].equals("X")){
                        contadorBombas ++;
                    }
                }
            }
        }
        return contadorBombas;
    }
}
