package U8.JSON.T1;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;


public class main {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista(1, "Casilla", "RealMadrid", new String[]{"portero"});
        Futbolista f2 = new Futbolista(15, "SergioRamos", "RealMadrid", new String[]{"LateralDerecho", "MedioCentro"});
        Futbolista f3 = new Futbolista(3, "Pique", "FC Barcelona", new String[]{"Central"});
        Futbolista f4 = new Futbolista(5, "Puyol", "FC Barcelona", new String[]{"Central"});
        Futbolista f5 = new Futbolista(11, "Capdevila", "FC Barcelona", new String[]{"LateralIzq"});
        Futbolista f6 = new Futbolista(14, "Xabi Alonso", "RealMadrid", new String[]{"MedioCentroDef", "MedioCampo"});
        Futbolista f7 = new Futbolista(16, "Busquets", "FC Barcelona", new String[]{"MedioCentroDef"});
        Futbolista f8 = new Futbolista(8, "Xavi Hernandez", "FC Barcelona", new String[]{"MedioCentro"});
        Futbolista f9 = new Futbolista(18, "Pedro Rodriguez", "FC Barcelona", new String[]{"Extremo Izquierdo", "FalsoExtremo"});
        Futbolista f10 = new Futbolista(6, "Iniesta", "FC Barcelona", new String[]{"Extremo Derecho", "MedioCentrocampista"});
        Futbolista f11 = new Futbolista(7, "David Villa", "FC Barcelona", new String[]{"DelanteroCentro"});
        ArrayList<Futbolista> arrayFutbolista = new ArrayList<>();
        arrayFutbolista.add(f1);
        arrayFutbolista.add(f2);
        arrayFutbolista.add(f3);
        arrayFutbolista.add(f4);
        arrayFutbolista.add(f5);
        arrayFutbolista.add(f6);
        arrayFutbolista.add(f7);
        arrayFutbolista.add(f8);
        arrayFutbolista.add(f9);
        arrayFutbolista.add(f10);
        arrayFutbolista.add(f11);
        Gson gson = new Gson();

        for (int i = 0; i < arrayFutbolista.size(); i++) {
            String json_completo = gson.toJson(arrayFutbolista.get(i));
            System.out.println(json_completo);
        }
        System.out.println("---------------------------------------------------");
        String json_completo = gson.toJson(arrayFutbolista);
        ArrayList<String> posicionesRamos = new ArrayList<>();
        Futbolista[] arrayFutbolistaAUX = gson.fromJson(json_completo, Futbolista[].class);
        for (int i = 0; i < arrayFutbolistaAUX.length; i++) {
            System.out.println(arrayFutbolistaAUX[i].toString());
            if (arrayFutbolistaAUX[i].getNombre().equalsIgnoreCase("SergioRamos")){
                posicionesRamos.add(Arrays.toString(arrayFutbolistaAUX[i].getPosicionJugadore()));
            }
        }

        System.out.println("Las posiciones de ramos son"+posicionesRamos);
    }
}
