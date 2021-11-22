package U3.T3extra;

import java.util.Scanner;

//Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría
// saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil se mueve
// siempre en diagonal. El tablero cuenta con64 casillas. Las columnas se indican con las letras de la
// “a” a la “h” y las filas se indican del 1 al 8.
public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String [][] arrayAjedrez = new String[8][8];
    rellenarArray(arrayAjedrez);

        System.out.println("Dime la posición del alfil: ");
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
        System.out.println(numeroJ +""+enteroRest);
    }



    private static void rellenarArray(String [][] array) {
        int contadorFilas = 8;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = contadorFilas + "" + (j+1);
            }
            contadorFilas --;
        }
    }
}
