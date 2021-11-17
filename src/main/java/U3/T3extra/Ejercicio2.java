package U3.T3extra;

import java.util.Arrays;
import java.util.Scanner;

//Escribe un programa que pida 8 palabras y las almacene en un array. Acontinuación,
// las palabras correspondientes a colores se deben almacenar alcomienzo y las que no son colores a
// continuación. Puedes utilizar tantos arraysauxiliares como quieras. Los colores que conoce el
// programa deben estar enotro array y son los siguientes: verde, rojo, azul, amarillo, naranja,
// rosa, negro,blanco y morado.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String [] array = {"rojo","amarillo","verde","coche","morado","blanco","rosa","casa"};
        int contadorPalabras = 0; //Creamos este contador para ver cuantos colores hemos metido y para utilizarlo
        // proximamente.
        String [] arrayOrdenado = new String[8]; //creamos un array con capacidad de 8
        String [] colores = {"verde", "rojo", "azul", "amarillo","naranja","rosa","negro","blanco","morado"};

        for (int i = 0; i < colores.length; i++) { //Este for esta viendo si en el array que hemos creado hay colores, y si hay colores que lo introduzca en el array vacio
            // qué habíamos creado anteriormente, tambien tenemos un contador que va incrementado cada vez que se ha introducido un color en el arrayOrdenado.
            for (int j = 0; j < array.length; j++) {
                if (array[j].equalsIgnoreCase(colores[i])){
                    arrayOrdenado[contadorPalabras] = array[j];
                    contadorPalabras ++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) { // Este for estaremos recorriendo de nuevo el array y si en el array hay un objeto que no está en el array color , pues que,
            // en el arrayOrdenado 'Es el que estamos utilizando para introducir primero las cadenas de colores y posteriormente las que no son colores', vaya introduciendo
            // los datos en el array.
            boolean es_Color = false;
            for (int j = 0; j < colores.length; j++) {
                if (array[i].equals(colores[j])){
                    es_Color = true;
                }
            }
            if (!es_Color){
                arrayOrdenado[contadorPalabras] = array[i];
                contadorPalabras ++; //Hemos reutilizado este contador para que, no se sobreescriba el objeto que no es color.
                    //contadoPalabras ++ -> 8 -- coche !- Si no tenenemos contador se sobreescribiría todo el rato es, mostrara el ultimo introducido.
                    //contadorPalabras ++ -> 9 -- movil
            }
        }

        System.out.println(Arrays.toString(arrayOrdenado));
    }
}
