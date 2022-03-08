package U7.T1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios. Almacenar en una lista
las palabras de la frase, una en cada nodo y mostrar por pantalla las palabras que estén repetidas. A continuación,
mostrar las que no lo estén.*/

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un frase: ");
        String frase= teclado.nextLine();
        ArrayList<String> arrayFrase = new ArrayList<>();
        String fraseAUX = "";
        for (int i = 0; i < frase.length(); i++) {
            Iterator <String> it = arrayFrase.iterator();
            String recorerFrase= String.valueOf(frase.charAt(i));
            if (recorerFrase.equalsIgnoreCase(" ")){
                arrayFrase.add(fraseAUX);
                fraseAUX= "";
            }else{
                fraseAUX+=recorerFrase;
            }
        }
    }
}
