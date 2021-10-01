package U1.T5B;

import java.util.Scanner;

//Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero de la semana: ");
        int numeroDia = teclado.nextInt();

        switch (numeroDia){
            case 1: System.out.println("Programacion"); break;
            case 2: System.out.println("SistemasInformaticos"); break;
            case 3: System.out.println("Programacion"); break;
            case 4: System.out.println("EntornoDesarrollo"); break;
            case 5: System.out.println("BaseDatos"); break;
        }
    }
}
