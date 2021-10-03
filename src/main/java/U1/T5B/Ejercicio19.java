package U1.T5B;

import java.util.Scanner;

// Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y
// minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de
// semana comienza el viernes a las 15:00h. Se da
// por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h
public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Dime el dia de la semana: ");
    String diaSemana = teclado.next().toLowerCase(); //LowerCase, te convierte lo introducido en minuscula.

    System.out.print("Dime la hora que es: ");
    int hora = teclado.nextInt();
    System.out.print("Dime el minuto que es: ");
    int minutos = teclado.nextInt();

    int horasMinutos = hora * 60;
    int horaDiferencia = 24 * 60;
    int minutosDiferencia = 0;
    int sumaMinutos = 0;
    int minutosViernes = 15 * 60; //Calcula los minutos que son hasta las 3 del medio dia del viernes;
    int restaMinutos = 0;

    switch (diaSemana){
      case "lunes" :
          sumaMinutos = horasMinutos + minutos; //pase de la hora y minutos pasado a minutos.
          minutosDiferencia = horaDiferencia * 4; //Calcula los minutos desde el lunes hasta el viernes.
          restaMinutos = minutosViernes + minutosDiferencia - sumaMinutos;
        System.out.println("Quedan "+ restaMinutos + "minutos");
        break;
      case "martes" :
        sumaMinutos = horasMinutos + minutos; //pase de la hora y minutos pasado a minutos.
        minutosDiferencia = horaDiferencia * 3; //Calcula los minutos desde el martes hasta el viernes.
        restaMinutos = minutosViernes + minutosDiferencia - sumaMinutos;
        System.out.println("Quedan "+ restaMinutos + "minutos");
        break;
      case "miercoles" :
        sumaMinutos = horasMinutos + minutos; //pase de la hora y minutos pasado a minutos.
        minutosDiferencia = horaDiferencia * 2; //Calcula los minutos desde el miercoles hasta el viernes.
        restaMinutos = minutosViernes + minutosDiferencia - sumaMinutos;
        System.out.println("Quedan "+ restaMinutos + "minutos");
        break;
      case "jueves" :
        sumaMinutos = horasMinutos + minutos; //pase de la hora y minutos pasado a minutos.
        minutosDiferencia = horaDiferencia * 1; //Calcula los minutos desde el jueves hasta el viernes.
        restaMinutos = minutosViernes + minutosDiferencia - sumaMinutos;
        System.out.println("Quedan "+ restaMinutos + "minutos");
        break;
      case "viernes" :
        sumaMinutos = horasMinutos + minutos; //pase de la hora y minutos pasado a minutos.
        restaMinutos = minutosViernes + minutosDiferencia - sumaMinutos;
        System.out.println("Quedan "+ restaMinutos + "minutos");
        break;
    }
  }
}
