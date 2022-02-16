package U5.T2.Actividad3;

import java.util.Comparator;

public class compararTriangulosColores implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        triangulo trian1 = (triangulo) o;
        triangulo trian2 = (triangulo) t1;
        return trian1.getColor().toString().compareTo(trian2.getColor().toString()); //Se pone toString cuando es ordenado por un enum,
        // se pasa a string y luego lo ordena.
    }
}
