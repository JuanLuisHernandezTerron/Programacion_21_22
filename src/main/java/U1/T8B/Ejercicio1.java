package U1.T8B;
//Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un n�mero de 4 cifras. El programa nos pedir� la
// combinaci�n para abrirla. Si no acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la combinacion� y si
// acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�. Tendremos cuatro oportunidades para abrir
// la caja fuerte.

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int claveCifrada = 2567;

        for (int i = 1; i <= 4 ; i++) {
            System.out.print("Dime la clave cifrada que crees que es: ");
            int numeroIntroducido = teclado.nextInt();
                if (numeroIntroducido != claveCifrada){
                    System.out.println("Lo siento, no es la combinacion");
                }else{
                    System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                    break;
                }
        }
    }
}
