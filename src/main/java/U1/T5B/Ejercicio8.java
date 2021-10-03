package U1.T5B;
//Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
//
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el primer numero (a): ");
        double a = teclado.nextInt();

        System.out.print("Dime el primer numero (b): ");
        double b = teclado.nextInt();

        System.out.print("Dime el segundo numero (c): ");
        double c = teclado.nextInt();

        double multiplicacion = 4 * a * c;
        double raizCuadrada = Math.sqrt(Math.pow(b,2) - (multiplicacion));
        double ecuacionSegundo1 = (-(b) + raizCuadrada)/(2 * a);
        double ecuacionSegundo2 = (-(b) - raizCuadrada)/(2 * a);

            System.out.println("El resultado sería: "+ecuacionSegundo1 +" y "+ecuacionSegundo2);
    }
}
