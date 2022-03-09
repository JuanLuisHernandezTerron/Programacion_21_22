package U7.T1.Actividad5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*Crear una colección de 20 números enteros aleatorios distintos menores que 100, guardarlos por
orden decreciente a medida que se vayan generando, y mostrar la colección por pantalla.*/
public class ejercicio5{
    public static void main(String[] args) {
        ArrayList<Integer> arrayInt = new ArrayList<>();
        int numeroRandom = (int) (1 + Math.random() * 100);
        arrayInt.add(numeroRandom);
        int contador = 0;
        for (int i = 0; i < 20; i++) {
            numeroRandom = (int) (1 + Math.random() * 100);
            for (int j = 0; j < arrayInt.size(); j++) {
                if (arrayInt.get(i).equals(arrayInt.get(j))){
                    arrayInt.add(numeroRandom);
                    contador++;
                    if (contador == 1){
                        while (numeroRandom < arrayInt.get(i)){
                            Collections.sort(arrayInt,new ordenarArrayDesc());
                            numeroRandom = (int) (1 + Math.random() * 100);
                            arrayInt.set(i,numeroRandom);
                        }
                    }
                }
            }
            Collections.sort(arrayInt,new ordenarArrayDesc());
            contador =0;
        }
        mostrarArray(arrayInt);
        }

    private static void mostrarArray(ArrayList<Integer> arrayInt) {
        for (Integer numero : arrayInt) {
            System.out.print(numero+" ");
        }
    }

}
