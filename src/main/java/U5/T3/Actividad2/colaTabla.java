package U5.T3.Actividad2;

import java.util.Arrays;

public class colaTabla implements cola{

    private Integer [] arrayNumeros = new Integer[0];
    private int contadorArray =0;

    @Override
    public void encolan(Integer numero) {
        arrayNumeros = Arrays.copyOf(arrayNumeros,arrayNumeros.length+1);
        arrayNumeros[contadorArray++] = numero;
    }

    @Override
    public void desencolar() {
        for (int i = 0; i < arrayNumeros.length-1; i++) {
            arrayNumeros[i] = arrayNumeros[i+1];
        }
        arrayNumeros = Arrays.copyOf(arrayNumeros,arrayNumeros.length-1);
    }

    public void getArrayNumeros() {
        System.out.println(Arrays.toString(arrayNumeros));
    }

    public void setArrayNumeros(Integer[] arrayNumeros) {
        this.arrayNumeros = arrayNumeros;
    }
}
