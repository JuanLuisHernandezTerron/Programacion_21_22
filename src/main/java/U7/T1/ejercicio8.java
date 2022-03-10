package U7.T1;
/*Implementar una función a la que se le pase una lista de nombres y devuelva una copia sin elementos
repetidos (sin modificar la original), con el prototipo:*/

import java.util.*;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List <String> arrayString = new ArrayList<>();
        System.out.print("Dime un nombre ");
        String nombre = teclado.nextLine();
        arrayString.add(nombre);
        do {
            System.out.print("Dime un nombre: ");
            nombre = teclado.nextLine();
            arrayString.add(nombre);
        }while (!nombre.equalsIgnoreCase("fin"));
        arrayString.remove(arrayString.size()-1);
        List <String> listaAUX = new ArrayList<>(eliminaRepetidos(arrayString));
        System.out.println(listaAUX);
    }

    private static List eliminaRepetidos(List arrayAUX) {
        Set <String> setNombres = new TreeSet<>(arrayAUX);
        return new ArrayList<>(setNombres);
    }
}
