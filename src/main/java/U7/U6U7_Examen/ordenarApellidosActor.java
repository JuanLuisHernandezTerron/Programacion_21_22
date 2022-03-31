package U7.U6U7_Examen;

import java.util.Comparator;

public class ordenarApellidosActor implements Comparator<actor> {
    @Override
    public int compare(actor actor, actor t1) {
        return actor.getApellidos().compareTo(t1.getApellidos());
    }
}
