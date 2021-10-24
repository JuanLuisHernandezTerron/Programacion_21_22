package U1.Prueba;

import java.util.Scanner;

public class romboDenuevo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura que quieres: ");
        int altura = teclado.nextInt();

            for (int i = 0; i < altura/2; i++) {
                for (int j = 0; j < altura; j++) {
                    if (j == altura / 2 - i) {
                    System.out.print("*");
                    } else if (j == altura / 2 + i) {
                    System.out.print("*");
                    } else {
                    System.out.print(" ");
                    }
                }
            System.out.println();
        }
        for (int i = 0; i < altura/2; i++) {
            for (int j = 0; j < altura; j++) {
                    if ( i==j ) {
                        System.out.print("*");
                    } else if (i == altura){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
