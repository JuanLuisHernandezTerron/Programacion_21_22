package U3.T3extra;

import java.util.Arrays;
import java.util.Scanner;

//Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una mesa se
// pueden sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
//
//Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para
// colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6,
// el programa dará el mensaje“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo
// e intente de nuevo”. Para el grupo que llega, se buscasiempre la primera mesa libre (con 0 personas).
//
// Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es
// dedos personas, se podrá colocar donde haya una o dos personas. Inicialmente,las mesas se cargan con
// valores aleatorios entre 0 y 4.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] arrayMesas = mesasAleatorias();


        int clientes = 0;

        while (clientes != -1){
            boolean estaIncompleto = true;
            while (clientes <=4 ){
                int sumasMesas = 0;
                boolean clienteIntroducido = false;
                System.out.println(Arrays.toString(arrayMesas));
                System.out.println("Hola buenas, cuantos son? (Introduzca -1 para salir del programa): ");
                clientes = teclado.nextInt();
                for (int i = 0; i < arrayMesas.length; i++) {
                    sumasMesas = arrayMesas[i] + clientes;
                    if (sumasMesas > 4){

                    }else if(sumasMesas <=4 && clienteIntroducido==false){
                        arrayMesas[i] = arrayMesas[i] + clientes;
                        clienteIntroducido = true;
                    }
                }
            }
            System.out.println("No puede ser grupos de "+clientes+" Haced un grupo de 4 como maximo y intentalo de nuevo");
            System.out.println("Hola buenas, cuantos son? (Introduzca -1 para salir del programa): ");
            clientes = teclado.nextInt();
            for (int i = 0; i < arrayMesas.length; i++) {
                if (arrayMesas[i] != 4){
                    estaIncompleto = true;
                }
            }
            if (!estaIncompleto){
                clientes = -1;
                System.out.println("El restaurante está lleno, vuelva otro día");
            }
        }
    }

    private static int[] mesasAleatorias() {
        int [] arrayVacio = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayVacio[i] = (int) (Math.random()*5);
        }
        return arrayVacio;
    }
}
