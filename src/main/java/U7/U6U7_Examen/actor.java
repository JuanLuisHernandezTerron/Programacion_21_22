package U7.U6U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class actor implements Serializable {
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private static int contador =0;
    private int id_actor;

    public actor(String nombre, String apellidos, String nacionalidad) {
        setNombre(nombre);
        setApellidos(apellidos);
        setNacionalidad(nacionalidad);
        this.id_actor = contador++;
    }

    @Override
    public String toString() {
        return "actor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", id_actor=" + id_actor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        actor actor = (actor) o;
        return Objects.equals(nombre, actor.nombre) && Objects.equals(apellidos, actor.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        actor.contador = contador;
    }
}
