package U1.Prueba;
//Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
// El programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para
// simular la curvatura de las esquinas inferiores.

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime la altura");
    int altura = teclado.nextInt();

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura; j++) {
        if (i < altura - 1) {
              if (j == 0) {
                System.out.print("*");
              } else if (j == altura - 1) {
                System.out.print("*");
              }else if ((j > 0) && (j < altura - 1)){
                  System.out.print(" ");
              }

              if ((j > 0) && (j < altura - 1)) {
                System.out.print(" ");
              }
        }

            if (i == altura-1){
                if (j == 0){
                    System.out.print(" ");
                }else if ( j == altura-1){
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
