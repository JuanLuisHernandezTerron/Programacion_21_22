package U7.T3B.ejercicio4;
// Crea una clase llamada Traductor, que contenga un atributo llamado "diccionario" de tipo HashMap y se
// comporte de esta forma:
//
//Al crear el objeto Traductor, el atributo diccionario debe ser cargado con la información de un
// archivo de texto cuyo nombre se le pasará por parámetro al constructor. Este archivo debe contener
// varias palabras en español y su traducción al inglés, de tal forma que las palabras en español sean
// la clave, y las que estén en inglés, el valor. Por ejemplo:
//
//hola, hello
//
//mundo, world
//
//gracias, thanks
//
//adios, bye
//
//Crear un método que reciba una palabra o una frase, y devuelva la cadena traducida al inglés.
public class ejercicio4 {
    public static void main(String[] args) {
        Traductor t1 = new Traductor("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U7/T3B/ejercicio4/palabrasTraduc");
        System.out.println(t1);
        t1.traducirFrasePalabra("hola");
    }
}
