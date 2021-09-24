package U1.T5;
//Crea un programa que pida tres números enteros largos al
// usuario y diga cuál es el mayor de los tres.

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero ");
        long numero1 = teclado.nextLong();

        System.out.print("Dime otro numero ");
        long numero2 = teclado.nextLong();

        System.out.print("Dime el tercer numero ");
        long numero3 = teclado.nextLong();

        if ((numero1 > numero2) && (numero1 > numero3)){
            System.out.println(numero1 + " es mayor");
        }else if ((numero2 > numero1) && (numero2 > numero3)){
            System.out.println(numero2 + " es mayor");
        }else{
            System.out.println(numero3 + " es mayor");
        }


    }
}
