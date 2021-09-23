package U1.T3;
import java.util.Scanner;

//Crea un programa que calcule y muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario.

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero");
        byte numero1 = teclado.nextByte();

        System.out.println("Dime otro numero");
        byte numero2 = teclado.nextByte();

        System.out.println("El resultado de la suma es de: " + (numero1 + numero2));
    }
}
