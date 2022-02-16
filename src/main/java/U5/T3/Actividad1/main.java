package U5.T3.Actividad1;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Integer [] arrayNumeros = new Integer[20];
        meterNumeros(arrayNumeros);
        Arrays.sort(arrayNumeros, new numeroEntero());
        System.out.println(Arrays.toString(arrayNumeros));
    }

    private static void meterNumeros(Integer[] arrayNumeros) {
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = (int) (1+Math.random()*99);
        }
    }
}
