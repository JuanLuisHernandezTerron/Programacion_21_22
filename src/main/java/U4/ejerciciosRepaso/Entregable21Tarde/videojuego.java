package U4.ejerciciosRepaso.Entregable21Tarde;

import java.time.LocalDateTime;

public class videojuego {
    private personaje nombrePersonaje;
    private personaje.tipopersonaje nombrePersonaje2;
    private escenario nombreEscenario;
    private static String ipVideojuego = "192.168.1."+(Math.round(0+Math.random()*254));
    private LocalDateTime horaFecha;

    public videojuego(personaje nombrePersonaje, escenario nombreEscenario) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombreEscenario = nombreEscenario;
        this.horaFecha = LocalDateTime.now();
    }

    public videojuego() {
        this.nombrePersonaje2 = personaje.tipopersonaje.SONIC;
        this.horaFecha = LocalDateTime.now();
        generarDefault();
    }
    public void generarDefault(){
        enemigo.tipoEnemigo [] enemigoPrueba = new enemigo.tipoEnemigo[]{enemigo.tipoEnemigo.BUZZBOMBER, enemigo.tipoEnemigo.COCONOUTS};
        escenario escenarioDefault = new escenario(enemigoPrueba);
    }

    public void inforVideojuego(){
        System.out.println("La informacion del videojuego es: ");
        System.out.println("La partida ha sido iniciada a las: "+getHoraFecha());
        System.out.println();
        System.out.println("El estado del personaje es el siguiente: ");
        getNombrePersonaje().getInformacionPersonaje();
        System.out.println();
        System.out.println("La informacion del escenario es: ");
        getNombreEscenario().getInformacionEscenario();
    }

    public LocalDateTime getHoraFecha() {
        return horaFecha;
    }

    public personaje getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(personaje nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public escenario getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(escenario nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public static String getIpVideojuego() {
        return "La ip del videojuego es "+ipVideojuego;
    }

    public static void setIpVideojuego(String ipVideojuego) {
        videojuego.ipVideojuego = "192.168.1."+(Math.round(0+Math.random()*254));
    }
}
