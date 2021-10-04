package U1.T5B;

import java.util.Scanner;

//La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una bandera es de un céntimo de
//euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas.
//
//Ejemplo 1:
//Introduzca la altura de la bandera en cm: 20
//Ahora introduzca la anchura: 35
//¿Quiere escudo bordado? (s/n): n
//Gracias. Aquí tiene el desglose de su compra.
//Bandera de 700 cm2: 7,00 €
//Sin escudo: 0,00 €
//Gastos de envío: 3,25 €
//Total: 10,25 €
//
//
//Ejemplo 2:
//Introduzca la altura de la bandera en cm: 10
//Ahora introduzca la anchura: 15
//¿Quiere escudo bordado? (s/n): s
//Gracias. Aquí tiene el desglose de su compra.
//Bandera de 150 cm2: 1,50 €
//Con escudo:2,50 €
//Gastos de envío:3,25 €
//Total:7,25
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura de la bandera en cm: ");
        int altura = teclado.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        int anchura = teclado.nextInt();
        System.out.print("Quieres que el escudo tenga borde? (si/no): ");
        String bordado = teclado.next();
        System.out.println("Gracias. Aqui tienes el desglose de su compra.");

        int metrosCuadrados = altura * anchura;
        double cmAeuros  = metrosCuadrados * 0.01;
        double escudos = cmAeuros + 2.50;
        double gastoEnvio = 3.25;

        if (bordado.equals("si")){
            System.out.println("Bandera de "+ metrosCuadrados + " cm2 "+ " tendría un costo de: "+ cmAeuros);
            System.out.println("Con escudo el precio : "+escudos);
            System.out.println("Total: "+ (escudos + gastoEnvio));
        }else if (bordado.equals("no")){
            System.out.println("Bandera de "+ metrosCuadrados + " cm2 "+ " tendría un costo de: "+ cmAeuros);
            System.out.println("Como no has introducido escudo no se te incluye.");
            System.out.println("Total: "+ (cmAeuros + gastoEnvio));
        }
    }
}
