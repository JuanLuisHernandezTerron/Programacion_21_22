package U4.ejerciciosRepaso.Entregable21Tarde;

import static U4.ejerciciosRepaso.Entregable21Tarde.enemigo.*;

public class main {
    public static void main(String[] args) {
        personaje personaje1 = new personaje(personaje.tipopersonaje.TAILS, 150.0,100,80);
        enemigo enemi1 = new enemigo(tipoEnemigo.BUZZBOMBER);
        enemigo enemi2 = new enemigo(tipoEnemigo.CHOPPER);
        enemigo.tipoEnemigo [] enemigoPrueba = new tipoEnemigo[]{enemi1.getEnemigoNombre(),enemi2.getEnemigoNombre()};
        escenario escenario1 = new escenario(enemigoPrueba);
        videojuego video1 = new videojuego(personaje1,escenario1);
        /////////////////////////////////////////////////////////////////
        videojuego videoDefault = new videojuego();
        enemigo enemigo3 = new enemigo(tipoEnemigo.CRABMEAT);
        enemigo enemigo4 = new enemigo(tipoEnemigo.MOTOBUG);
        enemigo enemigo5 = new enemigo(tipoEnemigo.COCONOUTS);
        enemigo enemigo6 = new enemigo(tipoEnemigo.BUZZBOMBER);
        enemigo.tipoEnemigo [] arraytipoEnemigos = new tipoEnemigo[] {enemigo3.getEnemigoNombre(), enemigo4.getEnemigoNombre(),enemigo5.getEnemigoNombre(),enemigo6.getEnemigoNombre()};
        escenario escenario2 = new escenario(arraytipoEnemigos);
        escenario2.generarEnemigos();
        escenario2.generarEnemigos();
        escenario2.generarEnemigos();
        escenario2.generarEnemigos();
        escenario2.generarEnemigos();
        videojuego video2 = new videojuego(personaje1,escenario2);
        video2.inforVideojuego();
        escenario2.eliminarEnemigos(2);
        video2.inforVideojuego();
        System.out.println();
        ////////////////////////////////////////////////////////////////
        System.out.println(videojuego.getIpVideojuego());
    }
}
