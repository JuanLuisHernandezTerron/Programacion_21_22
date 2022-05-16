package U3.Varios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1Prueba {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int [] arrayVacio = {1,2,3,4,5,6}; // Se pone así cuando el array tienes que rellenarlo sin introducir datos por terminal.
        int [] arrayVacio2 = new int[0]; // Se pone así cuando el array tienes que rellenarlo introduciendo los datos por terminal.
        int [] arrayVacio3 = rellenarArray(teclado); //Así es cuando quieres rellenar un array con una función.

        System.out.println(Arrays.toString(arrayVacio3)); //Asín mostramos por pantalla un array
    }

    private static int[] rellenarArray(Scanner teclado) {
        int [] arrayVacio = new int [6]; //Nos declaramos un array vacio donde guardaremos el array que hemos creado en la funcion y el que devolveremos posteriormente.
        for (int i = 0; i < 6; i++) { //El array tendra 6 de capacidad
            System.out.println("Dime numeros que quieres guardar en el array :");
            int numeros = teclado.nextInt();

            arrayVacio[i]=numeros; //De esta forma estaremos introduciendo los numero que estamos escribiendo por la terminal en el array.
            // !!!NO UTILIZAR arrayVacio[i]=arrayVacio[i] + numeros !! YA QUE SE SOBREESCRIBIRÍA.
        }
        return arrayVacio;
    }
}
