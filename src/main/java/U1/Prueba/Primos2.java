package U1.Prueba;

import java.util.Scanner;

public class Primos2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();

        boolean es_primo = true;
        for (int i = 2; i < numeroIntroducido; i++) {
            if (numeroIntroducido % i == 0){
                es_primo = false;
                break;
            }
        }
        if (es_primo){
            System.out.println("El numero "+ numeroIntroducido + " es primo");
        }else{
            System.out.println("El numero "+ numeroIntroducido + " no es primo");
        }
    }
}
