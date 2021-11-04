package U1.Prueba;

import java.util.Scanner;

public class arbolNavidadRelleno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura+4; i++) {
            for (int j = 0; j < altura*2; j++) {
                if (( j >= altura-i) && (j <= altura +i)&& (i < altura)){
                    System.out.print("*");
                }else if (( i > altura-1) && (j >= altura-1) && (j <=altura+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
