package U1.T8B;
//Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de
// Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
// términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();
        int numeroAnterior = 1;
        int copianumeroActual = 0;
        int numeroActual = 0;

        for (int i = 0; i < numeroIntroducido; i++) {
            System.out.println( numeroActual);
            copianumeroActual = numeroActual;
            numeroActual = numeroAnterior + numeroActual;
            numeroAnterior = copianumeroActual;
        }
    }
}
