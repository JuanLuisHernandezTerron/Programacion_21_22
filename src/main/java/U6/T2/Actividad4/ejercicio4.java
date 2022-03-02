package U6.T2.Actividad4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numero = teclado.nextInt();
        double [] arrrayNumeros = new double[numero];
        for (int i = 0; i < arrrayNumeros.length; i++) {
            System.out.print("Dime un numero double: ");
            double numeroDouble = teclado.nextDouble();
            arrrayNumeros[i]=numeroDouble;
        }
        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T2\\Actividad4\\arrayNumerosGuardar.dat"));
            fichero.writeObject(arrrayNumeros); //Así se escribe los arrays en binario.
            fichero.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
