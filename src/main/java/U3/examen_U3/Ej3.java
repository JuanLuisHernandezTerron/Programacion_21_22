package U3.examen_U3;

import java.util.Arrays;
import java.util.Scanner;

//Desarrolla dos funciones para trabajar con cadenas. La primera tendrá la siguiente cabecera:
//
//public static String[] invertir(String cadena)
//Recibe una cadena (String), y devuelve esa cadena invertida y en mayúsculas pero colocada en
// un array (una letra por posición)
//invertir("hola") debe devolver [ "A","L","O","H"]
//Ejemplo:
//
//invertir("hola") debe devolver [ "A","L","O","H"]
//La segunda función tendrá la siguiente cabecera:
//
//public static String[] desplazarVocales(String cadena)
//Recibe una cadena (String), y devuelve esa misma cadena con las vocales desplazadas una posición:
//
//a -> e
//e -> i
//i -> o
//o -> u
//u -> a
//y colocada en un vector (una letra por posición)
//
//Ejemplo:
//
//desplazarVocales("hola") debe devolver ["h","u","l","e"]
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime que frase quieres decir: ");
        String frase = teclado.nextLine();
        System.out.println(Arrays.toString(invertir(frase)));
        System.out.println(Arrays.toString(desplazarVocales(frase)));

    }
    public static String[] desplazarVocales(String cadena){
        String [] arrayAUX = new String[cadena.length()];
        String CadenaVacia = "";
        for (int i = 0; i < cadena.length(); i++) {
            String recorrerFrase = String.valueOf(cadena.charAt(i));
            switch (recorrerFrase){
                case "a": recorrerFrase = "e";
                break;
                case "e": recorrerFrase = "i";
                break;
                case "i": recorrerFrase = "o";
                break;
                case "o": recorrerFrase = "u";
                break;
                case "u": recorrerFrase = "a";
            }
            arrayAUX[i] = recorrerFrase;
        }
        return arrayAUX;
    }

    public static String[] invertir(String cadena){
        String [] arrayAUX = new String[cadena.length()];
        int contadorDisminuir = cadena.length()-1;
        for (int i = 0; i < cadena.length(); i++) {
            String recorrerFrase = String.valueOf(cadena.charAt(i));
            recorrerFrase = recorrerFrase.toUpperCase();
            arrayAUX[contadorDisminuir--] = recorrerFrase;
        }
        return arrayAUX;
    }
}
