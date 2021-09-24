package U1.T5;
//Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario
// el valor de "tiempo", y calcule y muestre
// la velocidad (velocidad=gravedad x tiempo). Nota: si el valor del tiempo es negativo o 0,
// se mostrará el mensaje "Tiempo incorrecto"

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double gravedad = 9.8;

        System.out.print("Dime el valor del tiempo ");
        double tiempo = teclado.nextInt();

        double velocidad = gravedad * tiempo;

        if (tiempo > 0 ) {
            System.out.println("La velocidad es " + velocidad);
        }else{
            System.out.println("El tiempo es incorrecto");
        }
    }
}
