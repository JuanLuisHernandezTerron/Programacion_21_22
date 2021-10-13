package U3.T1;
//Escribir una función que decida si dos números enteros positivos son amigos. Dos números son amigos si la suma de los
// divisores propios (distinto de él mismo) del primer número es igual al segundo número, y viceversa.
// Ejemplos: (220 - 284), (1184 - 1210)
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el primer numero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Dime el segundo numero: ");
        int numero2 = teclado.nextInt();

        enteroPositivos(numero1,numero2);
    }
    static void enteroPositivos (int numero1, int numero2){
        int contadorSuma1 = 0;
        int contadorSuma2 = 0;

        for (int i = 1; i < numero1; i++) {
            if ( numero1 % i == 0){ //Saca los divores.
                contadorSuma1 = contadorSuma1+i;
            }
        }

        for (int j = 1; j < numero2; j++) {
            if ( numero2 % j == 0){
                contadorSuma2 = contadorSuma2 + j;
            }
        }

        if ((contadorSuma1 == numero2) && (numero1 == contadorSuma2)){
            System.out.println("Son amigos");
        }else{
            System.out.println("No son amigos");
        }
    }
}
