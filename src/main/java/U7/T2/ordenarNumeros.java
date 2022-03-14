package U7.T2;

import java.util.Comparator;

public class ordenarNumeros implements Comparator<Integer> {

    @Override
    public int compare(Integer t1, Integer t2) {
        if (t1 > t2){
            return 1;
        }else if (t1 < t2){
            return -1;
        }
        return 0;
    }
}
