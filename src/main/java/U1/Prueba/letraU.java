package U1.Prueba;

import java.util.Scanner;

public class letraU {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura= teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(i < altura-1){
                    if (j ==0){
                        System.out.print("*");
                    }else if(j == altura-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else if(i == altura-1){
                        if ((i == altura-1) && (j==0)){
                            System.out.print(" ");
                        }else if (( i == altura-1) && (j == altura-1)){
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }
            }
            System.out.println();
        }
    }
}
