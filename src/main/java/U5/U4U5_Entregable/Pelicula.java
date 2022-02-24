package U5.U4U5_Entregable;

import java.util.Date;

public class Pelicula extends multimedia implements Reproducible{
    private String Director;
    private int duracion;
    private String productora;
    private String pais;

    public Pelicula(String titulo, int ano_publicacion, String director, int duracion, String productora, String pais) {
        super(titulo, ano_publicacion);
        this.Director=director;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
    }

    @Override
    public void dar_por_finalizado() {
        System.out.println("Ha sido finalizado la pelicula"+this.getTitulo());
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo la pelicula "+this.getTitulo());
    }

    @Override
    public void pause() {
        System.out.println("Pausando la pelicula "+this.getTitulo());
    }

    @Override
    public void stop() {
        System.out.println("Parando la pelicula "+this.getTitulo());
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                super.toString()+
                "Director='" + Director + '\'' +
                ", duracion=" + duracion +
                ", productora='" + productora + '\'' +
                ", pais='" + pais + '\'' +
                '}'+"\n";
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
