package U1.Prueba;

import java.util.Scanner;

public class darVueltanumero_y_primos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero para recorrer y darle la vuelta: ");
        int numeroIntroducido = teclado.nextInt();

        int cociente = numeroIntroducido;
        int resto = 0;
        int numeroAux = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAux = numeroAux * 10 + resto;  //con esto damos la vuelta a un numero
        }
        System.out.println("El numero dado la vuelta sería "+numeroAux);

        for (int i = 2; i < numeroIntroducido; i++) {
            boolean es_primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    es_primo = false;
                    break;
                }
            }
            if (es_primo){
                System.out.println("Los numeros primos son "+ i);
            }
        }
    }
}
