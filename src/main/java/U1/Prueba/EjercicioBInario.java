package U1.Prueba;

import java.util.Scanner;

//Realiza un programa lea un número entero positivo de la pantalla y que lo pase a binario.
public class EjercicioBInario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero que quieras pasar a binario: ");
        long numeroIntroducido = teclado.nextLong();
        long restoDivision = 0;
        long binario = 0;
        long resto = 0;
        long binarioCorrecto = 0;

        while (numeroIntroducido > 0){
            restoDivision = numeroIntroducido%2;
            binario = binario + restoDivision;
            binario = binario * 10;
            numeroIntroducido = numeroIntroducido/2;
        }

        while (binario > 0){
            resto = binario % 10;
            binario = binario /10;
            binarioCorrecto = binarioCorrecto + resto;
            binarioCorrecto = binarioCorrecto * 10;
        }
        System.out.println(binarioCorrecto);
    }
}
