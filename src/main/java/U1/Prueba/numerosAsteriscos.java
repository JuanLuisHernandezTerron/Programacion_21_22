package U1.Prueba;

import java.util.Scanner;

public class numerosAsteriscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();

        int cociente = numeroIntroducido;
        int resto = 0;
        int numeroAUX = 0;
        int contador = 0;
        int contador2 = 0;


        while ( cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX * 10;
            contador ++;
        }
        System.out.println(contador);
        numeroAUX = numeroAUX /10;

        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX = numeroAUX /10;

            for (int i = 0; i < resto; i++) {
                System.out.print("*");
            }
            contador2 ++;
            if (contador > contador2) {
                System.out.print("-");
            }
        }
    }
}
