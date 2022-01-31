package U4.ejerciciosRepaso.Entregable21Tarde;

public class enemigo {

    private int contadorEnemigo;
    private tipoEnemigo enemigoNombre;

    private int puntosVida;

    private int puntosDano;
    public enemigo(tipoEnemigo enemigoNombre){
        this.enemigoNombre = enemigoNombre;
        this.puntosVida = 100;
        this.puntosDano = 70;
    }
    public enum tipoEnemigo{
        BUZZBOMBER,
        CRABMEAT,
        COCONOUTS,
        CHOPPER,
        MOTOBUG;

    }
    public void getInformacionEnemigo(){
        System.out.println("La vida del enemigo "+this.enemigoNombre+" es "+this.puntosVida + " y sus puntos de daño es" + this.puntosDano);
    }
    public void restarVidaEnemigoPatada(personaje personaje1){
        if (getPuntosVida() > 0){
            setPuntosVida(this.puntosVida - personaje1.getPuntosPatada());
            System.out.println("Ha recibido"+personaje1.getPuntosPatada()+" daño");
            System.out.println("La vida del enemigo es: "+getPuntosVida());
        }else{
            System.out.println("El enemigo está muerto, elimínelo por favor");
        }
    }

    public void restarVidaEnemigoPuno(personaje personaje1){
        if (getPuntosVida() > 0){
            setPuntosVida(this.puntosVida - personaje1.getPuntosPunetazo());
            System.out.println("Ha recibido"+personaje1.getPuntosPunetazo()+" daño");
            System.out.println("La vida del enemigo es: "+getPuntosVida());
        }else{
            System.out.println("El enemigo está muerto, elimínelo por favor");
        }
    }

    public tipoEnemigo getEnemigoNombre() {
        return enemigoNombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
}
