package U1.Prueba;

import java.util.Scanner;

public class divisores2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime que numoero quieres saber que es divisor: ");
        int numeroIntroducido = teclado.nextInt();

        for (int i = 1; i < numeroIntroducido; i++) {
            if (numeroIntroducido % i == 0){
                System.out.println("Los divisores de "+ numeroIntroducido + " son: "+ i);
            }
        }
    }
}
