package U1.T5B;

import java.util.Scanner;

//Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas.
// El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate.
//
//La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta de chocolate,
// el programa debe preguntar además si el chocolate es negro o blanco; la
// primera opción vale 14 euros y la segunda 15. Por último se pregunta si se añade nata
// y si se personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
//
//Ejemplo 1:
//Elija un sabor (manzana, fresa o chocolate): chocolate
//¿Qué tipo de chocolate quiere? (negro o blanco): negro
//¿Quiere nata? (si o no): si
//¿Quiere ponerle un nombre? (si o no): no
//Tarta de chocolate negro: 14,00 €
//Con nata: 2,50 €
//Total: 16,50 €
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime de que sabor quieres la tarta: ");
        String tipoTarta = teclado.next();
        System.out.print("Quieres nata? ");
        String nata = teclado.next();
        System.out.print("Quieres ponerle un nombre? ");
        String nombre = teclado.next();

        double valortarta = 0;
        double valorNata = 2.50;
        double valorNombre = 2.75;

        if (tipoTarta.equals("manzana")){
            valortarta = 18 + valortarta;
        }else if (tipoTarta.equals("chocolate")){
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            String tipoChocolate = teclado.next();
                if (tipoChocolate.equals("negro")){
                    valortarta = 14 + valortarta;
                }else if (tipoChocolate.equals("blanco")){
                    valortarta = 15 + valortarta;
                }
        }else if (tipoTarta.equals("fresa")){
            valortarta = 16 + valortarta;
        }

        if (nata.equals("si") && nombre.equals("si")){
            System.out.println("El total sería: "+ (valortarta + valorNata + valorNombre));
        }else if (nata.equals("si") && nombre.equals("no")){
            System.out.println("El total sería: "+ (valortarta + valorNata));
        }

        if (nata.equals("no") && nombre.equals("no")){
            System.out.println("El total sería: "+ valortarta);
        }else if(nata.equals("no") && nombre.equals("si")){
            System.out.println("El total sería: "+ (valortarta + valorNombre));
        }
    }
}
