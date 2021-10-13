package U3.T1;
import java.util.Scanner;
//Escribir una función a la que se le pase un número entero y devuelva el
// número de divisores primos que tiene.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero entero: ");
        int numeroIntroducido = teclado.nextInt();

        System.out.println(divisorPrimo(numeroIntroducido));
    }

    static int divisorPrimo(int numeroIntroducido){
        int contadorDivisor= 0;
        for (int i = 2; i < numeroIntroducido; i++) {
            boolean es_primo = true;
            if (numeroIntroducido % i ==0){
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        es_primo = false;
                    }
                }

                if (es_primo) {
                    contadorDivisor++;
                }
            }
        }
        return contadorDivisor;
    }
}
