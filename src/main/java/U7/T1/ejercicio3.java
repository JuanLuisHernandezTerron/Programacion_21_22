package U7.T1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumeros = new ArrayList<>();
        Iterator<Integer> it = arrayNumeros.iterator();
        int numeroAUX=0;

        for (int i = 0; i < 20; i++) {
            int numeroRandom = (int) (1+Math.random()*9);
            while (it.hasNext()){

            }
        }
        mostrarArray(arrayNumeros);
    }

    public static void mostrarArray(ArrayList<Integer> arrayNumeros){
        for ( Integer mostrarArray: arrayNumeros){
            System.out.print(mostrarArray+" ,");
        }
    }
}
