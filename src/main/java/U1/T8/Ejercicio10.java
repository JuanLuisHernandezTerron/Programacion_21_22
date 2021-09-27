package U1.T8;
// Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su tabla de
// multiplicar. El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así,
// volver a pedirlo hasta que lo cumpla.
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero que esté entre 1 y 10 ");
        int numero = teclado.nextInt();

        while (numero < 1 || numero > 10){
            System.out.print("Dime un numero que esté entre 1 y 10 ");
            numero = teclado.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero * i);
        }
    }
}
