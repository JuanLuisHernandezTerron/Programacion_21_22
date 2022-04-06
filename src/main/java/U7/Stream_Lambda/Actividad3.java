package U7.Stream_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Fusiona dos listas, cada una con 20 enteros aleatorios entre 1 y 100,
// en un Stream ordenado sin repeticiones. Muestra los elementos del Stream.
public class Actividad3 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        numeroRandom(lista1);
        numeroRandom(lista2);
        Stream<Integer> stream1 = lista1.stream();
        Stream<Integer> stream2 = lista2.stream();
        Stream.concat(stream1,stream2).sorted().distinct().forEach(System.out::println);

    }

    private static List numeroRandom(List lista) {
        for (int i = 0; i < 21; i++) {
            lista.add((int) (1+Math.random() * 101));
        }
        return lista;
    }
}
