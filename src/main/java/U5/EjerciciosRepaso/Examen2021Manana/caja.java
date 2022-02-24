package U5.EjerciciosRepaso.Examen2021Manana;

import java.util.Arrays;

public class caja {
    private prenda [] arrayPrendas = new prenda[0];
    private int contadorPrendaArray;
    private int id_caja;
    private static int pesoCaja=0;

    public void introducirPrendaCaja(prenda prendaAUX){
        if (contadorPrendaArray <=5) {
            arrayPrendas= Arrays.copyOf(arrayPrendas,arrayPrendas.length+1);
            arrayPrendas[contadorPrendaArray++]=prendaAUX;
        }
        setPesoCaja(getPesoCaja()+prendaAUX.getPeso());
    }

    public void eliminarCaja(prenda prendaAUX){
        prenda [] PrendaArrayAUX = new prenda[0];

        for (int i = 0; i < arrayPrendas.length; i++) {
            if (arrayPrendas[i] != prendaAUX){
                PrendaArrayAUX = Arrays.copyOf(PrendaArrayAUX,PrendaArrayAUX.length+1);
                PrendaArrayAUX[PrendaArrayAUX.length-1] = arrayPrendas[i];
            }
        }
        arrayPrendas = Arrays.copyOf(PrendaArrayAUX,PrendaArrayAUX.length);
        for (int i = 0; i < PrendaArrayAUX.length; i++) {
            arrayPrendas[i] = PrendaArrayAUX[i];
        }
    }

    @Override
    public String toString() {
        return "caja{" +
                "arrayPrendas=" + Arrays.toString(arrayPrendas) +
                ", contadorPrendaArray=" + contadorPrendaArray +
                '}';
    }
    public static void setPesoCaja(int pesoCaja) {
        caja.pesoCaja = pesoCaja;
    }

    public void setId_caja(int id_caja) {
        this.id_caja = id_caja;
    }

    public int getId_caja() {
        return id_caja;
    }

    public int getPesoCaja() {
        return pesoCaja;
    }
}
