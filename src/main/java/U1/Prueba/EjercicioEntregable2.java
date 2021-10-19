package U1.Prueba;

import java.util.Scanner;

//Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
//hay dentro de un número. Se recomienda usar long en lugar de int ya que el
//primero admite números más largos.
//
//Ejemplo 1:
//Por favor, introduzca un número entero positivo: 406783
//El 406783 contiene 4 dígitos pares y 2 dígitos impares.
//
//Ejemplo 2:
//Por favor, introduzca un número entero positivo: 3177840
//El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
public class EjercicioEntregable2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        long numeroIntroducido = teclado.nextLong();
        long cociente = numeroIntroducido;
        long resto = 0;
        int contadorPares = 0;
        int contadorImpares = 0;

       while (cociente > 0){    //Con este while recorremos un numero de varias cifras y vemos  si es par o no.
           resto = cociente % 10;
           cociente = cociente /10;

           if (resto % 2 == 0){
               contadorPares ++;
           }else{
               contadorImpares ++;
           }
       }
        System.out.println("El numero "+numeroIntroducido+ " tiene "+ contadorPares + " numeros pares y " + contadorImpares + " numeros impares");
    }
}
