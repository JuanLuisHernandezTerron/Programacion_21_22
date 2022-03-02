package U6.T2.Actividad5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ejercicio5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T2\\Actividad4\\arrayNumerosGuardar.dat"));
            double [] tabla = new double[10];

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
