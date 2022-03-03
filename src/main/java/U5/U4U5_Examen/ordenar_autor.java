package U5.U4U5_Examen;

import java.util.Comparator;

public class ordenar_autor implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        agrupacionOficial agrupa1 = (agrupacionOficial) o;
        agrupacionOficial agrupa2 = (agrupacionOficial) t1;
        return agrupa1.getAutor().compareTo(agrupa2.getAutor());
    }
}
