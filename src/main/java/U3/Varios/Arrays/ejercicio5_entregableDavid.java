package U3.Varios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Implementa la función arrayDeAleatorios con la cabecera que se muestra a
//continuación:
//public static int[] aleatorioDeArray(int a, int b, int cantidad)
//Esta función debe devolver un array de números aleatorios en el intervalo [a, b]
//ambos inclusive con el tamaño que indique el parámetro cantidad. Por ejemplo,
//si a = 10 y b = 30 con cantidad = 7 arrayDeAleatorios(a, b, cantidad)
//devolverá un array con 7 elementos aleatorios entre el 10 y el 30. Utiliza la
//función en un programa de prueba.
public class ejercicio5_entregableDavid {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        System.out.print("Dime el primer numero: ");
        int a = teclado.nextInt();

        System.out.print("Dime el segundo numero: ");
        int b = teclado.nextInt();

        System.out.print("Cuanta cantidad de numeros quieres sacar");
        int cantidad = teclado.nextInt();

        System.out.println(Arrays.toString(aleatorioDeArray(a,b,cantidad)));
    }
    public static int[] aleatorioDeArray(int a, int b, int cantidad){
        int [] arrayCantidad = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arrayCantidad[i] = (int) (a+Math.random()*(b-a));
        }
        return arrayCantidad;
    }
}
