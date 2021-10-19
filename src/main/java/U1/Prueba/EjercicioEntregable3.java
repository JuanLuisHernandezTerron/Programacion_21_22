package U1.Prueba;

import java.util.Scanner;

// Escribe un programa que sea capaz de insertar un dígito dentro de un número
//indicando la posición. El nuevo dígito se colocará en la posición indicada y el
//resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
//izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
//correctamente los datos. Se recomienda usar long en lugar de int ya que el
//primero admite números más largos.
//
//Ejemplo:
//Por favor, introduzca un número entero positivo: 406783
//Introduzca la posición donde quiere insertar: 3
//Introduzca el dígito que quiere insertar: 5
//El número resultante es 4056783.
public class EjercicioEntregable3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el numero que quieres insertar: ");
        long numeroIntroducido = teclado.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int posicion = teclado.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        int digitoIntroducir = teclado.nextInt();

        long cociente = numeroIntroducido;
        long resto = 0;
        long numeroAux = 0;
        int contador = 0;

        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAux = numeroAux + resto;
            numeroAux = numeroAux * 10 ;

        }

        while (numeroAux > 0){
            resto = numeroAux % 10;
            numeroAux = numeroAux /10;
            cociente = cociente + resto;
            cociente = cociente * 10 ;
            if (contador==posicion){
                cociente = cociente + digitoIntroducir;
                cociente = cociente * 10 ;
            }
            contador++;
        }
        System.out.print(cociente/10);
    }
}
