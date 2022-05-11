package U1.T8B;

import java.util.Scanner;
//Realiza un programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
// No se tendrán en cuenta los minutos ni los segundos.
// El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena
// (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce los datos
// correctamente y que el segundo día es posterior al primero.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int hora1 = 0;
        int dia1 = 0;


        int hora2 = 0;
        int dia2 = 0;


       while ((dia1 < 1 || dia1 > 7) || (dia2 < 1 || dia2 > 7)){

           System.out.println("Dime primero la hora y luego el dia");
           hora1 = teclado.nextInt();
           dia1 = teclado.nextInt();

           System.out.println("Dime la hora y el dia del que quieres saber la diferencia");
           hora2 = teclado.nextInt();
           dia2 = teclado.nextInt();
       }

        int horasDiferencia = hora1 - hora2;
        int diasDiferencia = dia2 - dia1; // martes hora: 8 || jueves hora: 2
        int horasdiferenciaDia = diasDiferencia * 24;

       if ( hora2 > hora1 ){
           horasdiferenciaDia = horasdiferenciaDia + horasDiferencia;
           System.out.println("Hay de diferencias" + horasdiferenciaDia + " horas");
       }else{
           horasdiferenciaDia = horasdiferenciaDia - horasDiferencia;
           System.out.println("Hay de diferencias" + horasdiferenciaDia + " horas");
       }
    }
}
