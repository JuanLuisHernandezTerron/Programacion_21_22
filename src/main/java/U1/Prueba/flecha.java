package U1.Prueba;

import java.util.Scanner;

public class flecha {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.print("Dime la altura que quieres que tenga la flecha: ");
        int altura = teclado.nextInt();

        while(altura % 2 == 0){
            System.out.print("Dime la altura que quieres que tenga la flecha: ");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if ((j == altura/2) && (i == 0)){
                    System.out.print("*");
                }else if((j == altura/2) && (i == altura-1)){
                    System.out.print("*");
                }else if (j == altura/2 -i){
                    System.out.print("*");
                }else if( i == altura/2 +j){
                    System.out.print("*");
                }else if (j ==altura/2){
                    System.out.print("*");
                }else if(i == altura/2){
                    System.out.print(" *");
                }else if((j == altura/2) && (i==altura/2)){
                    System.out.print("");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
