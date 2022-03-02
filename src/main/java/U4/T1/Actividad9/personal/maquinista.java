package U4.T1.Actividad9.personal;

import java.io.Serializable;

public class maquinista implements Serializable {
    private String nombreCompleto;
    private String dni;
    private int sueldo;
    private String rango;

    public maquinista(String nombreCompleto, String dni, int sueldo, String rango){
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "maquinista{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", rango='" + rango + '\'' +
                '}';
    }
}
