package U1.Prueba;

import java.util.Scanner;

public class arbolNavidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura del arbol de navidad: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < altura*2; j++) {
                if ((j == altura)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < altura+3; i++) {
            for (int j = 0; j < altura*2; j++) {
                 if((j==altura-i) && (i < altura)){
                    System.out.print("*");
                }else if (j==altura+i){
                     System.out.print("*");
                }else if((i == altura-1) && (j > 0)){
                     System.out.print("*");
                }else if((i > altura-1) && (j == altura)){
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
