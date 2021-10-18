package U1.Prueba;

import java.util.Scanner;

//Escribe un programa que pinte por pantalla la letra V. El ancho del palo de la V es siempre de 3
//asteriscos. El usuario debe introducir la altura. La altura mínima es de 3 pisos. Si el usuario introduce una
//altura menor, el programa debe mostrar un mensaje de error.
//Ejemplo 1:
//Introduzca la altura de la V (un número mayor o igual a 3): 7
//        *** ***
//        *** ***
//        *** ***
//        *** ***
//     ***      ***
//      ***    ***
//        ******
public class ejercicioV {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura de la V: ");
        int altura = teclado.nextInt();

        while (altura < 3) {
            System.out.print("Altura introducida equivocada, introduce de nuevo la altura: ");
            altura = teclado.nextInt();
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2; j++) {
                    if (j == i) {
                        System.out.print("***");
                    } else if (j == altura * 2 - 1 - i) {
                        System.out.print("***");
                    }else{
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
}