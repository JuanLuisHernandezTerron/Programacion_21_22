package U1.U1_Entregable;

import java.util.Scanner;

// Realiza un programa que solicite al usuario un número entero positivo con una cantidad de 6
// cifras exactamente. Si el número no tiene esa cantidad de cifras, se vuelve a pedir el
// número hasta que sea de 6 cifras.
//
//Una vez tengamos el número se deberá comprobar si el número compuesto por las tres primeras cifras
// es primo. Lo mismo para el número compuesto por las tres últimas cifras. Se deberá mostrar un mensaje
// por pantalla tanto si es primo como si no lo es. Si al partir el número, se comienza en 0, se considera
// que el número es el entero que se obtendría. Abajo se muestra un ejemplo del mismo.
//
//Ejemplo1:
//
//Introduce un número de 6 cifras: 1213
//Introduce un número de 6 cifras: 379004
//379 es un número primo
//4 NO es un número primo
public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero de 6 cifras: ");
        int numeroIntroducido = teclado.nextInt();

        while (numeroIntroducido < (1000000 - 900000)){
            System.out.print("Dime un numero de 6 cifras: ");
            numeroIntroducido = teclado.nextInt();
        }

        int cociente = numeroIntroducido;
        int resto = 0;
        int numeroAUX = 0;
        int contador = 0;
        int primeros3 = 0;
        int segundos3 = 0;

        while ( cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX * 10;
        }
        numeroAUX = numeroAUX / 10;

        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX = numeroAUX /10;

            if(contador < 3){
                primeros3 = primeros3 + resto;
                primeros3 = primeros3 * 10;
            }else{
                segundos3 = segundos3 + resto;
                segundos3 = segundos3 * 10;
            }
            contador++;
        }
        primeros3 = primeros3 /10;
        segundos3 = segundos3 /10;

        boolean es_primo = true;
        for (int i = 2; i < primeros3; i++) {
                if (primeros3 % i == 0){
                    es_primo = false;
                    break;
            }
        }

        if (es_primo){
            System.out.println(primeros3 + " es un numero primo");
        }else{
            System.out.println(primeros3+ " no es primo");
        }

        es_primo = false;
        for (int k = 2; k < segundos3; k++) {
                if ( segundos3 % k == 0){
                    es_primo = false;
                    break;
                }
        }
        if (es_primo){
            System.out.println(segundos3 + " Es primo");
        }else{
            System.out.println(segundos3 + " No es primo");
        }
    }
}
