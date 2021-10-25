package U1.Prueba;
//Realizar un programa que dado un número que se solicita la usuario por consola eliminará de ese número de ese número
//todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado.Deberá solicitar el número mientras que
//el número introducido no sea positivo.

import java.util.Scanner;

public class eliminarNumeros2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero por favor: ");
        int numeroIntroducido = teclado.nextInt();

        while (numeroIntroducido < 0){
            System.out.print("Dime un numero por favor: ");
            numeroIntroducido = teclado.nextInt();
        }

        int cociente = numeroIntroducido;
        int resto = 0;
        int numeroAUX = 0;
        int numeroBorrar = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX * 10;
        }
        numeroAUX = numeroAUX /10;

        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX= numeroAUX /10;

            if ((resto == 0) || (resto == 8)){
                numeroBorrar = numeroBorrar + resto;
            }else{
                cociente = cociente + resto;
                cociente = cociente * 10;
            }
        }

        System.out.println(cociente/10);
    }
}
