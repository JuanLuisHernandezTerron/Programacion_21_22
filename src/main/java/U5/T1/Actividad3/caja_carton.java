package U5.T1.Actividad3;

public class caja_carton extends caja{

    private double pesoCaja = getVolumen()*0.8;
    private int coste;
    public caja_carton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, unidad.CENTIMETROS);
    }

    public double getPesoCaja() {
        return pesoCaja;
    }

    public void setPesoCaja(double pesoCaja) {
        this.pesoCaja = pesoCaja;
    }

    public void sumarCosteCarton(){

    }

}
