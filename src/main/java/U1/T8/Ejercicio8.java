package U1.T8;
//Pedir un número y calcular su factorial.
//
//Ejemplo: Factorial de 5:
//
//5! = 5x4x3x2x1 = 120
import  java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numero = teclado.nextInt();
        int factorial = 1;                      //La variable factorial es 1 ya que si es 0 siempre sería 0, esta variable guarda los resultados de la multiplicacion de abajo
                                                //de factorial * i.
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
