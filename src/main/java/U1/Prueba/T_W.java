package U1.Prueba;

import java.util.Scanner;

public class T_W {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ((altura*2)+4)+altura*4; j++) {
                if ((i == 0) && (j < altura*2)){
                    System.out.print("*");
                }else if(j == altura-1){
                    System.out.print("*");
                }else if(j == altura*2+4+i){
                    System.out.print("*");
                }else if(j == (altura*2)+4+altura*2-i-1){
                    System.out.print("*");
                }else if(j == (altura*2)+4+altura*2-1+i){
                    System.out.print("*");
                }else if (j==(altura*2+4)+ (altura*4-i-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
