package U1.Prueba;

import java.util.Scanner;

public class Cuadrado_Doble {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*2+5; j++) {
                if (j == 0){
                    System.out.print("*");
                }else if (j == altura){
                    System.out.print("*");
                }else if ((i == 0) && (j < altura) ){
                    System.out.print("*");
                }else if ((i == altura -1) && (j < altura)){
                    System.out.print("*");
                }else if(j == altura*2 +4 -i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
