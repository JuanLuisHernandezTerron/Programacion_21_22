package U4.T2.Actividad2;

import java.util.Arrays;

public class mainPila {
    public static void main(String[] args) {
    pilaTabla pila1= new pilaTabla();

    pila1.apilar();
    pila1.apilar();
    pila1.apilar();
    pila1.apilar();
    pila1.apilar();
    System.out.println("El numero de la cima "+pila1.cima());
    System.out.println(Arrays.toString(pila1.getArrayInteger()));
    pila1.desapilar();
    System.out.println("El numero de la cima "+pila1.cima());
    System.out.println(Arrays.toString(pila1.getArrayInteger()));
    }
}
