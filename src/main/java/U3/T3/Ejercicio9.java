package U3.T3;
import java.util.Scanner;

//Realizar un programa que realice lo siguiente:
//
//a) Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
//b) Mostrar por consola su capacidad y longitud.
//c) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser
// "Chicharrones de Chiclana" y mostrarla por consola.
//d) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser
// "Hay 5000 Chicharrones" y mostrarla por consola. El número entero 5000 debe estar almacenado en un int inicialmente.
//e) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser
// "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
//f) Almacenar en un String los últimos 4 carácteres del StringBuilder resultante y mostrar ese String por consola.
//g) Mostrar por  consola  la capacidad y longitud del StringBuilder final.
//h) Realizar el mismo ejercicio con la clase StringBuffer.
//
//Ejemplo de ejecución:
//
//El StringBuilder es : Alabí Alixar
//Capacidad inicial = 29
//Longitud inicial = 12
//Chicharrones
//Hay 5000 Chicharrones
//Hay 5000 Chicharrones en Chiclana
//lana
//Capacidad final = 34
//Longitud final = 34
//
//
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        StringBuilder alabi = new StringBuilder("Alabí Alixar");

        System.out.println(alabi);

        int capacidad = alabi.capacity();
        System.out.println("Capacidad del StringBuilder: "+ capacidad);
        int longitudAlabi = alabi.length();
        System.out.println("Longitud del StringBuilder: "+ longitudAlabi);

        int numeroChiclana = 5000;

        alabi.replace(0,longitudAlabi,"Chicharrones de Chiclana");
        System.out.println(alabi);

        alabi.insert(0, "Hay");
        alabi.insert(3," "+numeroChiclana+" ");
        System.out.println(alabi);





    }
}
