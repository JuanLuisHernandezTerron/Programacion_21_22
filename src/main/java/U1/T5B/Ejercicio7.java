package U1.T5B;
import java.util.Scanner;
//Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double notasSumadas= 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Dime 3 notas por favor");
            double notas = teclado.nextDouble();
            notasSumadas = notasSumadas + notas;
        }
        float notaMedia = (float) (notasSumadas / 3);
        System.out.println("La media es: " + notaMedia);

        if ( notaMedia < 5){
            System.out.println("La nota en el boletin es SUSPENSA");
        }else if ((notaMedia >= 5) && (notaMedia < 6)){
            System.out.println("La nota en el boletin es SUFICIENTE");
        }else if ((notaMedia >= 6) && (notaMedia < 7)){
            System.out.println("La nota en el boletin es BIEN");
        }else if ((notaMedia >= 7) && (notaMedia <= 9)){
            System.out.println("La nota en el boletin es NOTABLE");
        }else{
            System.out.println("La nota en el boletin es SOBRESALIENTE");
        }
    }
}
