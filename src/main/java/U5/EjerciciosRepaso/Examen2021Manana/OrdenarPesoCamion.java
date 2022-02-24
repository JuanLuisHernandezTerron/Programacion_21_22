package U5.EjerciciosRepaso.Examen2021Manana;

import java.util.Comparator;

public class OrdenarPesoCamion implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        caja caja1 = (caja) o1;
        caja caja2 = (caja) o2;
        if (caja1.getPesoCaja() < caja2.getPesoCaja()) {
            return -1;
        }else if(caja1.getPesoCaja() > caja2.getPesoCaja()){
            return 1;
        }
        return 0;
    }
}
