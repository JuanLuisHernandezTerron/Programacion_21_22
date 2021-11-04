package U1.U1_EXAMEN;
//Escribe un programa que pinte por pantalla las letras AB. El usuario debe introducir
// la altura que deberá ser mayor que 3 e impar. Las letras estarán separadas por dos espacios
//
//Ejemplo 1:
//
//Introduzca la altura: 5
//
//    *      ****
//   * *     *   *
//  *   *    ****
// *******   *   *
//*       *  ****

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura");
        int altura = teclado.nextInt();

        while ((altura < 3) || (altura % 2== 0)){
            System.out.print("Dime la altura");
            altura = teclado.nextInt();
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*3+2; j++) {
                if (j == altura-i){
                    System.out.print("*");
                }else if(j == altura+i){
                    System.out.print("*");
                }else if((i == altura/2+1) && (j > 1) && (j < altura*2-1)){
                    System.out.print("*");
                }else if(j == altura*2+2){
                    System.out.print("*");
                }else if((i == altura-1) && (j > altura*2+2-1)){
                    System.out.print("*");
                }else if((i == 0) && (j > altura*2+2-1)){
                    System.out.print("*");
                }else if((i == altura/2) && (j > altura*2+2)){
                    System.out.print("*");
                }else if((j == altura*3+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
