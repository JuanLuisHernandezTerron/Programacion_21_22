package U7.T2;

import java.util.*;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Set <String> conjunto1 = new TreeSet<>();
        Set <String> conjunto2 = new TreeSet<>();

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
        System.out.println(interseccion(conjunto1,conjunto2));

    }

    private static Set interseccion(Set<String> conjunto1, Set<String> conjunto2) {
        List <String> listaAUX = new ArrayList<>(conjunto1);
        listaAUX.addAll(conjunto2);
        Set <String> setAUX = new TreeSet<>();
        int contadorAUX = 0;
        for (int i = 0; i < listaAUX.size(); i++) {
            contadorAUX = 0;
            for (int j = 0; j < listaAUX.size(); j++) {
                if (listaAUX.get(i).equalsIgnoreCase(listaAUX.get(j))){
                    contadorAUX++;
                    if (contadorAUX >= 2){
                        setAUX.add(listaAUX.get(i));
                    }
                }
            }
        }
        return setAUX;
    }
}
