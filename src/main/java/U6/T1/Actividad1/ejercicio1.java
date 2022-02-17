package U6.T1.Actividad1;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// Realizar un programa que solicite al usuario el nombre de un fichero de texto y muestre su contenido
//en pantalla. Si no se proporciona ningún nombre de fichero, la aplicación utilizará por defecto "prueba.txt".
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el nombre de un archivo: ");
        String nombre = teclado.nextLine();

        if (nombre.equalsIgnoreCase("")){
            nombre = "default.txt";
        }

        try{
            FileReader file1 = new FileReader("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad1/ficheros/"+nombre);
            int c = file1.read();
            String texto = "";
            while (c !=-1){
                texto += (char) c;
                c = file1.read();
            }
            System.out.println(texto);
            file1.close();
        }catch (IOException ex){
            System.out.println("No existe ese archivo");
        }

    }
}
