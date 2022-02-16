package U5.T2.Actividad2;

import java.util.Comparator;

public class comparatorClientesDNI implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        cliente cliente = (cliente) o;
        cliente cliente2 = (cliente) t1;

        return cliente.getDni().compareTo(cliente2.getDni());
    }
}
