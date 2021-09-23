package U1.T5;
// Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero) o si, por el contrario,
// no lo es (usando "else").

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero aleatorio");
        int numero1 = teclado.nextInt();

        if (numero1 >= 0) {
            System.out.println("Es un numero positivo");
        }else{
            System.out.println("Es negativo");
        }
    }
}
