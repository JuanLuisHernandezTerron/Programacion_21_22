package U5.T2.Actividad1;
import java.util.Arrays;

public class pilaTabla implements pila {

    private Integer [] arrayNumeros = new Integer[0];
    int contadorArray = 0;

    public pilaTabla(){
    }

    @Override
    public void apilar(Integer numero) {
        if (arrayNumeros.length <10) {
            arrayNumeros = Arrays.copyOf(arrayNumeros, arrayNumeros.length + 1);
            arrayNumeros[contadorArray++] = numero;
        }
    }

    @Override
    public void desaPilar() {
        if (arrayNumeros.length >= 1) {
            arrayNumeros = Arrays.copyOf(arrayNumeros, arrayNumeros.length - 1);
        }
    }

    @Override
    public String toString() {
        return "pilaTabla{" +
                "arrayNumeros=" + Arrays.toString(mostrarArrayReves()) +
                '}';
    }

    public Integer [] mostrarArrayReves(){
        int contadorArray = arrayNumeros.length-1;
        int contadorLugares = 0;
        Integer [] arrayAUX = new Integer[0];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
            arrayAUX[contadorLugares++] = arrayNumeros[contadorArray--];
        }
        return arrayAUX;
    }
}
