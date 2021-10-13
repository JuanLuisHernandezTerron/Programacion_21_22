package U1.Prueba;

import java.util.Scanner;

//Realiza un programa que pinte por pantalla un rombo hueco hecho con
//asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
//sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
//mensaje de error y volverlo a pedir hasta que sea correcto.
//Ejemplo:
//Por favor, introduzca la altura del rombo: 5
//  *
// * *
//*   *
// * *
//  *
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura que quieres que tenga el rombo: ");
        int altura = teclado.nextInt();

        while (( altura % 2 == 0) || (altura <=3)){
            System.out.print("Dime la altura que quieres que tenga el rombo: ");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i==0) || (i==altura-1)){
                    if ( j == altura/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else if((j == altura/2 - i)){
                   System.out.print("*");
               }else if (j == altura/2 + i){
                   System.out.print("*");
               }else if(i == altura/2 + j){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }

            }
            System.out.println("");
        }
    }
}
