package U5.EjerciciosRepaso.Examen19_20;

import java.util.Comparator;

public class ordenarQuemarse implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        material mate1 = (material) o;
        material mate2 = (material) t1;

        if (mate1.getQuemarse() > mate2.getQuemarse()){
            return -1;
        }else if(mate1.getQuemarse() < mate2.getQuemarse()){
            return 1;
        }
        return 0;
    }
}
