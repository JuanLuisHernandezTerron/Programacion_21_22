package U5.EjerciciosRepaso.HerenciasInterfaces2021;

import java.util.Comparator;

public class ordenarParticipantes implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        participante t1 = (participante) o1;
        participante t2 = (participante) o2;
        if (t1.getEdad() < t2.getEdad()){
            return 1;
        }else if(t1.getEdad() > t2.getEdad()){
            return -1;
        }
        return 0;
    }
}
