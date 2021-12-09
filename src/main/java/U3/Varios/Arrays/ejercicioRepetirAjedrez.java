package U3.Varios.Arrays;
//Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
//a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
//indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
//64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
//se indican del 1 al 8.

import java.util.Scanner;

//Introduzca la posición del alfil: d5
//El álfil puede moverse a las siguientes posiciones:
//h1 a2 g2 b3 f3 c4 e4 c6 e6 b7 f7 a8 g8
public class ejercicioRepetirAjedrez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [][]arrayAjedrez = new String[8][8];
        rellenarArray(arrayAjedrez);
        
        System.out.println("Dime la posicion del alfil: ");
        String posicion = teclado.nextLine();
        int fila = Integer.parseInt(posicion.substring(2,3));
        int columna = sacarNumero(posicion)-1;
        sacarArribaIzq(fila,columna);
        sacarAbajoIzq(fila,columna);
        sacarArribaDer(fila,columna);
        sacarAbajoDer(fila,columna);

    }

    private static void sacarAbajoDer(int fila, int columna) {
        System.out.println();
        while (fila > 0 && fila < 8 && columna >= 0 && columna < 8){
            System.out.print(sacarLetra(columna)+""+fila+" ");
            fila --;
            columna ++;
        }
    }

    private static void sacarArribaDer(int fila, int columna) {
        System.out.println();
        while (fila > 0 && fila < 8 && columna >= 0 && columna < 8){
            fila ++;
            columna ++;
            System.out.print(sacarLetra(columna)+""+fila+" ");
        }
    }

    private static void sacarArribaIzq(int fila, int columna) {
       while (fila > 0 && fila < 8 && columna >= 0 && columna < 8){
           fila ++;
           columna --;
           System.out.print(sacarLetra(columna)+""+fila+" ");
       }
    }

    private static void sacarAbajoIzq(int fila, int columna) {
        System.out.println();
        while (fila > 0 && fila < 8 && columna >= 0 && columna < 8){
            System.out.print(sacarLetra(columna)+""+fila+" ");
            fila --;
            columna --;
        }
    }

    private static void rellenarArray(String [][] arrayAjedrez) {
        int contadorFila = 8;
        for (int i = 0; i < arrayAjedrez.length; i++) {
            for (int j = 0; j < arrayAjedrez[i].length; j++) {
                arrayAjedrez[i][j] = sacarLetra(Integer.parseInt(String.valueOf(j)))+""+(contadorFila);
                System.out.print(" | " + arrayAjedrez[i][j] + " | ");
            }
            contadorFila --;
            System.out.println();
        }
    }

    private static String sacarLetra(int columna) {
        String columnaS = "";
        switch (columna){
            case 0:
                columnaS = "a";
                break;
            case 1:
                columnaS = "b";
                break;
            case 2:
                columnaS = "c";
                break;
            case 3:
                columnaS = "d";
                break;
            case 4:
                columnaS = "e";
                break;
            case 5:
                columnaS = "f";
                break;
            case 6:
                columnaS = "g";
                break;
            case 7:
                columnaS = "h";
                break;
        }
        return columnaS;
    }

    private static int sacarNumero(String posicion) {
        String columnaS = posicion.substring(0,1);
        int columna = 0;
        switch (columnaS){
            case "a":
                columna = 1;
                break;
            case "b":
                columna = 2;
                break;
            case "c":
                columna = 3;
                break;
            case "d":
                columna = 4;
                break;
            case "e":
                columna = 5;
                break;
            case "f":
                columna = 6;
                break;
            case "g":
                columna = 7;
                break;
            case "h":
                columna = 8;
                break;
        }
        return columna;
    }
}
