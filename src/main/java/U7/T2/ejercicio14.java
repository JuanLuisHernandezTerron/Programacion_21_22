package U7.T2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Implementar la función leeCadena con el siguiente prototipo:

List<Character> leeCadena()
Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.*/
public class ejercicio14 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(leerCadena());
    }

    private static List<Character>leerCadena() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una palabra: ");
        String palabra = teclado.nextLine();
        List<Character> lista= new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            Character charAUX = palabra.charAt(i);
            String stringAux = String.valueOf(charAUX);
            if (!stringAux.equalsIgnoreCase(" ")){
                lista.add(charAUX);
            }
        }
        return lista;
    }
}
