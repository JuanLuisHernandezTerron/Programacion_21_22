package U1.U1_Entregable;

import java.util.Scanner;

//Escribe un programa que solicite al usuario los siguientes números:
//
//Un número entero positivo
//Un número entre 0 y 2 (ambos inclusive)
//Una vez introducidos los dos números nos debe construir un
// número saltando las cifras según indique el segundo número.
//Escribe un programa que solicite al usuario los siguientes números:
//
//Un número entero positivo
//Un número entre 0 y 2 (ambos inclusive)
//Ejemplo 1:
//
//Introduzca un número: 3456759
//Introduzca el salto: 1
//Resultado: 3579
//Ejemplo 2:
//
//Introduzca un número: 3456759
//Introduzca el salto: 2
//Resultado: 369
public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un numero entero: ");
        long numeroIntroducido = teclado.nextInt();

        System.out.print("Dime cuantos saltos quieres que haga (1 o 2): ");
        long saltos = teclado.nextInt();

        long cociente = numeroIntroducido;
        long resto = 0;
        long numeroAUX = 0;
        int contador = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX * 10;
        }
        numeroAUX=numeroAUX /10;

        while(numeroAUX > 0){
            resto= numeroAUX % 10;
            numeroAUX = numeroAUX /10;
                if (saltos == contador){
                  contador = 0;
                }else{
                    cociente = cociente + resto;
                    cociente = cociente * 10;
                    contador ++;
                }
        }
        System.out.print(cociente/10);
    }
}
