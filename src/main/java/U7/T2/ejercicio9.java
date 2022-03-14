package U7.T2;

import java.util.*;

/*Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto con todos los
elementos que pertenezcan, al menos, a uno de los dos conjuntos. Su prototipo es:
Set union (Set conjunto1, Set conjunto2)*/
public class ejercicio9 {
    public static void main(String[] args) {
        Set <String> conjunto1 = new TreeSet<>();
        Set <String> conjunto2 = new TreeSet<>();
        conjunto1.add("Pedro");
        conjunto1.add("coke");
        conjunto1.add("mario");
        conjunto1.add("Joseph");
        conjunto1.add("Sergio");
        conjunto2.add("Andres");
        conjunto2.add("Ale");
        conjunto2.add("juanjo");
        System.out.println(union(conjunto1,conjunto2));
    }

    private static Set union(Set<String> conjunto1, Set<String> conjunto2) {
        List <String> listaAUX = new ArrayList<>(conjunto1);
        listaAUX.addAll(conjunto2);
        Set <String> union = new HashSet<>(listaAUX);
        return union;
    }
}
