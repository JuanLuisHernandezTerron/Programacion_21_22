package U7.T4.Ejercicio1;

import java.io.Serializable;

public class persona implements Serializable {
    private String nombre;
    private String dni;
    private int edad;
    private double estatura;

    public persona(String nombre, String dni, int edad, double estatura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

}
