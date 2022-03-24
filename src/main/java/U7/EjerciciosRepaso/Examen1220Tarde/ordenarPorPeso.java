package U7.EjerciciosRepaso.Examen1220Tarde;

import java.io.Serializable;
import java.util.Comparator;

public class ordenarPorPeso implements Comparator<paciente>, Serializable {
    @Override
    public int compare(paciente o1, paciente o2) {
        if (o1.getPeso()>o2.getPeso()){
            return 1;
        }else if(o1.getPeso() < o2.getPeso()){
            return -1;
        }
        return 0;
    }
}
