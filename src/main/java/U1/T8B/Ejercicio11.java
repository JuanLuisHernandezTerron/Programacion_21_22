package U1.T8B;
//Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura.
// Se debe comprobar que la altura sea un número impar mayor o igual a 3,
// en caso contrario se debe mostrar un mensaje de error.

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la altura que quieres tener");
        int altura = teclado.nextInt();

        while (( altura % 2 == 0) || (altura <3)){
            System.out.println("Dime la altura que quieres tener");
            altura = teclado.nextInt();
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == j){
                    System.out.print("*");
                }else if (j == altura-1-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

