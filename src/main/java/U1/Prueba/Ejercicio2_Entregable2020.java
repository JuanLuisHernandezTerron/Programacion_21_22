package U1.Prueba;

import java.util.Scanner;

//Realizar un programa que  solicite al usuario un número entero y que lo
// siga solicitando mientras ese número no sea positivo.
//
//Una vez hecho esto solicitará al usuario una posición de inicio y una
// posición de final y mostrará el número habiéndole quitado todos los dígitos entre esas dos posiciones.
// (Supondremos que el usuario es "bueno" y mete correctamente las posiciones y que la primera posición es
// la posición 0.
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
public class Ejercicio2_Entregable2020 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int numeroIntoducido = teclado.nextInt();
        System.out.println("Dime la primera posicion: ");
        int posicion1 = teclado.nextInt();
        System.out.println("Dime la segunda posicion: ");
        int posicion2 = teclado.nextInt();

        int cociente = numeroIntoducido;
        int resto = 0;
        int numeroAux = 0;
        int contador = 0;
        int numeroFuera = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente / 10;
            numeroAux = numeroAux + resto;
            numeroAux = numeroAux * 10;
        }
        numeroAux = numeroAux /10;

        while ( numeroAux > 0){
            resto = numeroAux % 10;
            numeroAux = numeroAux /10;
            if ((posicion1 <= contador) && (posicion2 >= contador)){
                numeroFuera = numeroFuera + resto;
            }else{
                cociente = cociente + resto;   //Si lo ponemos a fuera, nos estaría sacando el numero entero.
                cociente = cociente * 10;
            }
            contador ++;
        }
        System.out.print(cociente/10);
    }
}


