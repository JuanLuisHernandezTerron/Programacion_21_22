package U5.U4U5_Examen;

import java.util.Comparator;

public class ordenar_por_nombre implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        agrupacionOficial agrupa1 = (agrupacionOficial) o;
        agrupacionOficial agrupa2 = (agrupacionOficial) t1;
        return agrupa1.getNombre().compareTo(agrupa2.getNombre());
    }
}
