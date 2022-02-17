package U6.T1.Actividad2;
import java.io.*;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("Dime tu nombre: ");
        String nombre = teclado.next();

        try{

            BufferedWriter buf1 = new BufferedWriter(new FileWriter("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad2/datos.txt",true));
            String cadena = "La persona "+nombre+", tiene "+edad+" años";
            buf1.newLine();
            buf1.write(cadena);
            buf1.close();
            System.out.println();
        }catch (IOException ex){
            System.out.println("ERROR DE FICHERO");
        }
    }
}
