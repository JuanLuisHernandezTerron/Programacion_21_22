package U6.T2.Actividad1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero double: ");
        double numero = teclado.nextDouble();

        try{
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T2\\Actividad1\\numeroBinario.dat"));
            archivo.writeDouble(numero);
            archivo.close();
        }catch (IOException ex){
            System.out.println("ERROR DE FICHEROS");
        }
    }
}
