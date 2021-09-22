package U1.T2;
import java.util.Scanner;

// Crea un programa que pida al usuario una temperatura en grados centígrados y
// calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime los grados: ");
        double grados = teclado.nextDouble();

        double gradosFahreheim = (9 * grados / 5 ) + 32;

        System.out.println("Los grados Fahrenheit son: " + gradosFahreheim);
    }
}
