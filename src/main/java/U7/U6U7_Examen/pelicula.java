package U7.U6U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class pelicula implements Serializable {
    private String titulo;
    private String pais;
    private String genero;
    private String director;
    private static int contador = 0;
    private int id_pelicula;

    public pelicula(String titulo, String pais, String genero, String director) {
        setTitulo(titulo);
        setPais(pais);
        setGenero(genero);
        setDirector(director);
        this.id_pelicula=contador++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pelicula pelicula = (pelicula) o;
        return Objects.equals(titulo, pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public String toString() {
        return "pelicula{" +
                "titulo='" + titulo + '\'' +
                ", pais='" + pais + '\'' +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                ", id_pelicula=" + id_pelicula +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
