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

    public tipoEnemigo getEnemigoNombre() {
        return enemigoNombre;
    }
}
