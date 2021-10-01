package U1.T5B;
// Escribe un programa que dada una hora determinada (horas y minutos),
// calcule los segundos que faltan para llegar a la medianoche.
// medianoche = 12 noche;
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Dime la hora: ");
    int hora = teclado.nextInt();

    int horasDiferencias = 24 - hora;

    System.out.print("Dime los minutos: ");
    int minutos = teclado.nextInt();

    int horasAminutos = 0;
    int minutosAsegundos = 0;
    horasAminutos = horasDiferencias * 60;
    minutos = minutos + horasAminutos;
    minutosAsegundos = minutos * 60;

    System.out.println("Quedan " + minutosAsegundos + "segundos para ser las 12");
  }
}
