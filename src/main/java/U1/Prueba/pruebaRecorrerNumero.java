package U1.Prueba;

import java.util.Scanner;

public class pruebaRecorrerNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();

        int cociente = numeroIntroducido;
        int resto = 0;
        int numeroAUX = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX * 10;
        }

        System.out.println(numeroAUX / 10);

        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX = numeroAUX /10;
            cociente = cociente + resto;
            cociente = cociente * 10;
        }

        System.out.println(cociente / 10);
    }
}
