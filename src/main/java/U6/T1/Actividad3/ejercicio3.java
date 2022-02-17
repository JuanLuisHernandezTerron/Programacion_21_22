package U6.T1.Actividad3;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el nombre del archivo original: ");
        String nombreArchivo = teclado.next();
        try{
            FileReader file1 = new FileReader("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad3/"+nombreArchivo);
            BufferedWriter copia = new BufferedWriter(new FileWriter("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad3/copia_de_"+nombreArchivo,true));
            String texto = "";
            int c = file1.read();
            while (c != -1){
                texto += (char) c;
                c = file1.read();
            }
            copia.write(texto);
            copia.close();
            file1.close();
        }catch (IOException ex){
            System.out.println("ERROR DE FICHERO");
        }
    }
}
