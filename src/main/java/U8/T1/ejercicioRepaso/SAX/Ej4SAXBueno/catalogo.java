package U8.T1.ejercicioRepaso.SAX.Ej4SAXBueno;

public class catalogo {
    private String titulo;
    private String artista;
    private String origen;
    private double precio;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "catalogo{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", origen='" + origen + '\'' +
                ", precio=" + precio +
                ", ano=" + ano +
                '}';
    }
}
