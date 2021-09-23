package U1.T4;
//Sería interesante disponer de un programa que pida como entrada un número decimal y
// lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero decimal ");
        double numero1 = teclado.nextDouble();
        System.out.println(Math.round(numero1));
    }
}
