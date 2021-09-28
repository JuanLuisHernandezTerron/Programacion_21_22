package U1.T8;
//Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado,
// utilizando para ello asteriscos (*). Por ejemplo, para n=4:
//* * * *
//
//* * *
//
//* *
//
//*
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime que valor quieres que tenga n");
        int n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("a");
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");
            }
        }
    }
}
