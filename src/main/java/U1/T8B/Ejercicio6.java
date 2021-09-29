package U1.T8B;
import java.util.Scanner;
//Lo mismo que el 5 pero la pirámide hueca
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura de la piramide: ");
        int numeroAltura = teclado.nextInt();

        System.out.print("Dime con que caracter quieres que se pinte la piramide: ");
        char caracter = teclado.next().charAt(0);

        for (int i = 0; i < numeroAltura ; i++) {
            for (int espaciosBlancos = 0; espaciosBlancos < numeroAltura - i ; espaciosBlancos++) {
                System.out.print("/");
            }

            for (int rellenoPiramide = 0; rellenoPiramide <= i*2; rellenoPiramide++) {
                System.out.print(caracter);
            }

            for (int espaciosBlancos = 0; espaciosBlancos < numeroAltura - i ; espaciosBlancos++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
