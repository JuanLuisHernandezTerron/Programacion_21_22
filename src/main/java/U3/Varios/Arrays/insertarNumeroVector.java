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
public class insertarNumeroVector {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] v = {1,2,3,4,5,6};

        System.out.println("Dime que numero quieres introducir en el vector: ");
        int numeroIntroducir = teclado.nextInt();
        System.out.println("Dime en que posicion: ");
        int pos = teclado.nextInt();

        System.out.println(Arrays.toString(invertarValor(v,numeroIntroducir,pos)));

    }

    private static int [] invertarValor(int[] v, int numeroIntroducir, int pos) {
        int [] arrayAUX = new int[0];
        int contadorIntroducido = 0;
        for (int i = 0; i < v.length; i++) {
            if (i == pos){
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contadorIntroducido] = numeroIntroducir;
                contadorIntroducido++;
            }else{
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contadorIntroducido] = v[i];
                contadorIntroducido++;
            }
        }
        return arrayAUX;
    }
}
