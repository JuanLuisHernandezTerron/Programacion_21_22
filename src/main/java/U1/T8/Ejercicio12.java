package U1.T8;
//Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no lo hay.
// Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean suspensos = false;


        for (int i = 1; i <= 5; i++) {
            System.out.print("Dime 5 notas por favor: ");
            double notas = teclado.nextDouble();

            if (notas < 5){
                suspensos = true;
            }
        }
        if (suspensos == true){
            System.out.println("Has suspendido algún alumno");
        }else{
            System.out.println("Han aprobado");
        }
    }
}
