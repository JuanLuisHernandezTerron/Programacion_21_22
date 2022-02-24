package U5.U4U5_Entregable;

import java.util.Date;

public class Libro extends multimedia{
    private String autor;
    private String editorial;
    private String codigoISBN;
    private int numeroPaginas;

    public Libro(String titulo, int ano_publicacion,String autor,String editorial,String codigoISBN,int numeroPaginas){
        super(titulo, ano_publicacion);
        this.autor = autor;
        this.editorial = editorial;
        this.codigoISBN = codigoISBN;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void dar_por_finalizado() {
        System.out.println("Se da por finalizado el libro "+this.getTitulo());
    }

    @Override
    public String toString() {
        return "Libro{" +
                super.toString()+
                "autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", codigoISBN='" + codigoISBN + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}'+"\n";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


}
