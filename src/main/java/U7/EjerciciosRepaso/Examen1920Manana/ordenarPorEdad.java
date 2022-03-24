package U7.EjerciciosRepaso.Examen1920Manana;

import java.util.Comparator;

public class ordenarPorEdad implements Comparator<perro> {
    @Override
    public int compare(perro o1, perro o2) {
        if (o1.getEdad() > o2.getEdad()){
            return 1;
        }else if (o1.getEdad() < o2.getEdad()){
            return -1;
        }
        return 0;
    }
}
