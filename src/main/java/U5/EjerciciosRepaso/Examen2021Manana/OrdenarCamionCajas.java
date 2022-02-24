package U5.EjerciciosRepaso.Examen2021Manana;

import java.util.Comparator;

public class OrdenarCamionCajas implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        camionCaja camion1 = (camionCaja) o1;
        camionCaja camion2 = (camionCaja) o2;
        if (camion1.getContadorCajas() < camion2.getContadorCajas()) {
            return -1;
        }else if(camion1.getContadorCajas() > camion2.getContadorCajas()){
            return 1;
        }
        return 0;
    }
}
