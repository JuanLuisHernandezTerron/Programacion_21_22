package U1.Prueba;

import java.util.Scanner;

//Crear programa que pinte una flecha doble hacia la izquierda. Se pide al usuario la altura de la figura, que debe ser un número impar mayor o igual que 3. La distancia entre cada flecha de asteriscos es siempre de 5 espacios. Si la altura introducida por el usuario no es un número impar mayor o igual que 3, el programa debe mostrar un mensaje de error.
//Introduce la altura de la flecha: 7
public class flechasIzquierda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura = teclado.nextInt();

        while ((altura % 2 != 0) && (altura < 2)) {
            System.out.print("Dime la altura: ");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i < altura / 2) {
                    if (j == altura / 2 - i) {
                        System.out.print("*");
                    }else if(j == altura-1 -i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if (i == altura / 2 + j) {
                        System.out.print("*");
                    }else if (i+3 == altura / 2 + j){
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
