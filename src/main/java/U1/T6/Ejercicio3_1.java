package U1.T6;
//Crea un programa que pida un número entero al usuario y dé a una variable par
// el valor 1 si ese número es par o el valor 0 si no es par.
// Hazlo primero con un "if" y luego con un "operador condicional".

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero");
        int numero = teclado.nextInt();
        boolean par = (numero % 2 == 0)? true: false; //Operador ternario, que nos sirve para
                                                      // que cuando la variable par, sea par, que no saque si es true
                                                      // o false


        System.out.println(par);
    }
}
