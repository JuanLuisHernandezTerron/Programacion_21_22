package U3.T1;
import java.util.Scanner;
//Escribir una función a la que se le pase un número entero y devuelva el
// número de divisores primos que tiene.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero entero: ");
        int numeroIntroducido = teclado.nextInt();

        boolean es_primo = false;

        System.out.println(divisorPrimo(numeroIntroducido, es_primo));
    }

    static int divisorPrimo(int numeroIntroducido, boolean es_primo){
        int contador_divisores_primos = 0;
        for (int i = 0; i <= numeroIntroducido; i++) {
            if (numeroIntroducido % i == 0){
                for (int j = 1; j <= numeroIntroducido  ; j++) {
                        es_primo = true;
                    for (int k = 2; k <= j - 1 ; k++) {
                        contador_divisores_primos ++;
                        if (j % k ==0){
                            es_primo = false;
                            break;
                        }
                    }
                }
            }
        }
        return contador_divisores_primos;
    }
}
