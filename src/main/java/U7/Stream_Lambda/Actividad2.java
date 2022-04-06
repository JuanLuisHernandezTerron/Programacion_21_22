package U7.Stream_Lambda;

import java.util.ArrayList;
import java.util.List;

//A partir de una lista con los enteros del 1 al 100, crea un Stream con los múltiplos de 7.
// Muéstralos por pantalla.
public class Actividad2 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        numeroRandom(listaNumeros);
        listaNumeros.stream().filter(x -> x % 7==0).forEach(System.out::println);
    }

    private static List numeroRandom(List lista) {
        for (int i = 0; i < 101; i++) {
            lista.add((int) (1+Math.random() * 101));
        }
        return lista;
    }
}
