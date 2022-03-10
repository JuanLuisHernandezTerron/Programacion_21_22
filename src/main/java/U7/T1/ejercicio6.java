package U7.T1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán en
una colección, de forma que se conserve el orden de inserción y que no puedan repetirse.
Mostrar la estructura por pantalla.*/
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un nombre: ");
        String nombre = teclado.nextLine();
        ArrayList <String> arrayNombres = new ArrayList<>();
        boolean estaCopiado = false;
        arrayNombres.add(nombre);
        int contador = 0;
        int contadorAUX = 0;
        do {
            System.out.print("Dime un nombre: ");
            nombre = teclado.nextLine();
            contadorAUX =0;
            contador =0;
            for (int i = 0; i < arrayNombres.size(); i++) {
                estaCopiado = false;
                    if (arrayNombres.get(i).equalsIgnoreCase(nombre)){
                        contador++;
                        if (contador == 2) {
                            estaCopiado = true;
                        }
                    }
                if (estaCopiado){
                    arrayNombres.remove(arrayNombres.size()-1);
                    System.out.print("El nombre "+ nombre+" esta repetido, dime un nombre de nuevo que no esté repetido, ");
                    System.out.println("Estos son los nombres que hay actualmente:");
                    for (String nombres:arrayNombres) {
                        System.out.println(nombres);
                    }
                    nombre = teclado.nextLine();
                    arrayNombres.set(i,nombre);
                }else{
                    if (contadorAUX <1) {
                        arrayNombres.add(nombre);
                        contadorAUX++;
                    }
                }
            }
        } while (!nombre.equalsIgnoreCase("fin"));
        arrayNombres.remove(arrayNombres.size()-1);
    }
}
