package U7.EjerciciosRepaso.Entregable21Tarde;

import java.util.Comparator;

public class ordenarApellidos implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        alumno alumno1 = (alumno) o1;
        alumno alumno2 = (alumno) o2;
        return alumno1.getApellidos().compareTo(alumno2.getApellidos());
    }
}
