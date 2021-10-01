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



    System.out.print("Dime los minutos: ");
    int minutos = teclado.nextInt();

    int minutosAsegundos =  minutos * 60;;
    int horasAsegundos =  hora * 3600;
    int segundosTotal = minutosAsegundos + horasAsegundos;
    int segundosMedianoche = (24 * 3600) - segundosTotal;



    System.out.println("Quedan " + segundosMedianoche + " segundos para ser las 12");
  }
}
