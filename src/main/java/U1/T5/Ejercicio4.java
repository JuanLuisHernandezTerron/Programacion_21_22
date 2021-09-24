package U1.T5;
//Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contadorPar = 0;

        System.out.print("Dime un numero ");
        int numero1 = teclado.nextInt();

        System.out.print("Dime otro numero ");
        int numero2 = teclado.nextInt();

        if (numero1 % 2 == 0) {
            contadorPar ++;
        }

        if (numero2 %2 == 0){
            contadorPar ++;
        }

        System.out.println("Hay" + contadorPar + "pares");
    }
}
