package U7.Stream_Lambda;
//A partir de una lista de 100 enteros aleatorios menores que 1000:
//Calcula cuántos son primos.
//Determina cuál es el mayor, el menor, la suma de todos ellos y el valor promedio.

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Actividad1 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        numeroRandom(listaNumeros);
        int contador = (int) listaNumeros.stream().filter(x -> sacarNumerosPrimos(x)).count();
        int sumaLista = listaNumeros.stream().mapToInt(Integer::intValue).sum();
        Integer numerMayor = listaNumeros.stream().max(Integer::compareTo).get();
        System.out.println("El numero mayor es: "+numerMayor);
        Integer numeroMenor = listaNumeros.stream().min(Integer::compareTo).get();
        System.out.println("El numero menor es: "+numeroMenor);
        System.out.println("La suma total es: "+sumaLista);
        OptionalDouble mediaLista = listaNumeros.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println("Su media es: "+mediaLista);
    }

    private static boolean sacarNumerosPrimos(Integer numero) {
        boolean es_primo = false;
        for (int i = 2; i < numero; i++) {
                if (numero%i == 0){
                    es_primo = true;
                }
        }
        return es_primo;
    }

    private static List numeroRandom(List lista) {
        for (int i = 0; i < 101; i++) {
            lista.add((int) (Math.random() * 1001));
        }
        return lista;
    }

}
