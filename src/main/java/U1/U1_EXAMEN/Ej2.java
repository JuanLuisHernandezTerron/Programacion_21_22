package U1.U1_EXAMEN;

import java.util.Scanner;

//Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un
// número entero introducido por teclado. El orden es el que se muestra en los ejemplos.
// Utiliza el tipo long para que el usuario pueda introducir números largos.
//
//Ejemplo 1:
//
//Introduzca un número entero: 67706
//Dígitos que aparecen en el número: 0 6 7
//Dígitos que no aparecen: 1 2 3 4 5 8 9
public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numeroIntroducido = teclado.nextInt();

        int resto = 0;
        int cociente = numeroIntroducido;
        int numeroAUX = 0;
        int numerosNoIntroducidos = 0;

        while( cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX *10;
        }
        numeroAUX = numeroAUX / 10;

        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX = numeroAUX /10;
            for (int i = 0; i < 10; i++) {
                if (resto == i){
                    numeroAUX = numeroAUX + resto;
                    numeroAUX = numeroAUX * 10;
                }else{
                    numerosNoIntroducidos = numerosNoIntroducidos + i;
                    numerosNoIntroducidos = numerosNoIntroducidos * 10;
                }
            }
            System.out.println("Los digitos que aparecen son: "+ numeroIntroducido);
            System.out.println("Los numeros no introducidos son: "+numerosNoIntroducidos/10);
            break;
        }
    }
}
