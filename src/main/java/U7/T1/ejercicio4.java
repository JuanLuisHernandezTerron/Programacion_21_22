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
        boolean es_Repetido= false;
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
        arrayFrase.add(fraseAUX);
        System.out.println("Palabras repetidas: ");
        palabrasRepetidas(arrayFrase);
        System.out.println("Palabras no repetidas: ");
        palabrasNoRepetidas(arrayFrase);
    }

    private static void palabrasNoRepetidas(ArrayList<String> arrayFrase) {
        int contadorLetrasJ =0;
        int i =0;
        int j=0;
        for (int k = 0; k < arrayFrase.size(); k++) {
            contadorLetrasJ=0;
            for (int l = 0; l < arrayFrase.size(); l++) {
                if (arrayFrase.get(k).equalsIgnoreCase(arrayFrase.get(l))){
                    contadorLetrasJ++;
                }
            }
            if (contadorLetrasJ == 1){
                System.out.println(arrayFrase.get(k));
            }
        }
    }

    private static void palabrasRepetidas(ArrayList<String> arrayFrase) {
        int contadorLetrasJ =1;
        for (int i = 0; i < arrayFrase.size(); i++) {
            for (int j = contadorLetrasJ; j < arrayFrase.size(); j++) {
                if (arrayFrase.get(i).equalsIgnoreCase(arrayFrase.get(j))){
                    if (comprobarRepetido(arrayFrase.get(i))){
                        System.out.println(arrayFrase.get(i));
                    }
                }
            }
            contadorLetrasJ++;
        }
    }

    private static boolean comprobarRepetido(String s) {
        boolean es_repetido = false;
        ArrayList<String> arrayAUX = new ArrayList<>();
        arrayAUX.add(s);
        for (String aux : arrayAUX) {
            es_repetido = false;
            if (s.equalsIgnoreCase(aux)) {
                es_repetido = true;
            }
        }
        return es_repetido;
    }
}
