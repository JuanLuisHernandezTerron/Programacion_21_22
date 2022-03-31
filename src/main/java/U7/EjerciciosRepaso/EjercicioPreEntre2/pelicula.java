package U7.EjerciciosRepaso.EjercicioPreEntre2;

import java.io.Serializable;

public class pelicula implements Serializable {
    private String nombre;
    private Categorias categoriaPeli;
    private double duracion;
    private String paisRodaje;
    private static int contadorPeli = 0;
    private int id_pelicula;

    public pelicula(String nombre, Categorias categoriaPeli, double duracion, String paisRodaje) {
        setNombre(nombre);
        setCategoriaPeli(categoriaPeli);
        setDuracion(duracion);
        setPaisRodaje(paisRodaje);
        this.id_pelicula = contadorPeli++;
    }

    @Override
    public String toString() {
        return "pelicula{" +
                "nombre='" + nombre + '\'' +
                ", categoriaPeli=" + categoriaPeli +
                ", duracion=" + duracion +
                ", paisRodaje='" + paisRodaje + '\'' +
                ", id_pelicula=" + id_pelicula +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categorias getCategoriaPeli() {
        return categoriaPeli;
    }

    public void setCategoriaPeli(Categorias categoriaPeli) {
        this.categoriaPeli = categoriaPeli;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getPaisRodaje() {
        return paisRodaje;
    }

    public void setPaisRodaje(String paisRodaje) {
        this.paisRodaje = paisRodaje;
    }

    public enum Categorias{
        THRILLER,
        ACCION,
        AVENTURAS,
        COMEDIA,
        FICCION
    }
}
