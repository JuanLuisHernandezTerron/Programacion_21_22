package U1.Prueba;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime hasta que numero quieres saner si es primo: ");
        int numeroIntroducido = teclado.nextInt();

        for (int i = 2; i < numeroIntroducido; i++) {
            boolean es_primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    es_primo = false;
                    break;
                }
            }
            if (es_primo){
                System.out.println("Los numeros primos son: " +i );
            }else{
                System.out.println("Y los no primos son: " +i);
            }
        }
    }
}
