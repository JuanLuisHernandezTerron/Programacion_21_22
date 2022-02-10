package U5.T1.Actividad4;

import java.util.Comparator;

public class comparadorPrecioFinal implements Comparator {

    @Override
    public int compare(Object Lavadora1, Object Lavadora2) {
        lavadora lava1 = (lavadora) Lavadora1;
        lavadora lava2 = (lavadora) Lavadora2;
            if (lava1.getPrecioFinalLavadora() > lava2.getPrecioFinalLavadora()){
                return -1;
            }else if(lava1.getPrecioFinalLavadora() < lava2.getPrecioFinalLavadora()){
                return 1;
            }
        return 0;
    }
}
