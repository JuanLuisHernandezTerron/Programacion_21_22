package U3.T2;

import java.util.Scanner;

//Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, debe insertar otra
// intentando acertarla con las pistas que le dará el programa: número de caracteres, primera y última letra.
// El programa debe escribir "Acertaste" o "Fallaste".
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una contraseña: ");
        String contrasena = teclado.nextLine();

        int longitudContrasena = contrasena.length();
        char primeraLetra = contrasena.charAt(0);
        char ultimaLetra = contrasena.charAt(longitudContrasena-1);
        System.out.println("La contraseña tiene " + longitudContrasena + " caracteres" + " ,su primera letra es "+ primeraLetra + " y su ultima letra es " + ultimaLetra);
        System.out.println("Acierta la contraseña: ");
        String acertarOno = teclado.nextLine();

        if (acertarOno.equalsIgnoreCase(contrasena)){
            System.out.println("Has acertado");
        }else{
            System.out.println("Fallaste");
        }
    }
}
