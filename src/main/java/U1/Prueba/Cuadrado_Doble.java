package U1.Prueba;

import java.util.Scanner;

public class Cuadrado_Doble {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*2+5; j++) {
                if (i <= altura/2){
                    if (j ==0){
                        System.out.print("*");
                    }else if((i == 0) && (j < altura-1)){
                        System.out.print("*");
                    }else if(j == altura-1){
                        System.out.print("*");
                    }else if(j == altura+5){
                        System.out.print("*");
                    }else if(j == altura*2+5-1){
                        System.out.print("*");
                    }else if((i == 0) &&(j > altura+5)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if (j == 0){
                        System.out.print("*");
                    }else if (j == altura-1){
                        System.out.print("*");
                    }else if (j == altura+5){
                        System.out.print("*");
                    }else if (j == altura*2+4){
                        System.out.print("*");
                    }else if ((i == altura -1) && (j < altura)){
                        System.out.print("*");
                    }else if ((i == altura-1) && (j > altura+4)){
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
