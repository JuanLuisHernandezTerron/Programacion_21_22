package U6.T2.Actividad3;

import java.io.*;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try{
//            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T2\\Actividad3\\arrayNumeros.dat",true));
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T2/Actividad3/arrayNumeros.dat",true));
            System.out.print("Dime un numero: ");
            int numero = teclado.nextInt();
            fichero.writeInt(numero);
            while (numero != -1){
                System.out.print("Dime un numero: ");
                numero = teclado.nextInt();
                if (numero != -1) {
                    fichero.writeInt(numero);
                }
            }
            fichero.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try {
//            ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T2\\Actividad3\\arrayNumeros.dat"));
            ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T2/Actividad3/arrayNumeros.dat"));
            int numero = fichero1.readInt();
            while (true){
                System.out.println(numero);
                numero = fichero1.readInt();
            }
        } catch (IOException ex){
            System.out.println("Finaliza programa");
        }
    }
}
