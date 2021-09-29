package U1.T8B;
//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el numero que quieres que ");
        int numeroIntroducido = teclado.nextInt();

        int numeroAux = 0; //Variable que guarda el número al revés.
        int resto = 0;

        while ( numeroIntroducido > 0){
            resto = numeroIntroducido % 10;
            numeroAux = numeroAux * 10 + resto;
            numeroIntroducido = numeroIntroducido / 10;
        }
        System.out.println(numeroAux);
    }
}
