package U1.U1_Entregable;

import java.util.Scanner;

//La hamburguesería Pitanza Feliz quiere se informatice su empresa. Realiza un programa que calcule el
// precio de unos pedidos en función del número de hamburguesas y del día en el que se haga.
//
//El precio de la hamburguesa básica con los ingredientes mínimos (pan, carne, queso) es de 3 euros.
// La hamburguesa gourmet cuesta 5 euros, porque tiene carne de Waygu, pan artesano y queso de oveja.
//
//Los martes locos de Pitanza Feliz, un pedido de dos gourmet cuesta 9 euros, y los miércoles de desmadre,
// la hamburguesa básica cuesta 2 euros.
//
//Perteneciendo al club Fanegas de Pitanza Feliz, se obtiene un 12% de descuento sobre el precio final
// del pedido.
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número de hamburguesas básicas: ");
        int numeroHamburguesas = teclado.nextInt();

        System.out.print("Numero de hamburguesas gourmet: ");
        int hamburguesasGourmet = teclado.nextInt();

        System.out.println("Que día de la semana es: ");
        String diaSemana = teclado.next();

        System.out.println("Perteneces al clubFabregas: ");
        String clubFabregas = teclado.next();

        int precioFinal = 0;
        int precioHamburguesa = 0;
        int precioHamburguesaGourmet = 10;
        int precioHamburguesaNormal = 0;
        float descuento = 0;


        if (diaSemana.equalsIgnoreCase("martes")){
            if (hamburguesasGourmet == 2){
                precioHamburguesa = precioHamburguesa + 9;
            }else if( hamburguesasGourmet > 2){
                precioHamburguesa =precioHamburguesaGourmet * hamburguesasGourmet;
            }else{
                precioHamburguesa = precioHamburguesa + precioHamburguesaGourmet;
            }

            if (numeroHamburguesas > 0){
                precioHamburguesaNormal = precioHamburguesa + 3;
            }

            precioFinal = precioHamburguesaGourmet + precioHamburguesaNormal;
            if (clubFabregas.equalsIgnoreCase("Si")){
                descuento = (float) (precioFinal * 0.12);
            }
            System.out.println("Aqui tienes su pedido.");
            System.out.println("Hamburguesas Basica:" + numeroHamburguesas);
            System.out.println("Hamburguesas Gourmet:" + hamburguesasGourmet);
            System.out.println("Total: "+precioFinal);

        }else if ((diaSemana.equalsIgnoreCase("Miercoles"))){

        }else{

        }
    }
}
