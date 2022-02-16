package U5.T3.Actividad1;
import java.util.Comparator;

public class numeroEntero implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Integer entero = (Integer) o;
        Integer entero1 = (Integer) t1;

        return -entero.compareTo(entero1);
    }
}
