package U7.T2;

import java.util.*;

/* Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única
lista, fusión de las dos anteriores. Desarrollar el algoritmo de forma no destructiva, es decir,
que las listas utilizadas como parámetros de entrada se mantengan intactas.
 */

public class ejercicio13 {
    public static void main(String[] args) {
        List <Integer> lista1 = new ArrayList<Integer>();
        List <Integer> lista2 = new ArrayList<Integer>();

        lista1.add(2);
        lista1.add(6);
        lista1.add(5);
        lista1.add(9);
        lista1.add(7);
        lista1.add(12);
        lista1.add(11);
        lista2.add(5);
        lista2.add(4);
        lista2.add(19);
        lista2.add(14);
        lista2.add(13);
        lista2.add(11);
        Collections.sort(lista1,new ordenarNumeros());
        Collections.sort(lista2, new ordenarNumeros());
        System.out.println(devolverfusion(lista1,lista2));

    }

    private static ArrayList devolverfusion(List<Integer> lista1, List<Integer> lista2) {
        ArrayList <Integer> listaAUX = new ArrayList<>(lista1);
        listaAUX.addAll(lista2);
        return listaAUX;
    }
}
