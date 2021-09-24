package U1.T6;
// Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
// que tenga el valor del menor de esos dos números. Hazlo primero con un "if"
// y luego con un "operador condicional".

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero ");
        byte numero1 = teclado.nextByte();

        System.out.print("Dime otro numero ");
        byte numero2 = teclado.nextByte();

        int menor = (numero1 > numero2)? numero1 : numero2;

        System.out.print("El numero mas grande es " + menor);
    }
}
