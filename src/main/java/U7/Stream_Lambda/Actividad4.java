package U7.Stream_Lambda;

import java.util.Arrays;
import java.util.Scanner;

//A partir de una cadena con palabras separadas por espacios introducida por teclado, construye una
// tabla con las palabras. A partir de ella, crea un Stream con las palabras ordenadas por orden alfabético
// y muéstralas por pantalla.
public class Actividad4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = teclado.nextLine();
        String [] ArrayString = sacarPalabras(frase);

        Arrays.stream(ArrayString).sorted(String::compareTo).forEach(System.out::println);


    }

    private static String[] sacarPalabras(String frase) {
        String [] arrayString = new String[0];
        String fraseAUX = "";
        int contadorPalabra = 0;
        for (int i = 0; i < frase.length(); i++) {
         String recorrerFrase = String.valueOf(frase.charAt(i));
         if (!recorrerFrase.equalsIgnoreCase(" ")){
             fraseAUX += recorrerFrase;
         }else{
             arrayString = Arrays.copyOf(arrayString,arrayString.length+1);
             arrayString[contadorPalabra++] = fraseAUX;
             fraseAUX = "";
         }
        }
        arrayString = Arrays.copyOf(arrayString,arrayString.length+1);
        arrayString[contadorPalabra++] = fraseAUX;
        return arrayString;
    }
}
