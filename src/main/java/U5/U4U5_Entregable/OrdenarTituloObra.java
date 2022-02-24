package U5.U4U5_Entregable;

import java.util.Comparator;

public class OrdenarTituloObra implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        multimedia m1 = (multimedia) o;
        multimedia m2 = (multimedia) t1;
        return m1.getTitulo().compareTo(m2.getTitulo());
    }
}
