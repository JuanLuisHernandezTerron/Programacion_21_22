package U5.U4U5_Entregable;

import java.util.Comparator;

public class OrdenarAno implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        multimedia multi1 = (multimedia) o;
        multimedia multi2 = (multimedia) t1;
        if (multi1.getAno_publicacion() > multi2.getAno_publicacion()){
            return 1;
        }else if(multi1.getAno_publicacion() < multi2.getAno_publicacion()){
            return -1;
        }
        return 0;
    }
}
