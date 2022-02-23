package U5.EjerciciosRepaso.Examen2021Manana;

import java.util.Arrays;

public class caja {
    private prenda [] arrayPrendas = new prenda[0];
    private int contadorPrendaArray;

    public void introducirPrendaCaja(prenda prendaAUX){
        if (contadorPrendaArray <=5) {
            arrayPrendas= Arrays.copyOf(arrayPrendas,arrayPrendas.length+1);
            arrayPrendas[contadorPrendaArray++]=prendaAUX;
        }
    }
}
