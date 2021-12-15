package U3.Varios.Arrays;

import java.util.Scanner;

//Utilizando vectores bidimensionales enla función,realizar la siguiente función para un juego de ajedrez:
//
//public static boolean jaque(String posRey,String posReina)
//
//        Y nos devuelva si reina está en posición de jaque al rey.
//
//        La posiciones que recibe la función son posiciones de ajedrez: a5, h4,c8
public class ejercicio3_ExamenMananaAzul {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [][] arrayAjedrez = new String[8][8];
        mostrarArray(rellenarArray(arrayAjedrez));
        System.out.println("Dime la posicion del rey: ");
        String posRey = teclado.nextLine();
        System.out.println("Dime la posicion de la reina: ");
        String posReina = teclado.nextLine();
        if (jaque(posRey,posReina)){
            System.out.println("Es jaque");
        }else{
            System.out.println("No es jaque");
        }
    }
    public static boolean jaque(String posRey,String posReina){
        int filaRey = Integer.parseInt(posRey.substring(1,2));
        int columaRey = sacarNumeroColumna(posRey.substring(0,1));
        int filaReina =Integer.parseInt(posReina.substring(1,2));
        int columnaReina = sacarNumeroColumna((posReina.substring(0,1)));
        boolean es_jaque = false;


        if (comprobarFilaColumna(filaReina,columnaReina,filaRey,columaRey) || comprobarIzquierdaArriba(filaReina,columnaReina,filaRey,columaRey)
           || comprobarDerechaArriba(filaReina,columnaReina,filaRey,columaRey) ||comprobarDerechaAbajo(filaReina,columnaReina,filaRey,columaRey)
           || comprobarIzquierdaAbajo(filaReina,columnaReina,filaRey,columaRey)){
            es_jaque = true;
        }

        return es_jaque;
    }

    private static boolean comprobarIzquierdaAbajo(int filaReina, int columnaReina, int filaRey, int columaRey) {
        boolean es_jaque = false;

        while (filaReina > 0 && columnaReina <=8 && filaReina <=8 && columnaReina>0 && !es_jaque){
            if (filaReina == filaRey && columnaReina == columaRey){
                es_jaque= true;

            }else{
                filaReina--;
                columnaReina--;
            }
        }
        return es_jaque;
    }

    private static boolean comprobarDerechaAbajo(int filaReina, int columnaReina, int filaRey, int columaRey) {
        boolean es_jaque = false;

        while (filaReina > 0 && columnaReina <=8 && filaReina <=8 && columnaReina>0&& !es_jaque){
            if (filaReina == filaRey && columnaReina == columaRey){
                es_jaque= true;
            }else{
                filaReina--;
                columnaReina++;
            }
        }
        return es_jaque;
    }

    private static boolean comprobarDerechaArriba(int filaReina, int columnaReina, int filaRey, int columaRey) {
        boolean es_jaque = false;

        while (filaReina > 0 && columnaReina <=8 && filaReina <=8 && columnaReina>0 && !es_jaque){
            if (filaReina == filaRey && columnaReina == columaRey){
                es_jaque= true;

            }else{
                filaReina++;
                columnaReina ++;
            }
        }
        return es_jaque;
    }
    private static boolean comprobarIzquierdaArriba(int filaReina, int columnaReina, int filaRey, int columaRey) {
        boolean es_jaque = false;

        while (filaReina > 0 && columnaReina <=8 && filaReina <=8 && columnaReina>0 && !es_jaque){
            if (filaReina == filaRey && columnaReina == columaRey){
                es_jaque= true;
            }
            filaReina ++;
            columnaReina--;

        }
        return es_jaque;
    }

    private static boolean comprobarFilaColumna(int filaReina, int columnaReina, int filaRey, int columaRey) {
        boolean es_jaque = false;
        if (filaReina == filaRey || columnaReina == columaRey){
            es_jaque = true;
        }
        return es_jaque;
    }

    private static int sacarNumeroColumna(String letraColumna) {
        int columna = -1;
        switch (letraColumna){
            case "a": columna = 1;
                break;
            case "b": columna = 2;
                break;
            case "c": columna = 3;
                break;
            case "d": columna = 4;
                break;
            case "e": columna = 5;
                break;
            case "f": columna = 6;
                break;
            case "g": columna = 7;
                break;
            case "h": columna = 8;
                break;
        }
        return columna; //Si un caso no entra en ningun caso, pasar como por defecto el 0;
    }

    private static void mostrarArray(String[][] arrayAjedrez) {
        for (int i = 0; i < arrayAjedrez.length; i++) {
            for (int j = 0; j < arrayAjedrez[i].length; j++) {
                System.out.print(" | " + arrayAjedrez[i][j] + " | ");
            }
            System.out.println();
        }
    }

    private static String[][] rellenarArray(String[][] arrayAjedrez) {
        int contadorAlto = 8;
        for (int i = 0; i < arrayAjedrez.length; i++) {
            for (int j = 0; j < arrayAjedrez[i].length; j++) {
                arrayAjedrez[i][j] = sacarLetra(j)+""+contadorAlto;
            }
            contadorAlto --;
        }
        return arrayAjedrez;
    }

    private static String sacarLetra(int j) {
        String cadenaVacia = "";
        switch (j){
            case 0: cadenaVacia = cadenaVacia + "a";
            break;
            case 1: cadenaVacia = cadenaVacia + "b";
            break;
            case 2: cadenaVacia = cadenaVacia + "c";
            break;
            case 3: cadenaVacia = cadenaVacia + "d";
            break;
            case 4: cadenaVacia = cadenaVacia + "e";
            break;
            case 5: cadenaVacia = cadenaVacia + "f";
            break;
            case 6: cadenaVacia = cadenaVacia + "g";
            break;
            case 7: cadenaVacia = cadenaVacia + "h";
            break;
        }
        return cadenaVacia;
    }

}
