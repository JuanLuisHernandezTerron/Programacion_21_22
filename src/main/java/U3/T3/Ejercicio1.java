package U3.T3;

import java.util.Scanner;

//Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la primera palabra: ");
        String palabra1 = teclado.nextLine();

        System.out.print("Dime la segunda palabra: ");
        String palabra2 = teclado.nextLine();

        calcularPalabramax(palabra1,palabra2);
    }

    static void calcularPalabramax (String palabra1, String palabra2){

        int tamañoPalabra1 = palabra1.length();

        int tamañoPalabra2  = palabra2.length();

        if (tamañoPalabra1 < tamañoPalabra2){
            System.out.println("La palabra "+ palabra1 + " es la que tiene menor tamaño con "+ tamañoPalabra1 + " caracteres");
        }else if (tamañoPalabra2 < tamañoPalabra1){
            System.out.println("La palabra "+ palabra2 + " es la que tiene mayor tamaño con " +tamañoPalabra2 + " caracteres");
        }else{
            System.out.println("Las dos palabras son iguales");
        }
    }
}
