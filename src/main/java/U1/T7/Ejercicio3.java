package U1.T7;
//Realiza un programa que genere una letra minúscula de forma aleatoria.
// Investiga el uso de la función Math.random(). Investiga también sobre el
// sistema de codificación ASCII y ten en cuenta que las letras minúsculas se corresponden con los
// números del 97 al 122.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        char paramChar = (char)(Math.random() * 25 + 97); // 97 es la primera letra en minuscula del codigo ascii y
                                                          // queremos ver los 25 proximos ya que 25 es la última letra
                                                          // del abecedario ASCII.
        System.out.println(paramChar);
    }
}
