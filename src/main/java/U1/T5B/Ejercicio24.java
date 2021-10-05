package U1.T5B;

import java.util.Scanner;

//Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y
// luego el usuario 2. Si alguno de los usuarios introduce una opción incorrecta,
// el programa deberá mostrar un mensaje de error.
//
//
//Ejemplo 1:
//Turno del jugador 1 (introduzca piedra, papel o tijera): papel
//Turno del jugador 2 (introduzca piedra, papel o tijera): papel
//Empate
//
//
//Ejemplo 2:
//Turno del jugador 1 (introduzca piedra, papel o tijera): papel
//Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
//Gana el jugador 2
//
//
//Ejemplo 3:
//Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
//Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
//Gana el jugador 1
public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String eleccionJugador1 = teclado.next();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String eleccionJugador2 = teclado.next();

        if (eleccionJugador1.equals("piedra") && (eleccionJugador2.equals("papel"))){
            System.out.println("Ha ganado el jugador nº2");
        }else if (eleccionJugador1.equals("papel") && (eleccionJugador2.equals("piedra"))){
            System.out.println("Ha ganado nº1");
        }else if (eleccionJugador1.equals("tijera") && (eleccionJugador2.equals("papel"))){
            System.out.println("Ha ganado nº1");
        }else if (eleccionJugador1.equals("papel") && (eleccionJugador2.equals("tijera"))){
            System.out.println("Ha ganado nº2");
        }else if (eleccionJugador1.equals("papel") && (eleccionJugador2.equals("papel"))){
            System.out.println("Empate");
        }else if (eleccionJugador1.equals("tijera") && (eleccionJugador2.equals("tijera"))) {
            System.out.println("Empate");
        }else if (eleccionJugador1.equals("piedra") && (eleccionJugador2.equals("piedra"))) {
            System.out.println("Empate");
        }
    }
}
