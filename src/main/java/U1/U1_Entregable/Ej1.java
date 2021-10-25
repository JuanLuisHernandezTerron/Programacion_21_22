package U1.U1_Entregable;

import java.util.Scanner;

//Dibuja por pantalla la palabra MY (en mayúsculas) hechas de asteriscos separadas por 4 espacios.
// La anchura y altura de cada una de las letras deberá ser la misma. Se solicitará al
// usuario una altura que deberá siempre impar y mayor que 3. En caso de que el usuario no
// introduzca un valor correcto, se pedirá de nuevo la altura.
//
//Ejemplo 1:
//
//Introduzca una altura: 5
//
//*   *    *   *
//** **     * *
//* * *      *
//*   *      *
//*   *      *
public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura");
        int altura = teclado.nextInt();

        while ((altura % 2 == 0) || (altura < 4)) {
            System.out.print("Dime la altura");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura * 2)+4; j++) {
                if (i <= altura / 2) {
                    if (j == 0) {
                        System.out.print("*");
                    } else if (j == altura-1) {
                        System.out.print("*");
                    } else if(j == altura +3 +i){
                        System.out.print("*");
                    }else if (j == i){
                        System.out.print("*");
                    }else if (j == altura -1 -i){
                        System.out.print("*");
                    }else if(j == altura*2 +2 -i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if (j ==0){
                        System.out.print("*");
                    }else if (j == altura-1){
                        System.out.print("*");
                    }else if( j == altura+3 + (altura/2)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}