package U1.T5B;

import java.util.Scanner;

// Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras.
// Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
// horas ordinarias
// (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
// euros la hora.
//
// Ejemplo 1:
// Por favor, introduzca el número de horas trabajadas durante la semana: 36
// El sueldo semanal que le corresponde es de 432 euros
public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Dime las horas que has trabajado en la semana: ");
    int numeroHoras = teclado.nextInt();

    int trabajado40H = numeroHoras * 12;
    int restaHoras = numeroHoras - 40;
    int trabajado41H = (restaHoras * 16) + 480;

    if ((numeroHoras >= 0) && (numeroHoras <= 40)) {
      System.out.print("El sueldo semanal que le corresponde es de: " + trabajado40H);
    } else if (numeroHoras >= 41) {
      System.out.println(trabajado41H);
    } else {
      System.out.print("Dime las horas que has trabajado en la semana: ");
      numeroHoras = teclado.nextInt();
    }
  }
}
