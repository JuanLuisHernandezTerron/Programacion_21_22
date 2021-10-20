package U1.Prueba;

import java.util.Scanner;

//Escribe un programa que pinte por pantalla un par de calcetines, de los que se
// ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
//El usuario debe introducir la altura. Suponemos que el usuario introduce una
// altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
//que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
//
//Ejemplo 1:
//Introduzca la altura de los calcetines: 6
//
//***     ***
//***     ***
//***     ***
//***     ***
//******  ******
//******  ******
public class calcetines {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura del calcetin: ");
        int altura = teclado.nextInt();


        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < 14; j++) {
                if (i < altura-2){
                    if (j <= 2){
                        System.out.print("*");
                    }else if((j >=8) && (j <=10)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                      if ((j >= 0) && ( j <=5)){
                          System.out.print("*");
                      }else if (j>=8){
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
