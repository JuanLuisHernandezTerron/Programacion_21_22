package U6.T2.Actividad8;

import java.io.*;
import java.util.Arrays;

public class ejercicio8 {
    public static void main(String[] args) {
        int [] arrayNumeros = new int[10];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = (int) (1+Math.random()*99);
        }
        Arrays.sort(arrayNumeros);

        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T2/Actividad8/guardarArrayNumeros.dat"));
            fichero.writeObject(arrayNumeros);
            fichero.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try{
            ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T2/Actividad8/guardarArrayNumeros.dat"));
            int [] arrayAUX = (int[]) fichero1.readObject();
            for (int i = 0; i < arrayAUX.length; i++) {
                System.out.println(arrayAUX[i]);
            }
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
