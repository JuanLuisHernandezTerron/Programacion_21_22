package U1.T4;
// Escribe un programa que muestre la hora actual
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        DateFormat fecha = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("Hora actual: " + fecha.format(date));
    }
}
