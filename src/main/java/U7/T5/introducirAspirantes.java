package U7.T5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class introducirAspirantes extends aspirante implements Serializable {
    private int contadorID = 0;
    private static Scanner teclado = new Scanner(System.in);
    private static String respuesta = "";
    private static Map<Integer,introducirAspirantes> mapAspirantes = new LinkedHashMap<>();
    private static ArrayList<Integer> arrayID = new ArrayList<>();

    public introducirAspirantes(String nombre, String dni, int telefono) {
        super(nombre, dni, telefono);
        this.contadorID +=1;
    }

    public static void guardarFicheros() {
        try{
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\T5\\mapaAspirantes.dat", true));
            ObjectOutputStream fichero2 = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\T5\\listaAspirantes.dat", true));
            fichero.writeObject(mapAspirantes);
            fichero2.writeObject(arrayID);
            fichero2.close();
            fichero.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void introducirAspi() {
        do {
            System.out.println("Dime el nombre del aspirante:");
            String nombre = teclado.next();
            System.out.println("Dime el DNI del aspirante");
            String dni = teclado.next();
            System.out.println("Dime el telefono del aspirante:");
            int numero = teclado.nextInt();
            introducirAspirantes aspiranteAUX = new introducirAspirantes(nombre,dni,numero);
            mapAspirantes.put(aspiranteAUX.getContadorID(),aspiranteAUX);
            arrayID.add(aspiranteAUX.getContadorID());
            System.out.println("Quieres seguir?");
            respuesta= teclado.next();
        }while (respuesta.equalsIgnoreCase("si"));
    }


    public int getContadorID() {
        return contadorID;
    }

    public void setContadorID(int contadorID) {
        this.contadorID = contadorID;
    }
}
