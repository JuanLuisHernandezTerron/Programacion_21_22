package U1.Prueba;

import java.util.Scanner;

//Realizar un programa que dado un número que se solicita la usuario por consola eliminará de ese
// número de ese número
//todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado.Deberá solicitar el
// número mientras que
//el número introducido no sea positivo.
//
//Ejemplo 1:
//Introduzca un número entero positivo: 34084091
//Número resultado: 34491
//Dígitos eliminados: 3
public class EjercicioEntregable2_20_21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();

        int cociente = numeroIntroducido;
        int resto = 0;
        int numeroAux = 0;
        int numerosFuera = 0;

        while ( cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;

            if ((resto == 0) || (resto == 8)){
                numerosFuera = numerosFuera +resto;
            }else{
                numeroAux = numeroAux + resto;
                numeroAux=numeroAux*10;
            }
        }

        while (numeroAux > 0){
            resto = numeroAux % 10;
            numeroAux = numeroAux /10;
            cociente= cociente + resto;
            cociente=cociente*10;
        }
        System.out.println(cociente/10);
    }
}
