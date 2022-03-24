package U7.EjerciciosRepaso.Examen1920Manana;

import java.util.Comparator;

public class ordenarPesoPerro implements Comparator<perro> {

    @Override
    public int compare(perro o1, perro o2) {
        if (o1.getPesoPerro() > o2.getPesoPerro()){
            return 1;
        }else if (o1.getPesoPerro() < o2.getPesoPerro()){
            return -1;
        }
        return 0;
    }
}
