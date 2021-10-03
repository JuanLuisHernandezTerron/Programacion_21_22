package U1.T5B;

import java.util.Scanner;

// Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas
// que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un
// número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media
// sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se
// califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado
// de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un
// 5; en caso contrario, se  mantiene la nota media anterior:
//
// Ejemplo 1:
// Nota del primer control: 7
// Nota del segundo control: 10
// Tu nota de Programación es 8.5
// Ejemplo 3:
// Nota del primer control: 6
// Nota del segundo control: 3
// ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
// Tu nota de Programación es 4.5

public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double notaSumadas = 0;
    double mediaNotas = 0;

    boolean aptoNoapto = false;
    for (int i = 0; i < 2; i++) {
      System.out.println("Dime las 2 notas que has sacado en los 2 controles");
      double notaSacadas = teclado.nextDouble();
      notaSumadas = notaSumadas + notaSacadas;
    }

    mediaNotas = notaSumadas / 2;
    if (mediaNotas >= 5){
      System.out.print("Estas aprobado, la media es: "+ mediaNotas);
    }else if (mediaNotas < 5){
      System.out.println("Cual ha sido el resultado de la recuperacion");
      String resultadoRecu = teclado.next();
      aptoNoapto = resultadoRecu.equalsIgnoreCase("apto")?true : false;
    }

    if (aptoNoapto == true){
      System.out.println("Tu nota de Programación es 5");
    }else{
      System.out.println("Tu nota de Programación es: " + mediaNotas);
    }
  }
}
