package U1.T5;
 //Crea un programa que diga si el número introducido por el usuario es impar o no lo es.
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
