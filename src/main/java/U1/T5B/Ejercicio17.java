package U1.T5B;
import java.util.Scanner;
//Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten
// números de hasta 5 cifras.
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Dime un numero entero: ");
    int numeroIntroducido = teclado.nextInt();

    int numeroPequeño = numeroIntroducido /10;
    int numeroMediano = numeroIntroducido /100;
    int numeroMayor = numeroIntroducido /10000;

    if (numeroIntroducido < 100){
      System.out.println(numeroPequeño);
    }else if (numeroIntroducido < 1000){
      System.out.println(numeroMediano);
    }else{
      System.out.println(numeroMayor);
    }
  }
}
