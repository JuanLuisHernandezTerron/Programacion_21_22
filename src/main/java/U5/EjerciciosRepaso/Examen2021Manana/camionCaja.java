package U5.EjerciciosRepaso.Examen2021Manana;

import java.util.Arrays;

public class camionCaja extends Vehiculo{
    caja [] arrayCaja = new caja[0];
    private static int contadorCajas=0;

    public camionCaja(String matricula, int cargaMax, conductor conductor) {
        super(matricula, cargaMax, conductor);
    }

    public void introducirCaja(caja cajaAUX){
        arrayCaja = Arrays.copyOf(arrayCaja,arrayCaja.length+1);
        arrayCaja[contadorCajas++] = cajaAUX;
    }

    public void eliminarCaja(caja cajaAUX){
        for (int i = 0; i < arrayCaja.length-1; i++) {
            if (arrayCaja[i] == cajaAUX){
                while (i != arrayCaja.length){
                    arrayCaja[i++] = arrayCaja[i+1];
                }
                arrayCaja = Arrays.copyOf(arrayCaja,arrayCaja.length-1);
            }
        }
    }
}
