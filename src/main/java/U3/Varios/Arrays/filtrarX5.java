package U3.Varios.Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

//Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
//lo que se especifica en los comentarios:
//
//public int[] filtraCon8(int x[]) // Devuelve un array con todos los números
//                                 // que contienen el 8 (por ej. 8, 28, 782)
//                                 // que se encuentren en otro array que se
//                                 // pasa como parámetro. El tamaño del array
//                                 // que se devuelve será menor o igual al
//                                // que se pasa como parámetro.
//
//Utiliza esta función en un programa para comprobar que funcionan bien. Para
//que el ejercicio resulte más fácil, las repeticiones de números que contienen
//8 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
//el array devuelto también estará repetido 3 veces. Si no existe ningún número
//que contiene 8 en el array x, se devuelve un array con el número -1 como único
//elemento.
public class filtrarX5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Que numero quieres sacar: ");
        int numeroSacar = teclado.nextInt();

        int [] array = new int[10];
        rellenarArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sacarFiltrado(array,numeroSacar)));
    }

    private static int [] sacarFiltrado(int[] array,int numeroSacar) {
        int [] arrayAUX = new int[0];
        int contadorNumerosIntroducidos = 0;
        int contadorNoes = 0;
        int cociente = 0;
        int resto = 0;
        for (int i = 0; i < array.length; i++) {
            cociente = array[i];
            while ( cociente > 0){
                resto = cociente %10;
                cociente = cociente /10;
                    if (resto == numeroSacar){
                        arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                        arrayAUX[contadorNumerosIntroducidos] = array[i];
                        contadorNumerosIntroducidos++;
                    }else{
                        if (contadorNoes < 1){
                            arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                            arrayAUX[0] = -1;
                            contadorNoes++;
                        }
                    }
            }
        }
        return arrayAUX;
    }

    private static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
    }
}
