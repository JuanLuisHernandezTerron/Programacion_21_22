package U3.T1;

import java.util.Scanner;

//Crear una función que, mediante un booleano, indique si el carácter
// que se pasa como parámetro de entrada corresponde con una vocal.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una letra: ");
        String letra = teclado.next();
        boolean vocal = false;
        String vocales = "aeiou";

        if (letrasVocales(letra,vocal,vocales)){
            System.out.print("Es vocal");
        }else{
            System.out.println("No es vocal");
        }

    }
    static boolean letrasVocales(String letra, boolean vocal, String vocales){
        char vocalAux;

        for (int i = 0; i < 5; i++) {
            vocalAux = vocales.charAt(i);
            if (letra.equalsIgnoreCase(String.valueOf(vocalAux))){
                vocal = true;
            }
        }
        return vocal;
    }
}
