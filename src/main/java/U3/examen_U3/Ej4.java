package U3.examen_U3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//Crea una función con la siguiente cabecera:
//
//public String convierteEnPalabras(int n)
//Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en
// una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:
//
//cuatro, siete, cero, dos, uno, tres
//Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe
//mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate que hay una coma
// detrás de cada palabra salvo al final.
public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime el numero que quieres traducir a texto:");
        int n = teclado.nextInt();
        System.out.println(convierteEnPalabra(n));
    }

    public static String  convierteEnPalabra(int n) {
        int cociente = n;
        int resto = 0;
        int numeroAUX = 0;
        String numeroTraducido = "";
        while (cociente > 0) {
            resto = cociente % 10;
            cociente = cociente / 10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX *10;
        }
        numeroAUX = numeroAUX /10;
        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX = numeroAUX /10;
                if (resto > 0){
                    switch (resto){
                        case 0: numeroTraducido = numeroTraducido +"cero,";
                        break;
                        case 1: numeroTraducido = numeroTraducido +"uno,";
                        break;
                        case 2: numeroTraducido = numeroTraducido +"dos,";
                        break;
                        case 3: numeroTraducido = numeroTraducido +"tres,";
                        break;
                        case 4: numeroTraducido = numeroTraducido +"cuatro,";
                        break;
                        case 5: numeroTraducido = numeroTraducido +"cinco,";
                        break;
                        case 6: numeroTraducido = numeroTraducido +"seis,";
                        break;
                        case 7: numeroTraducido = numeroTraducido +"siete,";
                        break;
                        case 8: numeroTraducido = numeroTraducido +"ocho,";
                        break;
                        case 9: numeroTraducido = numeroTraducido +"nueve,";
                        break;
                    }
                }
        }
        numeroTraducido = numeroTraducido.substring(0,numeroTraducido.length()-1);
        return numeroTraducido;
    }

}
