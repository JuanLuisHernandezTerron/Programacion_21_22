package U1.T4;
// El tipo short permite almacenar valores comprendidos entre -32768 y 32767. Realiza un programa que muestre si el
// rango de valores de un tipo se comporta de forma cíclica. Es decir, que muestre el valor máximo de una variable de
// tipo short, y muestre también qué ocurre si sumamos 1 a esa variable.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el numero máximo del tipo short (32767): " );
        short numeroMax  = teclado.nextShort();

        if (numeroMax == 32767) {
            System.out.println("El numero es: " + numeroMax);
            numeroMax ++;
            System.out.println("Vamos hacer una prueba ahora y vamos a sumarle uno mas al numeroMaximo: " + numeroMax);
        }
    }
}
