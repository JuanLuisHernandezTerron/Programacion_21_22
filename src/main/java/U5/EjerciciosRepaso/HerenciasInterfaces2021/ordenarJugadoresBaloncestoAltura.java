package U5.EjerciciosRepaso.HerenciasInterfaces2021;

import java.util.Comparator;

public class ordenarJugadoresBaloncestoAltura implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Baloncesista t1 = (Baloncesista) o1;
        Baloncesista t2 = (Baloncesista) o2;
        if (t1.getAltura() < t2.getAltura()){
            return 1;
        }else if(t1.getAltura() > t2.getAltura()){
            return -1;
        }
        return 0;
    }
}
