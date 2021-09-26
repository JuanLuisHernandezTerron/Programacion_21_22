package U1.T8;
//Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
// Se introducirán las edades de los alumnos hasta que una de ellas sea negativa. La aplicación mostrará la suma de las
// edades, la media de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Cuando utilicemos contadores (datos que queramos guardar y que no se reinicien, por si lo utilizamos mas
        // adelante) en bucles es obligatorio declararlos afuera.
        int edadAlumno = 0;
        int contador_alumnos = 1;
        int sumaEdades = 0;
        int mayor_edad = 0;

        while (edadAlumno >= 0){
            System.out.print("Dime las edades ");
            edadAlumno = teclado.nextInt();


            sumaEdades = edadAlumno + sumaEdades;
            int mediaAlumnos = edadAlumno / contador_alumnos;



            if (edadAlumno >= 18){
                mayor_edad ++;
            }

            System.out.println("La suma de las edades es " + sumaEdades);
            System.out.println("La media de las edades es " + mediaAlumnos);
            System.out.println("Hay " + mayor_edad + " mayores de edad");

            contador_alumnos ++; //He puesto el contador de alumnos abajo ya que esta por defecto 1 y si estuviese
                                // arriba sería 2 y no cuadraría bien los calculos.
        }
    }
}
