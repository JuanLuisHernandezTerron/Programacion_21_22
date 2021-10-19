package U1.Prueba;

import java.util.Scanner;

//Escribe un programa que pida un número entero positivo por teclado y que
//muestre a continuación los 5 números consecutivos a partir del número
//introducido (incluyendo él mismo). Al lado de cada número se debe indicar
//si se trata de un primo o no.
//
//Ejemplo:
//Por favor, introduzca un número entero positivo: 17
//17 es primo
//18 no es primo
//19 es primo
//20 no es primo
//21 no es primo
public class EjercicioEntregable4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero entero por favor: ");
        int numeroIntroducido = teclado.nextInt();

        for (int i = numeroIntroducido; i < numeroIntroducido+5 ; i++) {
            boolean es_primo = true;
            for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        es_primo = false;
                        break;
                    }
            }
            if (es_primo){
                System.out.println("El numero "+ i +" es primo");
            }else{
                System.out.println("El numero "+ i +" es no primo");
            }
        }
    }
}
