package U1.T5B;
//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
//
//Ejemplo 1:
//Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//Por favor, introduzca el valor de a: 2
//Ahora introduzca el valor de b: 1
//x = -0.5

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca el valor de a: ");
        double a = teclado.nextInt();

        System.out.print("Por favor, introduzca el valor de b: ");
        double b = teclado.nextInt();

        double ecuacionPrimerGrado = b / a;

        if (a > b){
            System.out.print(ecuacionPrimerGrado);
        }else{
            System.out.print("Esa ecuación no tiene solución real.");
        }
    }
}
