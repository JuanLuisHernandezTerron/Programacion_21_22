package U7.U6U7_Entregable;

import java.util.Comparator;

public class ordenarSimbolo implements Comparator<divisa> {
    @Override
    public int compare(divisa divisa, divisa t1) {
        return divisa.getSimmboloDivisa().compareTo(t1.getSimmboloDivisa());
    }
}
