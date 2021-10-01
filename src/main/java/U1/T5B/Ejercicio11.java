package U1.T5B;

import java.util.Scanner;

// Realiza un minicuestionario con 10 preguntas tipo test sobre las
// asignaturas que se imparten en el curso. Cada pregunta acertada sumará un punto.
// El programa mostrará al final la calificación obtenida. Pásale el minicuestionario a tus
// compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes
// asignaturas del curso.
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int contadorCorrecto = 0;

    System.out.print("Cuanto es 2 + 2: ");
    int respuesta1 = teclado.nextInt();

    if (respuesta1 == 4) {
      contadorCorrecto++;
    }
    System.out.print("Cuanto es 7 - 2: ");
    int respuesta2 = teclado.nextInt();

    if (respuesta2 == 5) {
      contadorCorrecto++;
    }
    System.out.print("Cuanto es 6 - 4: ");
    int respuesta3 = teclado.nextInt();

    if (respuesta3 == 2) {
      contadorCorrecto++;
    }
    System.out.print("Cuanto es 9 - 5: ");
    int respuesta4 = teclado.nextInt();

    if (respuesta4 == 4) {
      contadorCorrecto++;
    }
    System.out.print("Cuanto es 15 - 3: ");
    int respuesta5 = teclado.nextInt();

    if (respuesta5 == 12) {
      contadorCorrecto++;
    }
    System.out.print("Cuanto es 3 - 2: ");
    int respuesta6 = teclado.nextInt();
    if (respuesta6 == 1) {
      contadorCorrecto++;
    }
    System.out.print("Cuanto es 10 - 7");
    int respuesta7 = teclado.nextInt();
    if (respuesta7 == 3) {
      contadorCorrecto++;
    }
    System.out.print("Cuanto es 5 - 1: ");
    int repuesta8 = teclado.nextInt();
    if (repuesta8 == 4) {
      contadorCorrecto++;
    }
    System.out.print("Cuanto es 12 - 6: ");
    int respuesta9 = teclado.nextInt();
    if (respuesta9 == 6) {
      contadorCorrecto++;
    }
    System.out.print("Cuanto es 21 - 2: ");
    int respuesta10 = teclado.nextInt();
    if (respuesta10 == 19) {
      contadorCorrecto++;
    }

    System.out.println("Has sacado " + contadorCorrecto + "correctos");
  }
}
