package U3.Varios.Arrays;

import java.util.Scanner;

//Un restaurante nos ha encargado una aplicación para colocar a los clientes en
//sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
//(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
//el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
//un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
//“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
//como máximo e intente de nuevo”. Para el grupo que llega, se busca
//siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
//busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
//dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
//las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
//nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
//pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
//programa se ilustra a continuación:
//
//Ejemplo:
//┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
//│Mesa no  │  1 │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │
//├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
//│Ocupación│  3 │  2 │  0 │  2 │  4 │  1 │  0 │  2 │  1 │  1 │
//└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
//¿Cuántos son? (Introduzca -1 para salir del programa): 2
//Por favor, siéntense en la mesa número 3.
//┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
//│Mesa no  │  1 │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │
//├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
//│Ocupación│  3 │  2 │  2 │  2 │  4 │  1 │  0 │  2 │  1 │  1 │
//└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
//¿Cuántos son? (Introduzca -1 para salir del programa): 4
//Por favor, siéntense en la mesa número 7.
//┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
//│Mesa no  │  1 │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │
//├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
//│Ocupación│  3 │  2 │  2 │  2 │  4 │  1 │  4 │  2 │  1 │  1 │
//└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
//¿Cuántos son? (Introduzca -1 para salir del programa): 3
//Tendrán que compartir mesa. Por favor, siéntense en la mesa número 6.
//┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
//│Mesa no  │  1 │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │
//├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
//│Ocupación│  3 │  2 │  2 │  2 │  4 │  4 │  4 │  2 │  1 │  1 │
//└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
//¿Cuántos son? (Introduzca -1 para salir del programa): 4
//Lo siento, en estos momentos no queda sitio.
//┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
//│Mesa no  │  1 │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │
//├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
//│Ocupación│  3 │  2 │  2 │  2 │  4 │  4 │  4 │  2 │  1 │  1 │
//└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
//¿Cuántos son? (Introduzca -1 para salir del programa): -1
//Gracias. Hasta pronto.
public class ejercicio1_entregable_19_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int clientela = 0;
        int [][]arrayMesas = new int [2][10];
        rellernarArray(arrayMesas);

        while (clientela != -1){
            for (int i = 0; i < arrayMesas.length; i++) {
                for (int j = 0; j < arrayMesas[i].length; j++) {
                    System.out.print(" | " + arrayMesas[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.print("¿Cuantos son? (Introduzca -1 para salir del programa):");
            clientela = teclado.nextInt();
            if (clientela <= 4){
                introducirMesas(arrayMesas, clientela);
            }else if (clientela > 4){
                System.out.println("Haz grupo de 4 personas");
            }
        }
        System.out.println("Gracias y vuelva pronto");
    }


    private static void introducirMesas(int[][] arrayMesas, int clientela) {
        int contadorLleno = 0;

        for (int i = 0; i < arrayMesas.length; i++) {
            boolean esta_lleno = false;
            for (int j = 0; j < arrayMesas[i].length; j++) {
                    if (arrayMesas[i][j] == 4){
                        contadorLleno ++;
                    }
                    if (arrayMesas[i][j] + clientela <= 4){
                        if (i == 1){
                            arrayMesas[i][j] = arrayMesas[i][j] + clientela;
                            break;
                        }
                    }
                    if (contadorLleno == 10){
                        esta_lleno = true;
                    }
            }
            if (esta_lleno){
                clientela = -1;
            }
        }
    }

    private static void rellernarArray(int[][] arrayMesas) {
        for (int i = 0; i < arrayMesas.length; i++) {
            for (int j = 0; j < arrayMesas[i].length; j++) {
                if (i == 0){
                    arrayMesas[i][j] = j+1; //del 1 al 10 en columnas.
                }else if (i == 1){
                    arrayMesas[i][j] = (int) (Math.random()*5);
                }
            }
        }
    }
}
