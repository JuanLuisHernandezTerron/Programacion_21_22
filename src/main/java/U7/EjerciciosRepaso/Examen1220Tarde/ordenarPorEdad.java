package U7.EjerciciosRepaso.Examen1220Tarde;

import java.io.Serializable;
import java.util.Comparator;

public class ordenarPorEdad implements Comparator<paciente>, Serializable {
    @Override
    public int compare(paciente o1, paciente o2) {
        if (o1.getEdad() > o2.getEdad()){
            return 1;
        }else if(o1.getEdad() < o2.getEdad()){
            return -1;
        }
        return 0;
    }
}
