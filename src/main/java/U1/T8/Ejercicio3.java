package U1.T8;
//Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números tratando de
// acertarlo. El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido
// por el usuario. El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroRandom = (int) (1 + (Math.random()*100)); //Genera un numero random del 1 al 100 y con el sout de abajo
                                                            // nos muestra el numero aletorio
        System.out.println(numeroRandom);

        System.out.print("Dime el numero que crees que es: ");
        int numeroIntroducido = teclado.nextInt();

        while (numeroIntroducido != numeroRandom) {
            if (numeroIntroducido == -1){
                break;
            }

            if (numeroIntroducido < numeroRandom){
                System.out.println("tienes que introducir un numero mas alto");
            } else {
                System.out.println("introduce un numero mas bajo");
            }

            System.out.print("Dime otro numero, a ver si aciertas esta vez: ");
            numeroIntroducido = teclado.nextInt();
        }

        if ( numeroIntroducido == numeroIntroducido) {
            System.out.println("Has acertado");
        }
    }
}
