package U1.T5B;
import java.util.Scanner;
// Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime el dia que naciste: ");
        int diaNacimiento = teclado.nextInt();

        System.out.print("Dime en que mes naciste: ");
        int mesNacimiento = teclado.nextInt();

        switch (mesNacimiento){
            case 1: if (diaNacimiento < 21){
                    System.out.println("Capricornio");
            }else{
                System.out.println("Acuario");
            } break;
            case 2: if (diaNacimiento > 18){
                System.out.println("Piscis");
            }else{
                System.out.println("Capricornio"); 
            }break;
            case 3: if (diaNacimiento > 20){
                System.out.println("Aries");
            }else{
                System.out.println("Piscis");
            }break;
            case 4: if (diaNacimiento > 20){
                System.out.println("Tauro");
            }else{
                System.out.println("Aries");
            }break;
            case 5: if (diaNacimiento > 21){
                System.out.println("Geminis");
            }else{
                System.out.println("Aries");
            }break;
            case 6: if (diaNacimiento > 21){
                System.out.println("Cancer");
            }else{
                System.out.println("Geminis");
            }break;
            case 7: if (diaNacimiento > 23){
                System.out.println("Leo");
            }else{
                System.out.println("Cancer");
            }break;
            case 8: if (diaNacimiento > 23){
                System.out.println("Virgo");
            }else{
                System.out.println("Leo");
            }break;
            case 9: if (diaNacimiento > 23){
                System.out.println("Libra");
            }else{
                System.out.println("Virgo");
            }break;
            case 10: if (diaNacimiento > 23){
                System.out.println("Escorpio");
            }else{
                System.out.println("Libra");
            }break;
            case 11: if (diaNacimiento > 22){
                System.out.println("Sagitario");
            }else{
                System.out.println("Escorpio");
            }break;
            case 12: if (diaNacimiento > 22){
                System.out.println("Capricornio");
            }else{
                System.out.println("Sagitario");
            }break;
        }
    }
}
