package U1.T7;
// Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 0;
                        //Lo que hemos hecho es el valor de la variable a pasarlo a la variable c que es 0 y luego
                        // la variable a tendrá el valor de b que es 8 y para finalizar la variable b cojerá el valor
                        // de la variable c que es el que tenía el valor de a que era 5.
        c = a;
        a = b;
        b = c;

        System.out.println("B es ahora " + b + " y " + "a es ahora " + a);
    }
}
