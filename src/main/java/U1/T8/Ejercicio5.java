package U1.T8;
//Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación, solicitará por teclado
// un valor que debe estar dentro del rango. Si no es asi, volverá a solicitar un número, y así repetidas veces hasta
// que el valor esté dentro del rango.

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un valor minimo: ");
        int numeroMin = teclado.nextInt();

        System.out.print("Dime un valor maximo: ");
        int numeroMax = teclado.nextInt();

        System.out.print("Dime el numero que esta en el rango: ");
        int numeroRango = teclado.nextInt();

        while (numeroRango < numeroMin || numeroRango > numeroMax){             //Con este bucle estamos diciendo que si el numeroRango es menor que el numeroMin y el numeroRango es mayor que numeroMax que repita el sout hasta que este entre el rango
            System.out.print("Dime el numero que esta en el rango: ");
            numeroRango = teclado.nextInt();
        }
    }
}
