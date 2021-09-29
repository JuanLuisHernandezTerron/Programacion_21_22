package U1.T8B;
// Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroPositivos = 0;
        int numerosNegativos = 0;
        double numeros2 = 0;

        System.out.print("Introduce cuantos numeros quieres que aparezcan en la lista: ");
        Double numeros = teclado.nextDouble();

        for (int i = 0; i < numeros ; i++) {
            System.out.print("Dime 10 numeros aleatorios");
            numeros2 = teclado.nextDouble();

            if (numeros2 >= 0){
                numeroPositivos ++;
            } else {
                numerosNegativos ++;
            }
        }
        System.out.print("Hay "+ numeroPositivos + " numeros postivos " + numerosNegativos + " numeros negativos");
    }
}
