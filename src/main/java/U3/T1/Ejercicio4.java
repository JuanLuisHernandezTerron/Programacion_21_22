package U3.T1;

import java.util.Scanner;

//Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero entero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Dime otro numero entero: ");
        int numero2 = teclado.nextInt();

        System.out.println(mayorOmenor(numero1,numero2));
    }
    static int mayorOmenor(int numero1, int numero2){
        if (numero1 > numero2){
            return numero1;
        }else {
            return numero2;
        }
    }
}
