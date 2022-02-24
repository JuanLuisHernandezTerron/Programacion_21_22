package U5.EjerciciosRepaso.Examen2021Manana;

import java.util.Arrays;

public class camionCaja extends Vehiculo{
    caja [] arrayCaja = new caja[0];
    private int contadorCajas=0;

    public camionCaja(String matricula, int cargaMax, conductor conductor) {
        super(matricula, cargaMax, conductor);
    }

    public void introducirCaja(caja cajaAUX){
        arrayCaja = Arrays.copyOf(arrayCaja,arrayCaja.length+1);
        arrayCaja[contadorCajas++] = cajaAUX;

    }

    public void eliminarCaja(caja cajaAUX){
        caja [] cajaArrayAUX = new caja[0];
        contadorCajas --;
        for (int i = 0; i < arrayCaja.length; i++) {
            if (arrayCaja[i] != cajaAUX){
                cajaArrayAUX = Arrays.copyOf(arrayCaja,arrayCaja.length+1);
                cajaArrayAUX[cajaArrayAUX.length-1] = arrayCaja[i];
            }
        }
        arrayCaja = Arrays.copyOf(cajaArrayAUX,cajaArrayAUX.length);
        for (int i = 0; i < cajaArrayAUX.length; i++) {
            arrayCaja[i] = cajaArrayAUX[i];
        }
    }

    @Override
    public void descargar(int cajasDescargar, int prendasDescargar) {
        System.out.println("Descargando "+cajasDescargar+" Y "+prendasDescargar+ " prendas");
    }

    @Override
    public String toString() {
        return "camionCaja{" +
                "arrayCaja=" + Arrays.toString(arrayCaja) +
                '}';
    }

    public int getContadorCajas() {
        return contadorCajas;
    }
}
