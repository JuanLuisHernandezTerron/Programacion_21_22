package U6.T1.Actividad8;

import java.util.Comparator;

public class compararNombres implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String t1 = (String) o1;
        String t2 = (String) o2;
        return -t1.compareTo(t2);
    }
}
