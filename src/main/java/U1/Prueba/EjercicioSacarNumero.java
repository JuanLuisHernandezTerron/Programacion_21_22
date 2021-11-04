package U1.Prueba;

import java.util.Scanner;

public class EjercicioSacarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();
        System.out.print("Que posicion quieres sacar");
        int posicion = teclado.nextInt();

        int resto = 0;
        int cociente = numeroIntroducido;
        int numeroAUX = 0;
        int contador = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX *10;
        }

        numeroAUX = numeroAUX /10;

        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX = numeroAUX /10;
               if (contador != posicion){
                    cociente = cociente+resto;
                    cociente = cociente *10;
                    }
            contador ++;
        }
        System.out.println(cociente/10);
    }
}

