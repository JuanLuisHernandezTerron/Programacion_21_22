package U3.T3extra;

import java.util.Scanner;

//Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una mesa se
// pueden sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
//
//Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para
// colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6,
// el programa dará el mensaje“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo
// e intente de nuevo”. Para el grupo que llega, se buscasiempre la primera mesa libre (con 0 personas).
//
//Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es
// dedos personas, se podrá colocar donde haya una o dos personas. Inicialmente,las mesas se cargan con
// valores aleatorios entre 0 y 4.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola buenas, cuantos son? (Introduzca -1 para salir del programa): ");
        int clientes = teclado.nextInt();

       int [] arrayMesas = new int [10];

        for (int i = 0; i < arrayMesas.length; i++) {

        }


    }
}
