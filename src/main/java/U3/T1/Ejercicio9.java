package U3.T1;

import java.util.Scanner;

//Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos del número que se le
// pasa como parámetro
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el numero entero que vayas a introducir: ");
        int numeroIntroducido = teclado.nextInt();
        divisoresPrimos(numeroIntroducido);
    }

    static void divisoresPrimos(int numeroIntroducido){
        for (int i = 2; i < numeroIntroducido ; i++) {
            boolean es_primo = true;
            if (numeroIntroducido % i == 0){  //
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        es_primo = false;
                    }else{
                        es_primo = true;
                    }
                }
                if (es_primo == true){
                    System.out.println(i);
                }
            }
        }
    }
}
