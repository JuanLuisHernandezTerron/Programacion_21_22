package U3.Varios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Crear una función insertarValor que:
//
//Reciba como parámetros un vector de enteros, un valor y una posición
//Devuelva como resultado un vector en el que habremos insertado el valor que le hemos pasado en la posición indicada.
// De esta manera el vector resultado tendrá un elemento más.
//En caso de que la posición exceda los límites del vector deberá mostrar un error por pantalla y devolver el mismo vector recibido.
//Realizar una llamada a la función mostrando el vector resultado.
//
//Ejemplo:
//
//v = { 1 , 2 , 3 , 4 , 5 }
//
//v1 = invertarValor(v,8,3)
//
//Entonces v1 será {1,2,3,8,4,5}
public class ejercicio2_Maanana_azul {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] array = {1,2,5,8,9,7};
        System.out.println("Dime la posicion que quieres cambiar: ");
        int posicion = teclado.nextInt();

        System.out.println("Dime que numero quieres introducir en el array: ");
        int numeroIntroducir= teclado.nextInt();

        if(posicion > array.length){
            System.out.println("Vuelva a ejecutar el programa y ponga una posicion menor a la longitud del array.");
            System.out.println(Arrays.toString(array));
        }else{
            invertarValor(array,posicion,numeroIntroducir);
        }

    }

    private static void invertarValor(int[] array, int posicion, int numeroIntroducir) {
        int contadorPosicion = 0;
        int contadorNumeros = 0;
        int [] arrayNuevo = new int[0];
        for (int i = 0; i < array.length+1; i++) {

            if (contadorPosicion == posicion){
                arrayNuevo = Arrays.copyOf(arrayNuevo,arrayNuevo.length+1);
                arrayNuevo[contadorPosicion] = numeroIntroducir;
            }else{
                arrayNuevo = Arrays.copyOf(arrayNuevo,arrayNuevo.length+1);
                arrayNuevo[contadorPosicion] = array[contadorNumeros];
                contadorNumeros ++;
            }
            contadorPosicion++;
        }
        System.out.println(Arrays.toString(arrayNuevo));
    }
}
