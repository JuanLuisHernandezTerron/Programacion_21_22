package U1.Prueba;

import java.util.Scanner;

//Realizar un programa que dibuja flechas señalando hacia la izquierda. Se solicitará al usuario la altura de la
// flecha que deberá ser impar y mayor o igual que tres. En caso de no ser así se seguirá solicitando la altura:
//
//El "palito" de la flecha será siempre de 5 caracteres "*"
public class flecha_rellena {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.print("Dime la altura que quieres que tenga la flecha: ");
        int altura = teclado.nextInt();

        while((altura % 2 != 0) && ( altura < 3)){
            System.out.print("Dime la altura que quieres que tenga la flecha: ");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*2; j++) {
                if (i <= altura/2){
                    if ((j >= altura/2 -i) && (j <= altura/2)){
                        System.out.print("*");
                    }else if ((i == altura/2) && (j > altura/2) && (j <= altura/2 +5)){
                        System.out.print("*");
                    }else if( j==altura/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if ((i <= altura/2 +j) && (j <= altura/2)){
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
