package U8.T1.ejercicioRepaso.Entregable1920Modificacion.parte2;

import java.util.ArrayList;

public class formula1 {
    private String nombreEscuderia;
    private String PaisSede;
    private String patrocinadorPrincipal;
    private int numeroPilotos;
    private static ArrayList<formula1> arrayF1 = new ArrayList<>();

    public formula1(String nombreEscuderia, String paisSede, String patrocinadorPrincipal, int numeroPilotos) {
        this.nombreEscuderia = nombreEscuderia;
        this.PaisSede = paisSede;
        this.patrocinadorPrincipal = patrocinadorPrincipal;
        this.numeroPilotos = numeroPilotos;
        arrayF1.add(this);
    }

    public String getNombreEscuderia() {
        return nombreEscuderia;
    }

    public void setNombreEscuderia(String nombreEscuderia) {
        this.nombreEscuderia = nombreEscuderia;
    }

    public String getPaisSede() {
        return PaisSede;
    }

    public void setPaisSede(String paisSede) {
        PaisSede = paisSede;
    }

    public String getPatrocinadorPrincipal() {
        return patrocinadorPrincipal;
    }

    public void setPatrocinadorPrincipal(String patrocinadorPrincipal) {
        this.patrocinadorPrincipal = patrocinadorPrincipal;
    }

    public int getNumeroPilotos() {
        return numeroPilotos;
    }

    public void setNumeroPilotos(int numeroPilotos) {
        this.numeroPilotos = numeroPilotos;
    }

    public static ArrayList<formula1> getArrayF1() {
        return arrayF1;
    }

    public static void setArrayF1(ArrayList<formula1> arrayF1) {
        formula1.arrayF1 = arrayF1;
    }

    @Override
    public String toString() {
        return "formula1{" +
                "nombreEscuderia='" + nombreEscuderia + '\'' +
                ", PaisSede='" + PaisSede + '\'' +
                ", patrocinadorPrincipal='" + patrocinadorPrincipal + '\'' +
                ", numeroPilotos=" + numeroPilotos +
                '}';
    }
}
