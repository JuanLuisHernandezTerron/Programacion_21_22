package U1.T6;
//Crea un programa que pida un número entero al usuario y dé a una variable par
// el valor 1 si ese número es par o el valor 0 si no es par.
// Hazlo primero con un "if" y luego con un "operador condicional".

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero");
        int numero = teclado.nextInt();
        boolean par = true;
        boolean impar = false;
        if (numero % 2 == 0){
            System.out.println(par + " El numero es par");
        }else{
            System.out.println(impar + " El numero es impar");
        }
    }
}
