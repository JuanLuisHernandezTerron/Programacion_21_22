package U1.Prueba;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime que numero quieres saber sus divisores: ");
        int numeroIntroducido = teclado.nextInt();

        for (int i = 1; i < numeroIntroducido; i++) {
            if ( numeroIntroducido % i == 0){
                System.out.println("Los numeros divisores son: "+i);
            }
        }
    }
}
