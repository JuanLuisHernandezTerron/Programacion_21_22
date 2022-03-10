package U7.T2;

import java.util.*;

/* Diseñar un método que devuelva la diferencia de dos conjuntos (elementos que pertenecen al primero,
pero no al segundo). Con el prototipo: Set diferencia (Set conjunto1, Set conjunto2)*/
public class actividad11 {
    public static void main(String[] args) {
        Set <String> conjunto1 = new TreeSet<>();
        Set <String> conjunto2= new TreeSet<>();
        conjunto1.add("Pedro");
        conjunto1.add("Mario");
        conjunto1.add("Jose");
        conjunto1.add("Maria");
        conjunto1.add("Oscar");
        conjunto2.add("Marcos");
        conjunto2.add("Mario");
        conjunto2.add("Jose");
        conjunto2.add("Alfonso");
        conjunto2.add("Antonio");
        conjunto2.add("Maria");
        System.out.println(diferencia(conjunto1,conjunto2));
    }

    private static Set diferencia(Set<String> conjunto1, Set<String> conjunto2) {
        List<String> listAUX = new ArrayList<>(conjunto1);
        listAUX.addAll(conjunto2);
        Set <String> setAUX = new HashSet<>();
        int contador = 0;
        for (int i = 0; i < listAUX.size(); i++) {
            contador =0;
            for (int j = 0; j < listAUX.size(); j++) {
                if (listAUX.get(i).equalsIgnoreCase(listAUX.get(j))){
                    contador++;
                }
            }
            if (contador <=1){
                setAUX.add(listAUX.get(i));
            }
        }
        return setAUX;
    }
}
