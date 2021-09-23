package U1.T3;
// Crea un programa que calcule y muestre la división de dos números reales de doble
// precisión introducidos por el usuario.

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el primer numero: ");
        double numero1 = teclado.nextDouble();

        System.out.println("Dime el segundo numero: ");
        double numero2  = teclado.nextDouble();

        System.out.println("La division entre " + numero1 + " y " + numero2 + " es " + (numero1 / numero2));
    }
}
