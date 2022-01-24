package U4.ejerciciosRepaso.Entregable19_20;

public class mainPizzeria {
    public static void main(String[] args) {
        pizza pizza1 = new pizza();
        pizza pizza2 = new pizza(pizza.tamanoPizza.MEDIANA);

        for(pizza.tamanoPizza pizza: pizza.tamanoPizza.values()){
            System.out.println("El tamaño puede ser: "+pizza);
        }



    }
}
