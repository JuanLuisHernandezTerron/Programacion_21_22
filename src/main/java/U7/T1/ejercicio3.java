package U7.T1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumeros = new ArrayList<>();
        int contadorAUX = 0;
        int contadornumeroAlto = 0;

        for (int i = 0; i < 20; i++) {
            Iterator<Integer> it = arrayNumeros.iterator();
            int numeroRandom = (int) (1+Math.random()*9);
            if (contadorAUX == 0) {
                numeroRandom = (int) (1+Math.random()*9);
                arrayNumeros.add(numeroRandom);
                contadorAUX++;
            }
            contadorAUX++;
            if (contadorAUX >1) {
                if (arrayNumeros.get(0) < numeroRandom) {
                    arrayNumeros.add(0,numeroRandom);
                } else {
                    for (int j = 0; j < arrayNumeros.size(); j++) {
                        if (arrayNumeros.get(j) < numeroRandom){
                            arrayNumeros.add(j,numeroRandom);
                            contadornumeroAlto++;
                            break;
                        }
                    }
                    if (contadornumeroAlto <1) {
                        arrayNumeros.add(numeroRandom);
                    }
                    contadornumeroAlto=0;
                }
                contadorAUX++;
            }
        }
        mostrarArray(arrayNumeros);
    }

    public static void mostrarArray(ArrayList<Integer> arrayNumeros){
        for ( Integer mostrarArray: arrayNumeros){
            System.out.print(mostrarArray+" ");
        }
    }
}
