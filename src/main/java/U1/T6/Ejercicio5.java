package U1.T6;
//Ejercicio6-5: Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia,
// y a continuación muestre un pequeño menú con 3 opciones:
//
//1.Calcular diámetro
//
//2.Calcular perímetro
//
//3.Calcular área
//
//Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
// (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el valor del radio de la circuferencia ");
        double radio = teclado.nextDouble();

        System.out.println("1.Calcular diámetro");
        System.out.println("2.Calcular perímetro");
        System.out.println("3.Calcular área");
        System.out.print("Que opcion quieres escoger? ");
        int numeroEscogido = teclado.nextInt();

        switch (numeroEscogido){
            case 1: System.out.println( 2 * radio); break;
            case 2: System.out.println( 2 * Math.PI * radio); break;
            case 3: System.out.println( Math.PI * Math.pow(radio,2)); break;
        }
    }
}
