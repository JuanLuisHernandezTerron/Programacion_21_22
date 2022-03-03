package U5.U4U5_Examen;

public abstract class agrupacion {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetras;
    private String tipo;
    private static int contadorAgrupaciones=0;

    public agrupacion(String nombre, String autor, String autorMusica, String autorLetras,String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
        setContadorAgrupaciones();
    }

    public abstract void cantar_la_presentacion();
    public abstract void hacer_tipo();

    @Override
    public String toString() {
        return "agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetras() {
        return autorLetras;
    }

    public void setAutorLetras(String autorLetras) {
        this.autorLetras = autorLetras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static int getContadorAgrupaciones() {
        return contadorAgrupaciones;
    }

    public static void setContadorAgrupaciones() {
        agrupacion.contadorAgrupaciones ++;
    }
}
