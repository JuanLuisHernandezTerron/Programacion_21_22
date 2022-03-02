package U6.T2.Actividad5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ejercicio5 {
    public static void main(String[] args) {

        System.out.println();
        try {
//          ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T2\\Actividad4\\arrayNumerosGuardar.dat"));
            ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T2/Actividad4/arrayNumerosGuardar.dat"));
            double[] numeroGuardar = (double[]) fichero1.readObject();
            for (int i = 0; i < numeroGuardar.length; i++) {
                System.out.println(numeroGuardar[i]);
            }
            fichero1.close();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
