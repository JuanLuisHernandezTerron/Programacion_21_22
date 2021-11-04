package U1.Prueba;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero");
        int numero = teclado.nextInt();
        System.out.print("Que numero quieres sacar: ");
        int numeroBorrar = teclado.nextInt();

        int resto = 0;
        int cociente = numero;
        int numeroAUX = 0;
        int numeroBasura = 0;

        while ( cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX * 10;
        }

        numeroAUX = numeroAUX /10;

        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX = numeroAUX /10;

            if (resto == numeroBorrar){
                numeroBasura = numeroBasura + resto;
            }else{
                cociente = cociente + resto;
                cociente = cociente * 10;
            }

        }

        System.out.print(cociente/10);
    }
}
