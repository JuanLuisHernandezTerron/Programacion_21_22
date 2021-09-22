package U1.T2;
import java.util.Scanner;

//Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
// y calcule su equivalencia en metros (1 milla = 1609 m).

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Dime la longitud en millas: ");
        int millas = teclado.nextInt();
        int metros = millas * 1609 ;

        System.out.println("La conversión a millas es: "+ metros + " metros ");
    }
}
