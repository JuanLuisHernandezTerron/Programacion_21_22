package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

//Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada clase está
// compuesta por 5 alumnos. Se pide leer las notas (números enteros) de cada uno de los alumnos en el primer trimestre,
// luego, las del segundo, y luego, las del tercero. Debemos mostrar, al final, la nota media del grupo en cada
// trimestre, y la media del alumno que se encuentra en la posición pos (que se lee por teclado). (Podéis hacerlo usando
// 3 vectores -uno por trimestre-, o usando una matriz bidimensional en la que las filas sean los trimestres y las
// columnas los alumnos).
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el numero de alumno que quieres saber su nota media: ");
        int numeroAlumno = teclado.nextInt();
        int notasSumar =0;
        System.out.println("Notas del primer trimestre");
        int []primerTrimestre = introducirNumeros(teclado);
        System.out.println("Notas del segundo trimestre");
        int []segundoTrimestre = introducirNumeros(teclado);
        System.out.println("Notas del tercer trimestre");
        int []tercerTrimestre = introducirNumeros(teclado);

        System.out.println(Arrays.toString(primerTrimestre));
        System.out.println(Arrays.toString(segundoTrimestre));
        System.out.println(Arrays.toString(tercerTrimestre));

        System.out.println("La nota media del grupo en el primer trimestre es:" + funcionmediaGrupo(primerTrimestre));
        System.out.println("La nota media del grupo en el segundo trimestre es:" + funcionmediaGrupo(segundoTrimestre));
        System.out.println("La nota media del grupo en el tercer trimestre es:" + funcionmediaGrupo(tercerTrimestre));

        double notaMediaAlumno = (primerTrimestre[numeroAlumno -1] + segundoTrimestre[numeroAlumno-1] + tercerTrimestre[numeroAlumno -1]) /3;
        System.out.println("La nota del alumno : " + numeroAlumno + " es: " + notaMediaAlumno);

    }

    private static double funcionmediaGrupo(int[] arrayTrimestres) {
        double sumaNotas = 0;
        double notaFinal = 0;
        for (int i = 0; i < arrayTrimestres.length; i++) {
            sumaNotas = arrayTrimestres[i] + sumaNotas;
        }

        notaFinal = sumaNotas/arrayTrimestres.length;
        return notaFinal;
    }

    private static int[] introducirNumeros(Scanner teclado) {  //Esta funcion rellena array
        int[] arrayVacio = new int [5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Dime la nota del alumno " + (i+1) + " :");
            int notas = teclado.nextInt();

            arrayVacio[i] = notas;
        }
        return  arrayVacio;
    }
}
