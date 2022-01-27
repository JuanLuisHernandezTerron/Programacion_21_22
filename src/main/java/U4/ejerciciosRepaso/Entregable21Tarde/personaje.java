package U4.ejerciciosRepaso.Entregable21Tarde;

public class personaje {
    private tipopersonaje nombrePersonaje;
    private double velocidad;
    private int puntosPunetazo;

    private int puntosPatada;
    public personaje(tipopersonaje nombrePersonaje, double velocidad, int puntosPunetazo, int puntosPatada){
        this.nombrePersonaje = nombrePersonaje;
        this.velocidad = velocidad;
        this.puntosPunetazo = puntosPunetazo;
        this.puntosPatada = puntosPatada;
    }
    public personaje(){
        this.nombrePersonaje = tipopersonaje.SONIC;
        this.velocidad = 100.0;
        this.puntosPunetazo = 100;
        this.puntosPatada = 200;
    }

    public void getInformacionPersonaje(){
        System.out.println("El personaje es: "+this.nombrePersonaje);
        System.out.println("El personaje tiene de velocida: "+this.velocidad);
        System.out.println("El personaje tiene de puntos de puñetazo: "+this.puntosPunetazo);
        System.out.println("El personaje tiene de puntos de patada: "+this.puntosPatada);
    }



    public enum tipopersonaje{
        SONIC,
        TAILS,
        KNUCKLES
    }

    public void hacerDanoPatada(){

    }

    public void setPuntosPatada(int puntosPatada) {
        this.puntosPatada = puntosPatada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuntosPunetazo() {
        return puntosPunetazo;
    }

    public void setPuntosPunetazo(int puntosPunetazo) {
        this.puntosPunetazo = puntosPunetazo;
    }

    public int getPuntosPatada() {
        return puntosPatada;
    }
}
