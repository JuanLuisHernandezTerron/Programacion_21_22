package U1.Prueba;

import javax.swing.*;
import java.util.Scanner;

//Ejercicio 3(Ej3.java):
//Ahora que se acerca la notería de Navidad queremos saber si un número va a proporcionar suerte a un usuario.
// Solicitaremos a un usuario cuáles son sus 3 números favoritos y para calcular  si un número le va a dar
// suerte dicho número tendrá más ocurrencias de esos números que de los demás.
//
//Ejemplo 1:
//
//Introduzca sus números favoritos 1:
//
//3
//
//5
//
//7
//
//Introduzca el número de la lotería: 74123
//
//Ese número no le va a dar suerte
//
//Ejemplo 2:
//
//Introduzca sus números favoritos 1:
//
//3
//
//5
//
//7
//
//Introduzca el número de la lotería: 55173
//
//Ese número le va a dar suerte.
public class Ejercicio3_Entregable2020 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime tu primer numero favorito: ");
        int numeroFavorito1 = teclado.nextInt();

        System.out.print("Dime tu segundo numero favorito: ");
        int numeroFavorito2 = teclado.nextInt();

        System.out.print("Dime tu tercer numero favorito: ");
        int numeroFavorito3 = teclado.nextInt();

        System.out.print("Dime el numero de la loteria");
        int numeroLoteria = teclado.nextInt();

        int cociente = numeroLoteria;
        int resto = 0;
        int contador = 0;
        int contadorNumeroSinsuerte = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            if (resto == numeroFavorito1){
                contador ++;
            }else if (resto == numeroFavorito2){
                contador ++;
            }else if (resto == numeroFavorito3){
                contador ++;
            }else{
                contadorNumeroSinsuerte ++;
            }
        }

        if (contador > contadorNumeroSinsuerte){
            System.out.println("Tienes suerte con ese numero");
        }else{
            System.out.println("Ese numero no te va a dar suerte");
        }
    }
}
