package U1.T8;
//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aprobados = 0;
        int condicionados  = 0;
        int suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Dime varias notas");
            int notas = teclado.nextInt();
            while ((notas < 0) || (notas > 10)) {
                notas = 0;
            }
            if (notas >= 5) {
                aprobados++;
            } else if (notas == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Hay "+ aprobados + " aprabados");
        System.out.println("Hay " + suspensos + "suspensos" );
        System.out.println("Hay " +  condicionados +" condicionados");
    }
}
