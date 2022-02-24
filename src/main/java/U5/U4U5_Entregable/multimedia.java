package U5.U4U5_Entregable;
import java.util.Date;

public abstract class multimedia implements Comparable{
    private int id_multimedia = 0;
    private String titulo;
    private int ano_publicacion;

    private static int contadorMultimedia = 0;
    public multimedia(String titulo, int ano_publicacion) {
        this.titulo = titulo;
        this.ano_publicacion = ano_publicacion;
        contadorMultimedia++;
        setId_multimedia(contadorMultimedia);
    }
    public void setId_multimedia(int contadorMultimedia) {
        this.id_multimedia = contadorMultimedia;
    }
    public abstract void dar_por_finalizado();

    public String getTitulo() {
        return titulo;
    }

    public int getId_multimedia() {
        return id_multimedia;
    }

    @Override
    public String toString() {
        return
                "id_multimedia=" + id_multimedia +
                ", titulo='" + titulo + '\'' +
                ", ano_publicacion=" + ano_publicacion +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        multimedia multi1 = (multimedia) o;
        if (this.id_multimedia > multi1.getId_multimedia()){
            return 1;
        }else if(this.id_multimedia < multi1.getId_multimedia()){
            return -1;
        }
            return 0;
    }

    public int getAno_publicacion() {
        return ano_publicacion;
    }

    public static int getContadorMultimedia() {
        return contadorMultimedia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno_publicacion(int ano_publicacion) {
        this.ano_publicacion = ano_publicacion;
    }

    public static void setContadorMultimedia(int contadorMultimedia) {
        multimedia.contadorMultimedia = contadorMultimedia;
    }
}
