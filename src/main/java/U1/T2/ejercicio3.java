package U1.T2;
import java.util.Scanner;
// Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero:");
        int numero1 = teclado.nextInt();

        System.out.println("Dime otro numero:");
        int numero2 = teclado.nextInt();

        System.out.println("La division de los numeros " + numero1 + " y " + numero2 + " es " + (numero1/numero2));
    }
}
