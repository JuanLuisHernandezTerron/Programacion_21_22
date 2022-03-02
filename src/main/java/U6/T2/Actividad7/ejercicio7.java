package U6.T2.Actividad7;

import java.io.*;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una frase: ");
        String frase = teclado.nextLine();

        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T2\\Actividad7\\textoBinario.dat"));
            fichero.writeObject(frase);
            fichero.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try{
            ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T2\\Actividad7\\textoBinario.dat"));
            System.out.println(fichero1.readObject());
            fichero1.close();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
