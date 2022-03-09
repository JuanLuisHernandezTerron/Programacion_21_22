package U7.T1.Actividad5;

import java.util.Comparator;

public class ordenarArrayDesc implements Comparator<Integer> {
    @Override
    public int compare(Integer integerAUX1, Integer integerAUX2) {
        if (integerAUX1 < integerAUX2){
            return 1;
        }else if(integerAUX1 > integerAUX2){
            return -1;
        }
        return 0;
    }
}
