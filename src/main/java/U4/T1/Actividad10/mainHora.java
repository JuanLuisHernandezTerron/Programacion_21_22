package U4.T1.Actividad10;

import java.util.Scanner;

public class mainHora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la hora que es:");
        int hora = teclado.nextInt();

        System.out.print("Dime los minutos:");
        int minutos = teclado.nextInt();

        System.out.print("Dime los segundos:");
        int segundos = teclado.nextInt();

        hora hora1 = new hora(hora,minutos,segundos);

        System.out.println("La hora sin minutos es: "+hora+":"+minutos+":"+segundos);
        hora1.anadirSegundos(20);
        hora1.getInformacion();
    }
}
