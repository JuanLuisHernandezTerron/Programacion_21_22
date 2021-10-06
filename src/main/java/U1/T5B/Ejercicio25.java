package U1.T5B;

import java.util.Scanner;

//Realiza un programa que calcule el precio de un desayuno. El programa preguntará primero qué ha tomado el usuario de
// comer: palmera, donut o pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo,
// el programa debe preguntar además si era con aceite o con tortilla; el primero vale 1’20 € y el segundo 1’60 €.
// Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20 respectivamente.
//
//Ejemplo 1:
//¿Qué ha tomado de comer? (palmera, donut o pitufo): palmera
//¿Qué ha tomado de beber? (zumo o café): café
//Palmera: 1,40 €
//Café: 1,20 €
//Total desayuno: 2,60 €
//
//Ejemplo 2:
//¿Qué ha tomado de comer? (palmera, donut o pitufo): pitufo
//¿Con qué se ha tomado el pitufo? (aceite o tortilla): tortilla
//¿Qué ha tomado de beber? (zumo o café): zumo
//Pitufo con tortilla: 1,60 €
//Zumo: 1,50 €
//Total desayuno: 3,10 €

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Que has tomado de primero: ");
        String primerPlato = teclado.next();
        System.out.print("Que has tomado de beber: ");
        String bebidaTomada = teclado.next();

        double precioPrimerplato = 0;
        double precioBebida = 0;

        if (primerPlato.equals("palmera")){
            precioPrimerplato = 1.40;
        }else if (primerPlato.equals("donut")) {
            precioPrimerplato = 1.00;
        }

        if (primerPlato.equals("pitufo")){
            System.out.print("El pitufo era con aceite o tortilla? ");
            String escogerPitufo = teclado.next();
                if (escogerPitufo.equals("tortilla")){
                    precioPrimerplato = 1.20;
                }else if (escogerPitufo.equals("aceite")){
                    precioPrimerplato = 1.60;
                }
        }

        if (bebidaTomada.equals("zumo")){
            precioBebida = 1.50;
        }else if (bebidaTomada.equals("café")){
            precioBebida = 1.20;
        }
        System.out.println("El total del desayuno es: "+ (precioPrimerplato + precioBebida));
    }
}
