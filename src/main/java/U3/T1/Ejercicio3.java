package U3.T1;
import java.util.Scanner;
//Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
// Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
// Además, hemos de pasarle a la función el radio de la base y la altura.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime la radio: ");
        double radio = teclado.nextDouble();

        System.out.print("Dime la altura: ");
        double altura = teclado.nextDouble();

        System.out.println("1- área");
        System.out.println("2- volumen");
        System.out.print("Que quieres calcular: ");
        int numeroIntroducido = teclado.nextInt();

        areaOvolumen(numeroIntroducido,radio,altura);
    }
    static void areaOvolumen(int numeroIntroducido, double radio, double altura){
        switch (numeroIntroducido){
            case 1:
                System.out.print((2*Math.PI*radio*(altura+radio)));
                break;
            case 2:
                System.out.print(Math.PI*Math.pow(radio,2)*altura);
                break;
        }
    }
}
