package U3.T1;
import java.util.Scanner;
//Diseñar una función eco() a la que se le pasa como parámetro un número n,
// y muestra por pantalla n veces el mensaje "Eco..."
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime cuantas veces quieres que se repita: ");
        int numeroVeces = teclado.nextInt();
        eco(numeroVeces);
    }

    static void eco(int pepe){
        for (int i = 0; i < pepe; i++) {
            System.out.println("eco");
        }
    }
}
