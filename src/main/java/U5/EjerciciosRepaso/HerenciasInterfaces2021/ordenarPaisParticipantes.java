package U5.EjerciciosRepaso.HerenciasInterfaces2021;

import java.util.Comparator;

public class ordenarPaisParticipantes implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        pais t1= (pais) o1;
        pais t2= (pais) o2;
        if (t1.getNumeroParticipantes() < t2.getNumeroParticipantes()){
            return 1;
        }else if(t1.getNumeroParticipantes() > t2.getNumeroParticipantes()){
            return -1;
        }
        return 0;
    }
}
