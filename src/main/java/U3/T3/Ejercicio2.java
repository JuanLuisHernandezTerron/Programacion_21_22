package U3.T3;
//Introducir por teclado una frase palabra a palabra, y mostrar la
// frase completa separando las palabras introducidas con espacios en blanco.
// Terminar de leer la frase cuando la palabra introducida sea "fin" escrita con cualquier
// combinación de mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase final.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String  palabra = "";
        String  fraseconcatAux = "";
        System.out.println(fraseconcatAux);

        while (!palabra.equalsIgnoreCase("fin")){
            System.out.print("Dime varias palabras: ");
            palabra = teclado.nextLine();

            fraseconcatAux += " "+palabra;
        }
        System.out.println(fraseconcatAux);
    }
}
