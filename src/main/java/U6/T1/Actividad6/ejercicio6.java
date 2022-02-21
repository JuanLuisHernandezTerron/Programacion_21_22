package U6.T1.Actividad6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("Que quieres hacer? ");
        System.out.println("1- InsertarNombre");
        System.out.println("2- Ver cartaFirmas");
        System.out.println("------------------");
        int decision = teclado.nextInt();

        switch (decision){
            case 1:
                System.out.println("Dime un nombre");
                String nombre = teclado.next();
                insertarNombre(nombre);
                break;
            case 2:
                mostrarCarta();
                break;
        }
    }

    public static void insertarNombre(String nombre){
        try{
            BufferedWriter out= new BufferedWriter(new FileWriter("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad6/firmas.txt",true));
            out.newLine();
            out.write(nombre);
            out.close();
        }catch (IOException ex){
            System.out.println("ERROR FICHEROS");
        }
    }

    public static void mostrarCarta(){

    }
}
