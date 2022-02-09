package U5.T1.Actividad3;

public class caja_carton extends caja{

    private double pesoCaja = getVolumen()*0.8;
    private int etiqueta;

    private static double superficieTotal = 0;

    public caja_carton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, unidad.CENTIMETROS);
    }

    public double getPesoCaja() {
        return pesoCaja;
    }

    public void setPesoCaja(double pesoCaja) {
        this.pesoCaja = pesoCaja;
    }

    public void superficiTotalCarton(){
        superficieTotal += (this.getAncho()*2)+(this.getAlto()*2)+(this.getFondo()*2);
    }

    public int getEtiquetaCarton() {
        return etiqueta;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String toString(){
        return "La altura de la caja es "+getAlto()+"\n El ancho es: "+getAncho()+"\n El fondo de la caja es: "+getFondo()+"\n Unidad en que se mide es: "+getUnidades()+"\n Y su etiqueta es: "+this.etiqueta;
    }

    public double getSuperficieTotal() {
        return superficieTotal;
    }
}
