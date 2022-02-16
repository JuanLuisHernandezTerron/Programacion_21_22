package U5.T2.Actividad2;

import java.util.Comparator;

public class comparadorClientesEdad implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        cliente cliente = (cliente) o;
        cliente cliente1 = (cliente) t1;

        if (cliente.getEdad() < cliente1.getEdad()){
            return 1;
        }else if(cliente.getEdad() > cliente1.getEdad()){
            return -1;
        }
        return 0;
    }
}
