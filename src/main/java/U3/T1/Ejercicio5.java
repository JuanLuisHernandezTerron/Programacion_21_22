package U3.T1;

import java.util.Scanner;

//Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números.
// Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero entero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Dime otro numero entero: ");
        int numero2 = teclado.nextInt();
        System.out.print("Dime otro numero entero: ");
        int numero3 = teclado.nextInt();

        int mayor=mayorOmenor(numero1,numero2);
        System.out.println(mayorOmenor(numero3,mayor));
    }
    static int mayorOmenor(int numero1, int numero2){
        if (numero1 > numero2){
            return numero1;
        }else {
            return numero2;
        }
    }
}
