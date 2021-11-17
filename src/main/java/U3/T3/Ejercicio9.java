package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

//Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta de la primitiva,
// y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.
public class Ejercicio9 {
    public static void main(String[] args) {

        int []apostadoPrimitiva = meterdatos();
        int []combinacionGanadora = {38,12,30,45,48,19};

        System.out.println("Has acertado: "+numerosAciertos(apostadoPrimitiva,combinacionGanadora));
    }

    private static int numerosAciertos(int[] array1, int [] array2) {
        int numerosAciertos = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    numerosAciertos ++;
                }
            }
        }
        return numerosAciertos;
    }

    private static int[] meterdatos() {
        Scanner teclado = new Scanner(System.in);
        int []arrayVacio = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Dime el numero de la primitiva: ");
            int numeroPrimitiva = teclado.nextInt();

            arrayVacio[i]=numeroPrimitiva;
        }
        return arrayVacio;
    }
}
