package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

// Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
// Realizar la media de los números positivos, la media de los negativos, y
// contar el número de ceros introducidos.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres introducir: ");
        int numerosIntroducir = teclado.nextInt();

        double numerosPositivos = 0;
        double numeroNegativos = 0;
        int contadorNumeroPosi = 0;
        int contadorNumerosNega = 0;
        int contadorCeros = 0;

        int espaciosArray[] = new int[numerosIntroducir];

        for (int i = 0; i < numerosIntroducir; i++) {
            System.out.print("Dime un numero: ");
            espaciosArray[i] = teclado.nextInt();
        }
        System.out.println(Arrays.toString(espaciosArray));

        for (int i = 0; i < espaciosArray.length; i++) {
            if (espaciosArray[i] < 0){
                contadorNumerosNega ++;
                numeroNegativos = numeroNegativos + espaciosArray[i];
            }else if (espaciosArray[i] > 0){
                contadorNumeroPosi ++;
                numerosPositivos = numerosPositivos +espaciosArray[i];
            }else {
                contadorCeros ++;
            }
        }
        System.out.println("La media de numeros positivos es "+ numerosPositivos/contadorNumeroPosi);
        System.out.println("La media de numeros negativos es "+ numeroNegativos/contadorNumerosNega);
        System.out.println("Hay "+contadorCeros+" ceros");
    }
}
