package U7.T2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* Escribir el método incluido(), que devuelve true si todos los elementos del primer conjunto pertenecen
al segundo y false si hay algún elemento del primero que no pertenezca al segundo. Su prototipo es:*/
public class ejercicio12 {
    public static void main(String[] args) {
        List <Integer> conjuntos1 = new ArrayList<>();
        List <Integer> conjuntos2 = new ArrayList<>();

        conjuntos1.add(2);
        conjuntos1.add(3);
        conjuntos1.add(4);
        conjuntos1.add(5);
        conjuntos1.add(6);

        conjuntos2.add(2);
        conjuntos2.add(3);
        conjuntos2.add(4);
        conjuntos2.add(5);
        conjuntos2.add(6);
        System.out.println(incluido(conjuntos1,conjuntos2));
    }

    private static boolean incluido(List<Integer> conjuntos1, List<Integer> conjuntos2) {
        List <Integer> listaAUX = new ArrayList<>(conjuntos1);
        listaAUX.addAll(conjuntos2);
        boolean es_incluido =true;
        int contadorAUX= listaAUX.size()/2;
        for (int i = 0; i < listaAUX.size()/2; i++) {
            for (int j = listaAUX.size()/2; j < listaAUX.size(); j++) {
                if (!listaAUX.get(i++).equals(listaAUX.get(j))){
                    es_incluido = false;
                    break;
                }
            }
        }
        return es_incluido;
    }
}
