package U4.ejerciciosRepaso.Entregable21Tarde;

import static U4.ejerciciosRepaso.Entregable21Tarde.enemigo.*;

public class main {
    public static void main(String[] args) {
        enemigo enemi1 = new enemigo(tipoEnemigo.BUZZBOMBER);
        enemigo enemi2 = new enemigo(tipoEnemigo.CHOPPER);
        enemigo.tipoEnemigo [] enemigoPrueba = new tipoEnemigo[]{enemi1.getEnemigoNombre(),enemi2.getEnemigoNombre()};
        escenario escenario1 = new escenario(enemigoPrueba);
        escenario1.getArrayTiposEnemigos();
        System.out.println();

        escenario1.generarEnemigos();
        escenario1.generarEnemigos();
        escenario1.generarEnemigos();
        escenario1.getArrayInfoEnemigo();
        System.out.println();
        escenario1.eliminarEnemigos(2);
        escenario1.getArrayInfoEnemigo();
    }

}
