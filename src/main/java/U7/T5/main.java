package U7.T5;


import java.io.Serializable;
import java.util.Scanner;

public class main implements Serializable {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int respuestaINT;
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1. Introducir datos de aspirantes");
            System.out.println("2. Calificar prueba");
            System.out.println("3. Aprobados");
            System.out.println("4. Salir");
            respuestaINT = teclado.nextInt();

            switch (respuestaINT){
                case 1:
                    introducirAspirantes.introducirAspi();
                    introducirAspirantes.guardarFicheros();
                    break;
                case 2:
                    CalificacionPruebas.cargarIDs();
                    CalificacionPruebas.calificarPrueba();
                    CalificacionPruebas.guardarFicheros();
                    break;
                case 3:

                    break;
            }
        }while (respuestaINT != 4);
    }


}
