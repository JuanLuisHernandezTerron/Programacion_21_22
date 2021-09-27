package U1.T8;
//Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto. Para ello
// se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1. Los árboles se
// identifican mediante etiquetas con números correlativos, comenzando en 0.
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double cmArboles = 0;
        double arbolAlto = 0;
        int arbolAux = 0;

        System.out.println("Dime las altura de los arboles");
        cmArboles = teclado.nextDouble();
        while (cmArboles != -1){
            arbolAux++;

            if (cmArboles > arbolAlto){
                arbolAlto = cmArboles;
            }
            System.out.println("Dime las altura de los arboles");
            cmArboles = teclado.nextDouble();
        }
        System.out.println("El arbol mas alto es: "+ arbolAlto + " y  su etiqueta sería "+ arbolAux);
    }
}
