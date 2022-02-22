package U6.T1.Actividad6;

import java.io.*;
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
        if (!comprobarNombre(nombre)){
            try{
                BufferedWriter in= new BufferedWriter(new FileWriter("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T1\\Actividad6\\firmas.txt",true));
//            BufferedWriter in= new BufferedWriter(new FileWriter("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad6/firmas.txt",true));
                in.newLine();
                in.write(nombre);
                in.close();
            }catch (IOException ex){
                System.out.println("ERROR FICHEROS");
            }
        }else{
            System.out.println("Ya está en el libro de firmas");
        }
    }

    public static boolean comprobarNombre(String nombre){
        boolean es_igual = false;
        try {
            BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T1\\Actividad6\\firmas.txt"));
            String texto = "";
            String linea = out.readLine();

            while (linea != null){
                texto = linea;
                if (texto.equalsIgnoreCase(nombre)){
                    es_igual = true;
                }
                linea = out.readLine();
            }
            out.close();
        }catch (IOException ex){
            System.out.println("ERROR DE FICHEROS");
        }

        return es_igual;
    }

    public static void mostrarCarta(){
        try{
            BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T1\\Actividad6\\firmas.txt"));
            String texto = "";
            String linea = out.readLine();
            while (linea != null){
                texto = linea;
                System.out.println(texto);
                linea = out.readLine();
            }
            out.close();
        }catch (IOException ex){
            System.out.println("ERROR DE FICHEROS");
        }

    }
}
