package U7.T1;

import javax.print.DocFlavor;
import java.io.Serializable;
import java.util.*;

/*Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán por
orden alfabético en una colección que no permita repeticiones. Mostrar luego la lista de nombres por
pantalla.*/
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un nombre: ");
        Set<String> setNombres = new TreeSet<>(new ordenacionPorOrdenAlfabetico());
        String nombre = teclado.nextLine();
        setNombres.add(nombre);
        do {
            boolean es_anadido = false;
            System.out.print("Dime un nombre: ");
            nombre = teclado.nextLine();
            if (!nombre.equalsIgnoreCase("fin")){
                es_anadido=setNombres.add(nombre);
            }
            if (!es_anadido){
                System.out.println("No ha sido añadido, dime otro nombre por favor.");
            }
        }while(!nombre.equalsIgnoreCase("fin"));
        System.out.println(setNombres);
    }
}
