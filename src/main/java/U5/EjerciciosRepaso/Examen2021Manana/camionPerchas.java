package U5.EjerciciosRepaso.Examen2021Manana;

import java.util.Arrays;

public class camionPerchas extends Vehiculo{
    prenda [] arrayPrendasColgadas = new prenda[0];

    private int contadorPrendasColgadas = 0;

    public camionPerchas(String matricula, int cargaMax, conductor conductor) {
        super(matricula, cargaMax, conductor);
    }
    public void anadirPrendaColgada(prenda prendaAUX){
        arrayPrendasColgadas = Arrays.copyOf(arrayPrendasColgadas,arrayPrendasColgadas.length+1);
        arrayPrendasColgadas[contadorPrendasColgadas++] = prendaAUX;
    }

    public void eliminarPrendaColgada(prenda prendaAUX){
        prenda [] PrendaArrayAUX = new prenda[0];

        for (int i = 0; i < arrayPrendasColgadas.length; i++) {
            if (arrayPrendasColgadas[i] != prendaAUX){
                PrendaArrayAUX = Arrays.copyOf(PrendaArrayAUX,PrendaArrayAUX.length+1);
                PrendaArrayAUX[PrendaArrayAUX.length-1] = arrayPrendasColgadas[i];
            }
        }
        arrayPrendasColgadas = Arrays.copyOf(PrendaArrayAUX,PrendaArrayAUX.length);
        for (int i = 0; i < PrendaArrayAUX.length; i++) {
            arrayPrendasColgadas[i] = PrendaArrayAUX[i];
        }
    }

    @Override
    public void descargar(int cajasDescargar, int prendasDescargar) {
        System.out.println("Descargando "+prendasDescargar + " prendas");
    }

    public int getContadorPrendasColgadas() {
        return contadorPrendasColgadas;
    }
}
