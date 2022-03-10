package U7.T1;

import java.util.Comparator;

public class ordenacionPorOrdenAlfabetico implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        String str1 = (String) o;
        String str2 = (String) t1;
        return str1.compareTo(str2);
    }
}
