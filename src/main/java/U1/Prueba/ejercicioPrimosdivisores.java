package U1.Prueba;

import java.util.Scanner;
//Saca el contador de cuantos primos son divisores de un numero.
public class ejercicioPrimosdivisores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int numeroIntroducido = teclado.nextInt();
        int contadorPrimos = 0;

        for (int i = 2; i < numeroIntroducido; i++) {
            if (numeroIntroducido % i == 0){
                boolean es_primo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        es_primo = false;
                        break;
                    }
                  }
                if (es_primo){
                    contadorPrimos ++;
                    System.out.println(i);
                }
            }
        }
        System.out.print(contadorPrimos);
    }
}
