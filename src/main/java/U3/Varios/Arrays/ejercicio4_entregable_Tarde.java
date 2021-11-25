package U3.Varios.Arrays;

import java.util.Scanner;

public class ejercicio4_entregable_Tarde {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("De cuantas dimensiones quieres hacer el tablero: ");
        int numeroTableros = teclado.nextInt();

        String[][] arrayRelleno = new String[numeroTableros][numeroTableros];
        rellenarArray(arrayRelleno);
        System.out.println("Dime una posicion: ");
        String numeroIntroducido = teclado.next();
        int fila = Integer.parseInt(numeroIntroducido.substring(0, 1));
        int columna = Integer.parseInt(numeroIntroducido.substring(2, 3));
        int contadorBombas = comprobarIzquierdaAbajo(arrayRelleno, fila, columna)
                            +comprobarIzquierdaArriba(arrayRelleno, fila, columna)
                            +comprobarIzquierda(arrayRelleno, fila, columna)
                            +comprobarArribaDerecha(arrayRelleno, fila, columna)
                            +comprobarDerecha(arrayRelleno, fila, columna)
                            +comprobarDerechaAbajo(arrayRelleno, fila, columna)
                            +comprobarArribaCentro(arrayRelleno, fila, columna)
                            +comprobarAbajoCentro(arrayRelleno, fila, columna);

        if (comprobarBomba(fila, columna, arrayRelleno)) {
            System.out.println("La posicion " + fila + "," + columna + " tiene bomba, lo siento");
        } else {
            System.out.println("La posicion "+fila+","+columna+ " tiene " +contadorBombas + " bombas cercanas");
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

    static int comprobarIzquierdaAbajo(String array[][], int fila, int columna) {
        int contadorBombas = 0;
        int contadorMovimientos = 0;

        for (int i = 0; i < array.length; i++) {
            boolean es_bomba = false;
            for (int j = 0; j < array[i].length; j++) {
                if (contadorMovimientos < 1) {
                    contadorMovimientos++;
                    if (array[fila + 1][columna - 1].equals("X")) {
                        es_bomba = true;
                        break;
                    }
                }
            }
            if (es_bomba){
                contadorBombas++;
            }
        }
            return contadorBombas;
    }
    static int comprobarIzquierdaArriba(String array[][], int fila, int columna) {
        int contadorBombas = 0;
        int contadorMovimientos = 0;

        for (int i = 0; i < array.length; i++) {
            boolean es_bomba = false;
            for (int j = 0; j < array[i].length; j++) {
                if (contadorMovimientos < 1) {
                    contadorMovimientos++;
                    if (array[fila - 1][columna - 1].equals("X")) {
                        es_bomba = true;
                        break;
                    }
                }
            }
            if (es_bomba){
                contadorBombas++;
            }
        }
        return contadorBombas;
    }
    static int comprobarIzquierda(String array[][], int fila, int columna) {
        int contadorBombas = 0;
        int contadorMovimientos = 0;

        for (int i = 0; i < array.length; i++) {
            boolean es_bomba = false;
            for (int j = 0; j < array[i].length; j++) {
                if (contadorMovimientos < 1) {
                    contadorMovimientos++;
                    if (array[fila][columna-1].equals("X")) {
                        es_bomba = true;
                        break;
                    }
                }
            }
            if (es_bomba){
                contadorBombas++;
            }
        }
        return contadorBombas;
    }
    static int comprobarArribaDerecha(String array[][], int fila, int columna) {
        int contadorBombas = 0;
        int contadorMovimientos = 0;

        for (int i = 0; i < array.length; i++) {
            boolean es_bomba = false;
            for (int j = 0; j < array[i].length; j++) {
                if (contadorMovimientos < 1) {
                    contadorMovimientos++;
                    if (array[fila-1][columna+1].equals("X")) {
                        es_bomba = true;
                        break;
                    }
                }
            }
            if (es_bomba){
                contadorBombas++;
            }
        }
        return contadorBombas;
    }
    static int comprobarDerecha(String array[][], int fila, int columna) {
        int contadorBombas = 0;
        int contadorMovimientos = 0;

        for (int i = 0; i < array.length; i++) {
            boolean es_bomba = false;
            for (int j = 0; j < array[i].length; j++) {
                if (contadorMovimientos < 1) {
                    contadorMovimientos++;
                    if (array[fila][columna+1].equals("X")) {
                        es_bomba = true;
                        break;
                    }
                }
            }
            if (es_bomba){
                contadorBombas++;
            }
        }
        return contadorBombas;
    }
    static int comprobarDerechaAbajo(String array[][], int fila, int columna) {
        int contadorBombas = 0;
        int contadorMovimientos = 0;

        for (int i = 0; i < array.length; i++) {
            boolean es_bomba = false;
            for (int j = 0; j < array[i].length; j++) {
                if (contadorMovimientos < 1) {
                    contadorMovimientos++;
                    if (array[fila+1][columna+1].equals("X")) {
                        es_bomba = true;
                        break;
                    }
                }
            }
            if (es_bomba){
                contadorBombas++;
            }
        }
        return contadorBombas;
    }
    static int comprobarArribaCentro(String array[][], int fila, int columna) {
        int contadorBombas = 0;
        int contadorMovimientos = 0;

        for (int i = 0; i < array.length; i++) {
            boolean es_bomba = false;
            for (int j = 0; j < array[i].length; j++) {
                if (contadorMovimientos < 1) {
                    contadorMovimientos++;
                    if (array[fila-1][columna].equals("X")) {
                        es_bomba = true;
                        break;
                    }
                }
            }
            if (es_bomba){
                contadorBombas++;
            }
        }
        return contadorBombas;
    }
    static int comprobarAbajoCentro(String array[][], int fila, int columna) {
        int contadorBombas = 0;
        int contadorMovimientos = 0;

        for (int i = 0; i < array.length; i++) {
            boolean es_bomba = false;
            for (int j = 0; j < array[i].length; j++) {
                if (contadorMovimientos < 1) {
                    contadorMovimientos++;
                    if (array[fila+1][columna].equals("X")) {
                        es_bomba = true;
                        break;
                    }
                }
            }
            if (es_bomba){
                contadorBombas++;
            }
        }
        return contadorBombas;
    }
}
