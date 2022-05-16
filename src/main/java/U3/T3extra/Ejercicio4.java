package U3.T3extra;

import java.util.Arrays;
import java.util.Scanner;

//Escribe un programa que, dada una posici�n en un tablero de ajedrez, nos diga a qu� casillas podr�a
// saltar un alfil que se encuentra en esa posici�n. Como se indica en la figura, el alfil se mueve
// siempre en diagonal. El tablero cuenta con64 casillas. Las columnas se indican con las letras de la
// �a� a la �h� y las filas se indican del 1 al 8.
public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String [][] arrayAjedrez = new String[8][8];
    rellenarArray(arrayAjedrez);

        System.out.println("Dime la posici�n del alfil: ");
        String alfil = teclado.nextLine();
        String letraNumero = alfil.substring(0,1);
        int enteroRest = Integer.parseInt(alfil.substring(1,2));
        int numeroJ = 0;
        for (int i = 0; i < arrayAjedrez.length; i++) {
            for (int j = 0; j < arrayAjedrez[i].length; j++) {
                System.out.print(" | "+arrayAjedrez[i][j]+" | ");
            }
            System.out.println();
        }


        switch (letraNumero){
            case "a":
                numeroJ = 1;
                break;
            case "b":
                numeroJ = 2;
                break;
            case "c":
                numeroJ = 3;
                break;
            case "d":
                numeroJ = 4;
                break;
            case "e":
                numeroJ = 5;
                break;
            case "f":
                numeroJ = 6;
                break;
            case "g":
                numeroJ = 7;
                break;
            case "h":
                numeroJ = 8;
                break;
        }
        System.out.println("Estos son las posiciones donde puede ir el alfil: ");
        lado_izquierdo_Arriba(enteroRest, numeroJ);
        lado_derecho_Abajo(enteroRest, numeroJ);
        lado_derecho_Arriba(enteroRest,numeroJ);
        lado_izquierdo_Abajo(enteroRest,numeroJ);


    }

    private static void lado_izquierdo_Arriba(int enteroRest, int numeroJ) {
        int contadorFila = numeroJ -1;
        int contadorAltura = enteroRest +1;
        while ((contadorFila >= 1 && contadorFila <=8) && (contadorAltura >=1 && contadorAltura <=8)){//Lado Izquierdo Arriba
            System.out.print(getLetra(contadorFila)+""+contadorAltura+" ");
            contadorFila --;
            contadorAltura ++;
        }
        System.out.println();
    }

    private static void lado_derecho_Abajo(int enteroRest, int numeroJ) {
        int contadorFila = numeroJ+1;
        int contadorAltura = enteroRest -1;
        while ((contadorFila >= 1 && contadorFila <=8) && (contadorAltura >=1 && contadorAltura <=8)){//Lado Derecho Abajo
            System.out.print(getLetra(contadorFila)+""+contadorAltura+" ");
            contadorFila ++;
            contadorAltura --;
        }
        System.out.println();
    }

    private static void lado_derecho_Arriba(int enteroRest, int numeroJ) {
        int contadorFila = numeroJ+1;
        int contadorAltura = enteroRest +1;
        while ((contadorFila >= 1 && contadorFila <=8) && (contadorAltura >=1 && contadorAltura <=8)){//Lado Derecho Arriba
            System.out.print(getLetra(contadorFila)+""+contadorAltura+" ");
            contadorFila ++;
            contadorAltura ++;
        }
        System.out.println();
    }

    private static void lado_izquierdo_Abajo(int enteroRest, int numeroJ) {
        int contadorFila = numeroJ-1;
        int contadorAltura = enteroRest -1;
        while ((contadorFila >= 1 && contadorFila <=8) && (contadorAltura >=1 && contadorAltura <=8)){//Lado Derecho Abajo
            System.out.print(getLetra(contadorFila)+""+contadorAltura+" ");
            contadorFila --;
            contadorAltura --;
        }
        System.out.println();
    }


    private static String getLetra(int numeroLetra){
        String letra = "";
        switch (numeroLetra){
            case 1:
                letra = "a";
                break;
            case 2:
                letra = "b";
                break;
            case 3:
                letra = "c";
                break;
            case 4:
                letra = "d";
                break;
            case 5:
                letra = "e";
                break;
            case 6:
                letra = "f";
                break;
            case 7:
                letra = "g";
                break;
            case 8:
                letra = "h";
                break;
        }
        return letra;
    }


    private static void rellenarArray(String [][] array) {
        int contadorFilas = 8;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] =  getLetra(j+1)+ "" + (contadorFilas);
            }
            contadorFilas --;
        }
    }
}
