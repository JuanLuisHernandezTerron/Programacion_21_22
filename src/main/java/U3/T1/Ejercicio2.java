package U3.T1;

import java.util.Scanner;

//Diseñar una  función a la que se le pasen dos enteros y
// muestre todos los números comprendidos entre ellos.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero entero");
        int numero1 = teclado.nextInt();

        System.out.print("Dime otro numero entero");
        int numero2 = teclado.nextInt();

        while(numero1 > numero2){
            System.out.print("Dime un numero entero");
             numero1 = teclado.nextInt();

            System.out.print("Dime otro numero entero");
             numero2 = teclado.nextInt();
        }
        numeroEnteros(numero1 , numero2);

    }
    static void numeroEnteros(int numero1, int numero2){

        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
        }
    }
}
