package U7.T1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int numerRandom = (int) (1+(Math.random()*99));
            arrayNumeros.add(numerRandom);
        }
        mostrarArray(arrayNumeros);
        Collections.sort(arrayNumeros);
        System.out.println();
        mostrarArray(arrayNumeros);

    }

    public static void mostrarArray(ArrayList<Integer> arrayNumeros){
        for ( Integer mostrarArray: arrayNumeros){
            System.out.print(mostrarArray+" ,");
        }
    }
}
