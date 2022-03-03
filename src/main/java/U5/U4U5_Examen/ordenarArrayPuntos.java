package U5.U4U5_Examen;

import java.util.Comparator;

public class ordenarArrayPuntos implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        agrupacionOficial agru1 = (agrupacionOficial) o;
        agrupacionOficial agru2 = (agrupacionOficial) t1;

        if (agru1.getPuntosObtenidos() < agru2.getPuntosObtenidos()){
            return -1;
        }else if (agru1.getPuntosObtenidos() > agru2.getPuntosObtenidos()){
            return 1;
        }
        return 0;
    }
}
