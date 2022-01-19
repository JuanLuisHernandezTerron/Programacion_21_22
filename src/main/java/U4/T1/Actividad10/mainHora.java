package U4.T1.Actividad10;

import java.util.Scanner;

public class mainHora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la hora que es:");
        int hora = teclado.nextInt();

        System.out.print("Dime los segundos que quieres añadir:");
        int segundos = teclado.nextInt();

        hora hora1 = new hora(hora,segundos);

        System.out.println("La hora sin minutos es:"+hora+":"+segundos+"(segundos)");
        hora1.setSegundo(220);
        hora1.anadirSegundos();
        hora1.getInformacion();
    }
}
