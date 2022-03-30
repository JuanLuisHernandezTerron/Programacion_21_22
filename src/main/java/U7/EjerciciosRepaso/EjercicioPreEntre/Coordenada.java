package U7.EjerciciosRepaso.EjercicioPreEntre;

public class Coordenada {
    private int latitud;
    private int logintud;

    public Coordenada(int latitud, int logintud) {
        setLatitud(latitud);
        setLogintud(logintud);
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLogintud() {
        return logintud;
    }

    public void setLogintud(int logintud) {
        this.logintud = logintud;
    }
}
