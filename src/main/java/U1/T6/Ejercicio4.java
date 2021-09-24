package U1.T6;
//Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", que tenga el
// valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional".

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero ");
        byte numero1 = teclado.nextByte();

        System.out.print("Dime otro numero ");
        byte numero2 = teclado.nextByte();

        int menor = 0;

        if (numero1 > numero2){
            menor = numero1;
            System.out.println(menor);
        }else{
            menor = numero2;
            System.out.println(menor);
        }
    }
}
