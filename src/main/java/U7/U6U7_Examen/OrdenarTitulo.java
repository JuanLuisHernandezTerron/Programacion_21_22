package U7.U6U7_Examen;

import java.util.Comparator;

public class OrdenarTitulo implements Comparator<pelicula> {
    @Override
    public int compare(pelicula pelicula, pelicula t1) {
        return -pelicula.getTitulo().compareTo(t1.getTitulo());
    }
}
