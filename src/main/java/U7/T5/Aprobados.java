package U7.T5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Aprobados implements Serializable {
    private static Map<Integer, ArrayList<Double>> mapaNotas = new LinkedHashMap<>();

    public static void calcularMedias(){
        for (Integer notaAspi: mapaNotas.keySet()) {
            calcularMedia(notaAspi);
        }
    }

    public static Double calcularMedia(Integer id){
        ArrayList<Double> notas = mapaNotas.get(id);
        double suma = 0;
        for (double nota: notas) {
            suma += nota;
        }
        Double media = suma / mapaNotas.size();
        return media;
    }

    public static void cargarNotas(){
        try{
            ObjectInputStream ficheroLeer = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\T5\\calificaciones.dat"));
            mapaNotas = (Map<Integer, ArrayList<Double>>) ficheroLeer.readObject();
            ficheroLeer.close();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
