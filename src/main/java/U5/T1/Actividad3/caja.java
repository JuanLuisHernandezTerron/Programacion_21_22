package U5.T1.Actividad3;

public class caja {
    private double ancho;
    private double alto;
    private double fondo;
    private unidad unidades;

    private String etiqueta;

    public caja(double ancho, double alto, double fondo, unidad unidades){
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidades = unidades;
    }

    public enum unidad{
        CENTIMETROS,
        METROS;
    }

    public double getVolumen(){
        return getAlto()*getAncho()*getFondo();
    }

    public String toString(){
        return "La altura de la caja es "+getAlto()+"\n El ancho es: "+getAncho()+"\n El fondo de la caja es: "+getFondo()+"\n Unidad en que se mide es: "+getUnidades();
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public unidad getUnidades() {
        return unidades;
    }

    public void setUnidades(unidad unidades) {
        this.unidades = unidades;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
}
