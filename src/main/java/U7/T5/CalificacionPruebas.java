package U7.T5;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CalificacionPruebas implements Serializable{
    private static final int  pruebas = 3;
    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Integer> arrayID = new ArrayList<>();
    private static ArrayList<Double> arrayNotas = new ArrayList<>();
    private static Map<Integer,ArrayList<Double>> mapaNotas = new LinkedHashMap<>();

    public static void  calificarPrueba(){
        for (Integer id: arrayID) {
            ArrayList<Double> arrayNotas = new ArrayList<>();
            for (int i = 0; i < pruebas; i++) {
                System.out.println("Dime la nota del aspirante"+id);
                double notas = teclado.nextDouble();
                arrayNotas.add(notas);
                teclado.nextLine();
            }
            mapaNotas.put(id,arrayNotas);
        }
    }

    public static void guardarFicheros() {
        try{
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\T5\\calificaciones.dat", true));
            fichero.writeObject(mapaNotas);
            fichero.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void cargarIDs(){
        try{
            ObjectInputStream ficheroLeer = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\T5\\mapaAspirantes.dat"));
            arrayID = (ArrayList<Integer>) ficheroLeer.readObject();
            ficheroLeer.close();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }


}
