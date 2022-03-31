package U7.EjerciciosRepaso.EjercicioPreEntre2;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class actor implements Serializable{
    private String nombre;
    private int edad;
    private String pais;
    private String fechaNacimiento;
    private static int contador = 0;
    private int id_actor;


    public actor(String nombre, int edad, String pais, String fechaNacimiento) {
        setNombre(nombre);
        setEdad(edad);
        setPais(pais);
        setFechaNacimiento(fechaNacimiento);
        this.id_actor = contador++;
    }

    @Override
    public String toString() {
        return "actor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", id_actor=" + id_actor +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
