package U6.T2.Actividad2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ejercicio2 {
    public static void main(String[] args) {
        try {
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T2\\Actividad1\\numeroBinario.dat"));
            double numero =leerFichero.readDouble();
            System.out.println(numero);
            leerFichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
