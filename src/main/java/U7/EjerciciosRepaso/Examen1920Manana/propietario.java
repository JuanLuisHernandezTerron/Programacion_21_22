package U7.EjerciciosRepaso.Examen1920Manana;

import java.io.Serializable;

public class propietario implements Serializable {
    private String nombre;
    private String apellidos;
    private static int contador = 0;
    private int numeroSocio = 0;
    private String paisOrigen;

    public propietario(String nombre, String apellidos, String paisOrigen) {
        setNombre(nombre);
        setApellidos(apellidos);
        this.numeroSocio = contador++;
        setPaisOrigen(paisOrigen);
    }

    @Override
    public String toString() {
        return "propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroSocio=" + numeroSocio +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getNumeroSocio() {
        return numeroSocio;
    }


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
