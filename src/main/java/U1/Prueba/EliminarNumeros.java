package U1.Prueba;

import java.util.Scanner;

//Realizar un programa que  solicite al usuario un número entero y que lo siga solicitando mientras ese número no sea positivo.
//
//Una vez hecho esto solicitará al usuario una posición de inicio y una posición de final y mostrará el número habiéndole quitado todos los dígitos entre esas dos posiciones. (Supondremos que el usuario es "bueno" y mete correctamente las posiciones y que la primera posición es la posición 0.
//
//Ejemplo 1:
//
//Introduce el número: 1234567
//
//Posición inicial: 2
//
//Posición final: 4
//
//El número resultante es: 1267
//
//Ejemplo 2:
//
//Introduce el número: 123456789
//
//Posición Inicial: 5
//
//Posición final: 7
//
//El número resultante es: 123459
public class EliminarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero entero: ");
        int numeroIntroducido = teclado.nextInt();

        System.out.print("Dime la posicion inicial: ");
        int posicion1 = teclado.nextInt();

        System.out.print("Dime la segunda inicial: ");
        int posicion2 = teclado.nextInt();

        int cociente = numeroIntroducido;
        int resto = 0;
        int numeroAUX = 0;
        int numeroBorrar = 0;
        int contador = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX * 10;
        }

        numeroAUX = numeroAUX /10;

        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX = numeroAUX / 10;

                if ((posicion1<=contador) && (posicion2 >= contador)){
                    numeroBorrar = numeroBorrar + resto;
                }else{
                    cociente = cociente + resto;
                    cociente = cociente * 10;
                }
            contador ++;
        }
        System.out.println(cociente/10);
    }
}
