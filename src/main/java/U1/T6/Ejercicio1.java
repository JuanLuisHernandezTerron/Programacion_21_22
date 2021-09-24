package U1.T6;
//Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes.
// Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre".

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el numero del mes que quieres que te saque");
        int numeroMes = teclado.nextInt();

        switch (numeroMes){
            case 1: System.out.println("Es el mes de Enero"); break;
            case 2: System.out.println("Es el mes de Febrero"); break;
            case 3: System.out.println("Es el mes de Marzo"); break;
            case 4: System.out.println("Es el mes de Abril"); break;
            case 5: System.out.println("Es el mes de Mayo"); break;
            case 6: System.out.println("Es el mes de Junio"); break;
            case 7: System.out.println("Es el mes de Julio"); break;
            case 8: System.out.println("Es el mes de Agosto"); break;
            case 9: System.out.println("Es el mes de Septiembre"); break;
            case 10: System.out.println("Es el mes de Octubre"); break;
            case 11: System.out.println("Es el mes de Noviembre"); break;
            case 12: System.out.println("Es el mes de Diciembre"); break;
        }
    }
}
