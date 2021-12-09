package U3.U3_Entregable;

import java.util.Scanner;

//Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a adivinar y
// el resultado parcial) y un carácter a buscar en la cadena a adivinar. Debe devolver el resultado de
// encontrar ese character en la cadena a adivinar.
//
//        La función tendrá el siguiente prototipo:
//
//public static String palabraAhorcado(String a, String b, char c)
//        En el programa principal, se debe pedir al usuario que introduzca una palabra a
//        adivinar y un carácter a buscar en la cadena. Se pedirá caracteres hasta que se consiga
//        adivinar la palabra completa.
//
//        NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños,
//        además será en minúsculas para simplificar el ejercicio.
//
//        Ejemplo:
//
//        palabraAhorcado("programacion","------------",'o') debe devolver "--o-------o-"
//        palabraAhorcado("programacion","--o-------on",'a') debe devolver "--o--a-a--o-"
//        palabraAhorcado("hola","----",'x') debe devolver "----"
public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una palabra");
        String palabra = teclado.nextLine();
        String guiones = "";
        int contadorLetras = 0;


        for (int i = 0; i < palabra.length(); i++) {
            guiones = guiones + "-";
        }
        while (contadorLetras != palabra.length()) {
            System.out.println("Que letras quieres sacar: ");
            char letra = teclado.next().charAt(0);
            contadorLetras ++;
            guiones = palabraAhorcado(palabra,guiones,letra);
            System.out.println(guiones);
        }

    }
    public static String palabraAhorcado(String a, String b, char c){
        StringBuilder fraseFinal = new StringBuilder(b);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c){
                fraseFinal.setCharAt(i,c);
            }
        }
        return String.valueOf(fraseFinal);
    }



}
