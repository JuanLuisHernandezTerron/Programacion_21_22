package U7.T1.Actividad5;

import java.util.ArrayList;
import java.util.Collections;

/*Crear una colección de 20 números enteros aleatorios distintos menores que 100, guardarlos por
orden decreciente a medida que se vayan generando, y mostrar la colección por pantalla.*/
public class ejercicio5{
    public static void main(String[] args) {
        ArrayList<Integer> arrayInt = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
           int numeroRandom = (int) (1 + Math.random() * 100);
           while (numeroRepetido(arrayInt,numeroRandom)){
               numeroRandom = (int) (1 + Math.random() * 100);
           }
           int indice = 0;
            for (int j = 0; j < arrayInt.size(); j++) {
                if (arrayInt.get(j) > numeroRandom) {
                    indice++;
                }
            }
            arrayInt.add(indice,numeroRandom);
        }
        mostrarArray(arrayInt);
        }

    private static boolean numeroRepetido(ArrayList<Integer> arrayInt, int numero) {
        boolean es_repetido = false;
        for (int i = 0; i < arrayInt.size(); i++) {
            if (arrayInt.get(i) == numero){
                es_repetido = true;
            }
        }
        return es_repetido;
    }


    private static void mostrarArray(ArrayList<Integer> arrayInt) {
        for (Integer numero : arrayInt) {
            System.out.print(numero+" ");
        }
    }

}
