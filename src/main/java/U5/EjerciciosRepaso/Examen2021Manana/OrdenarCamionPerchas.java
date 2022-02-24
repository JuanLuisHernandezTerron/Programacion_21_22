package U5.EjerciciosRepaso.Examen2021Manana;

import java.util.Comparator;

public class OrdenarCamionPerchas implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        camionPerchas camion1 = (camionPerchas) o1;
        camionPerchas camion2 = (camionPerchas) o2;
        if (camion1.getContadorPrendasColgadas() > camion2.getContadorPrendasColgadas()){
            return -1;
        }else if(camion1.getContadorPrendasColgadas() < camion2.getContadorPrendasColgadas()){
            return 1;
        }
        return 0;
    }
}
