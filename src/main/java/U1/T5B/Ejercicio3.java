package U1.T5B;
//Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el dia de la semana (numero): ");
        int numeroDia = teclado.nextInt();

        switch (numeroDia){
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo"); break;

        }
    }
}
